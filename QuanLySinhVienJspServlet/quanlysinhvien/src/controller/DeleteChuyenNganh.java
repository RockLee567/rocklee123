package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.ChuyenNganhDAO;



@WebServlet( urlPatterns= { "/xoachuyennganh" } )
public class DeleteChuyenNganh extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String maCN = (String)req.getAttribute( "ID_CN_para" ); 
    	
    	ChuyenNganhDAO cnDAO = new ChuyenNganhDAO(); 
    	cnDAO.deleteChuyenNganh( maCN );
    	
    	req.getRequestDispatcher( "chuyennganh" ).forward( req , resp ); 
    	
    }
}
