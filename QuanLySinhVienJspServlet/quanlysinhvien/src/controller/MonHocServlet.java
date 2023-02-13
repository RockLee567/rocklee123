package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.MonHocDAO;


@WebServlet( urlPatterns= { "/monhoc" } )
public class MonHocServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	MonHocDAO mhDAO = new MonHocDAO(); 
    	mhDAO.showListMonHoc(); 
    	
    	
    	
    	req.setAttribute( "listMH" ,  mhDAO.listMonHoc );
    	req.getRequestDispatcher( "monHoc.jsp" ).forward( req , resp ); 
    }
}
