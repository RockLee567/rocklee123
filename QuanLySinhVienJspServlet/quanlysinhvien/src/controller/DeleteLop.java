package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.LopDAO;



@WebServlet( urlPatterns= { "/xoalop" }  )
public class DeleteLop extends HttpServlet {
    
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String maLop  =  (String)req.getAttribute( "ID_Lop_para" ); 
    	
    	LopDAO lDAO = new LopDAO(); 
    	lDAO.deleteLop(maLop); 
    	req.getRequestDispatcher( "chuyennganh" ).forward( req , resp );
    	
    }
    
}
