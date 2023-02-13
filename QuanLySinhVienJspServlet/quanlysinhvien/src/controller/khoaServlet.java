package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.KhoaDAO;
import model.Khoa;



@WebServlet( urlPatterns={ "/khoa" } )
public class khoaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html;charset=UTF-8");
    	req.setCharacterEncoding( "UTF-8" ); 
    	resp.setCharacterEncoding( "UTF-8" ); 
        
    	
    	
    	KhoaDAO kDAO = new KhoaDAO(); 
    	req.setAttribute( "ListKhoa" , kDAO.listKhoa); 
    	
    	req.getRequestDispatcher( "khoa.jsp" ).forward( req , resp );
    }
}
