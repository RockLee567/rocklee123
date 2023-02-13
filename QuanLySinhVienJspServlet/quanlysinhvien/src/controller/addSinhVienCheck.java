package controller;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.SinhVienDAO;


@WebServlet( urlPatterns= { "/themsinhviencheck" }  )
public class addSinhVienCheck extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html;charset=UTF-8");
    	req.setCharacterEncoding("UTF-8");
    	
    	
    	String maSV_raw = new String( req.getParameter( "ID_SV" ).getBytes("iso-8859-1"), "utf-8"); 
    	String tenSV =  new String( req.getParameter( "Ten_SV" ).getBytes("iso-8859-1"), "utf-8"); 
    	
    	String ngaySV =  new String( req.getParameter( "NgaySinh_SV" ).getBytes("iso-8859-1"), "utf-8"); 
    	String thangSV =  new String( req.getParameter( "ThangSinh_SV" ).getBytes("iso-8859-1"), "utf-8");
    	String namSV =  new String( req.getParameter( "NamSinh_SV" ).getBytes("iso-8859-1"), "utf-8");
    	String gioiTinhSV =  new String( req.getParameter( "GioiTinh_SV" ).getBytes("iso-8859-1"), "utf-8");
    	String queQuanSV =  new String( req.getParameter( "QueQuan_SV" ).getBytes("iso-8859-1"), "utf-8");
    	String sdtSV_raw =  new String( req.getParameter( "SDT_SV" ).getBytes("iso-8859-1"), "utf-8");
    	String emailSV =  new String( req.getParameter( "Email_SV" ).getBytes("iso-8859-1"), "utf-8");
    	String maLop = req.getParameter( "MaLop" );   
    	
    	 
    	int maSV = 0; 
    	int sdt = 0; 
    	boolean checkSV = true; 
    	try {
    		maSV = Integer.parseInt( maSV_raw ); 
    		sdt = Integer.parseInt( sdtSV_raw ); 
    	} catch( Exception e ) {
    		checkSV = false; 
    		System.out.println( "addSinhVien doPost()" );
    		System.out.println( e );
    	}
    	String NS = namSV + "-" + thangSV + "-" + ngaySV ; 
    	//String NS = ngaySV + "/" + thangSV + "/" + namSV ; 
    	/*
    	URLDecoder.decode( tenSV , "UTF-8"); 
    	URLDecoder.decode( NS , "UTF-8"); 
    	URLDecoder.decode( gioiTinhSV , "UTF-8"); 
    	URLDecoder.decode( queQuanSV , "UTF-8"); 
    	URLDecoder.decode( emailSV , "UTF-8"); 
    	URLDecoder.decode( maLop , "UTF-8"); 
    	*/ 
    	System.out.println( checkSV );
    	if( checkSV == false ) {
    		req.setAttribute( "errorSV" , "Kiểm tra lại Mã sinh Viên và Số điện thoại" );
    		req.getRequestDispatcher( "themsinhvien" ).forward( req , resp );
    	}
    	else {
    		SinhVienDAO svDAO = new SinhVienDAO(); 
        	svDAO.addSinhVien(maSV, tenSV, NS ,  gioiTinhSV , queQuanSV , sdt, emailSV , maLop);
        	
        	req.getRequestDispatcher( "sinhvien" ).forward( req , resp  );
    	}
    	
    	//resp.sendRedirect( "sinhvien" );  
    }
}
