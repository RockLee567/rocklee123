package controller;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.KhoaDAO;
import model.Khoa;

@WebServlet( urlPatterns= { "/capnhapkhoa" }  )
public class updateKhoa extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html;charset=UTF-8");
    	resp.setCharacterEncoding("UTF-8");
    	
    	String maKhoa = (String)req.getAttribute( "ID" ); 
    	
    	KhoaDAO kDAO = new KhoaDAO(); 
    	Khoa k = kDAO.getKhoaByID_Khoa(maKhoa); 
    	req.setAttribute( "Khoa", k); 
    	
    	
    	boolean checkUpdateKhoa = false; 
    	req.setAttribute( "checkUpdateKhoa" , checkUpdateKhoa );
    	//KhoaDAO kDAO = new KhoaDAO(); 
    	req.setAttribute( "ListKhoa" , kDAO.listKhoa); 
    	
    	//req.getRequestDispatcher( "updateKhoa.jsp" ).forward( req , resp ); 
    	req.getRequestDispatcher( "khoa.jsp" ).forward( req , resp ); 
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	req.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html;charset=UTF-8");
    	resp.setCharacterEncoding("UTF-8");
    	
    	String maKhoa = req.getParameter( "maKhoa" ); 
    	String tenKhoa = req.getParameter( "tenKhoa" ); 
    	URLDecoder.decode( maKhoa , "UTF-8"); 
    	URLDecoder.decode( tenKhoa , "UTF-8"); 
    	KhoaDAO kDAO = new KhoaDAO(); 
    	kDAO.updateKhoa(maKhoa, tenKhoa);
    	
    	resp.sendRedirect( "khoa" );
    	
    }
}
