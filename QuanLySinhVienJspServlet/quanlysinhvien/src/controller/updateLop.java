package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.LopDAO;


@WebServlet( urlPatterns= { "/capnhatlop" } )
public class updateLop extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String maLop = req.getParameter( "ID_Lop" ); 
    	String tenLop = req.getParameter( "Ten_Lop" );
    	String maCN = req.getParameter( "ID_CN" ); 
    	
    	LopDAO lDAO = new LopDAO(); 
    	lDAO.updateLop(maLop, tenLop, maCN); 
    	
    	req.getRequestDispatcher( "chuyennganh" ).forward( req , resp ); 
    	
    }
}
