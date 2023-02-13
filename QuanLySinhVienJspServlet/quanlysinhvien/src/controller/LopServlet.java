package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.LopDAO;
import model.Lop;

@WebServlet( urlPatterns= { "/lop" } )
public class LopServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
        String maLop =""; 
        if( req.getAttribute( "ID" ) != null ) {
        	maLop = (String)req.getAttribute("ID"); 
        	getServletContext().setAttribute( "ID_Lop" ,  maLop ); 
        }
        else {
        	maLop = (String)getServletContext().getAttribute( "ID_Lop" ); 
        }
        LopDAO lDAO = new LopDAO();
        Lop l = lDAO.getLopByID_Lop(maLop);
        //req.setAttribute(  , o); 
        
        
        
        
    }
}
