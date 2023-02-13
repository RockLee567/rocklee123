package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.GiangVienDAO;



@WebServlet( urlPatterns= { "/xoagiangvien" } )
public class DeleteGiangVien extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String maGV = (String)req.getAttribute( "ID_GV_para" );
    	GiangVienDAO gvDAO = new GiangVienDAO(); 
    	if( gvDAO.deleteGiangVien(maGV) == false ) {
    		req.setAttribute( "errorXoaGiangVien" ,  "Giảng viên này đang được dùng" ); 
    	}
    	
    	req.getRequestDispatcher( "giangvien" ).forward( req , resp  );
    }
}
