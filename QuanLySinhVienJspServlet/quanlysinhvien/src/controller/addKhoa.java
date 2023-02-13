package controller;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.KhoaDAO;


@WebServlet( urlPatterns= { "/themkhoa" } )
public class addKhoa extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html;charset=UTF-8");
    	req.setCharacterEncoding( "UTF-8" ); 
    	resp.setCharacterEncoding( "UTF-8" ); 
    	
    	boolean checkAddKhoa = false; 
    	req.setAttribute( "checkAddKhoa" , checkAddKhoa );
    	
    	KhoaDAO kDAO = new KhoaDAO(); 
    	req.setAttribute( "ListKhoa" , kDAO.listKhoa); 
        req.getRequestDispatcher( "khoa.jsp" ).forward(req, resp);; 
    	
    	
    }
     
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html;charset=UTF-8");
     	req.setCharacterEncoding( "UTF-8" ); 
     	resp.setCharacterEncoding( "UTF-8" ); 
     	

     	String maKhoa =  req.getParameter("maKhoa") ;
     	URLDecoder.decode( maKhoa , "UTF-8");
     	
     	String tenKhoa =  req.getParameter("tenKhoa");
     	URLDecoder.decode(tenKhoa, "UTF-8");
     	
     	KhoaDAO kDAO = new KhoaDAO(); 
     	kDAO.addKhoa(maKhoa, tenKhoa);
     	resp.sendRedirect( "khoa" );
    }
}
