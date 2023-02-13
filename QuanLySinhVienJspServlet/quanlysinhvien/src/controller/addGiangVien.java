package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.GiangVienDAO;
import dal.MonHocDAO;


@WebServlet( urlPatterns= { "/themgiangvien" } )
public class addGiangVien extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html;charset=UTF-8");
    	req.setCharacterEncoding("UTF-8");
    	
    	  
    	String maGV =  new String( req.getParameter( "maGV" ).getBytes("iso-8859-1"), "utf-8");
    	String tenGV =  new String( req.getParameter( "tenGV" ).getBytes("iso-8859-1"), "utf-8");
    	String GT =   new String( req.getParameter( "gioiTinh" ).getBytes("iso-8859-1"), "utf-8");
    	
    	String DC =   new String( req.getParameter( "diaChi" ).getBytes("iso-8859-1"), "utf-8");
    	String SDT =   new String( req.getParameter( "SDT" ).getBytes("iso-8859-1"), "utf-8");
    	String Email =   new String( req.getParameter( "email" ).getBytes("iso-8859-1"), "utf-8");
    	
    	GiangVienDAO gvDAO = new GiangVienDAO(); 
    	int sdt = 0; 
        boolean check = true; 
    	try {
    		 sdt = Integer.parseInt( SDT ); 
    	} catch( Exception e ) {
    		check = false; 
    		
    		System.out.println( "addGiangVien doGet()" );
    		System.out.println( e );
    	}
    	
    	if( check == false ) {
    		req.setAttribute( "errorThemGiangVien" , "Số điện thoại sai" ); 
    	}
    	else if( gvDAO.checkGiangVien(maGV) != null ) {
    		req.setAttribute( "errorThemGiangVien" , "Đã có giảng viên này rồi" ); 
    	}
    	else {
    		gvDAO.appendGiangVien(maGV, tenGV, GT , DC , sdt , Email );
    	}
    	
    	
    	
    	req.getRequestDispatcher( "giangvien" ).forward( req ,  resp );
    }
}
