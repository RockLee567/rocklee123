package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.KhoaDAO;




@WebServlet( urlPatterns= { "/xoakhoa" }  )
public class DeleteKhoa extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String maKhoa = (String)req.getAttribute( "ID_Khoa_para" ); 
    	
    	KhoaDAO kDAO = new KhoaDAO(); 
    	kDAO.deleteKhoa(maKhoa);
    	
    	req.getRequestDispatcher( "khoa" ).forward( req , resp );
    	
    	
    }
}
