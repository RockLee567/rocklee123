package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.SinhVienDAO;



@WebServlet( urlPatterns= { "/xoasinhvien" } )
public class DeleteSinhVien extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String maSV_raw = (String)req.getAttribute( "ID_SVpara" ); 
    	int maSV = 0; 
    	try {
    		maSV = Integer.parseInt( maSV_raw ); 
    	} catch( Exception e ) {
    		System.out.println( "DeleteSinhVien doGet()" ); 
    		System.out.println( e );
    	}
    	
    	SinhVienDAO svDAO = new SinhVienDAO(); 
    	svDAO.deleteSinhVien( maSV ); 
    	req.getRequestDispatcher( "sinhvien" ).forward( req , resp );
    	
    	
    	
    	
    }
}
