package controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.LopDAO;
import dal.SinhVienDAO;
import model.Lop;
import model.SinhVien;



@WebServlet( urlPatterns= { "/themsinhvien" } )
public class addSinhVien extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	resp.setContentType("text/html;charset=UTF-8");
    	req.setCharacterEncoding("UTF-8");
    	String maLop = ""; 
    	if( req.getAttribute( "ID_Lop_para" ) != null ) {
    		maLop = (String)req.getAttribute( "ID_Lop_para" ) ;
    		getServletContext().setAttribute( "ID_Lop" , maLop  );
    	}
    	else {
    		maLop = (String)getServletContext().getAttribute( "ID_Lop" ); 
    	}
    	
    	
    	/* vvvvvvvvvvv SinhVienServlet vvvvvvvvvvvvvvv */ 
    	
    	//maLop = (String)getServletContext().getAttribute( "ID_Lop" ); 
    	SinhVienDAO svDAO = new SinhVienDAO(); 
    	svDAO.getSinhVienByMaLop(maLop) ; 
    	 
    	List<SinhVien> listSV  = svDAO.listSinhVien;
    	if( listSV != null ) { 
    		req.setAttribute( "list" , svDAO.listSinhVien );
    	}
    	else {
    		req.setAttribute( "nullSV" , "Không có sinh viên" );
    	}
    	
    	LopDAO lDAO = new LopDAO(); 
    	Lop l = lDAO.getLopByID_Lop(maLop);
    	req.setAttribute( "lopK" , l );
    	
    	
    	boolean checkAddSinhVien = false; 
    	req.setAttribute( "checkAddSinhVien" , checkAddSinhVien );
    	
    	/* ^^^^^^^^^^^^ SinhVienServlet ^^^^^^^^^^^^^^ */ 
    	
    	
    	req.setAttribute( "ID_Lop_para" ,  maLop ); 
    	//req.getRequestDispatcher( "addSinhVien.jsp" ).forward( req , resp );
    	req.getRequestDispatcher( "sinhvien.jsp" ).forward( req , resp );
    	
    }
    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	
    	
    }
    
}
