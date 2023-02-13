package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.BangDiemDAO;


@WebServlet( urlPatterns={ "/xoabangdiem" } )
public class DeleteBangDiem  extends HttpServlet  {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	String maBD_raw = (String)req.getAttribute("ID_BDpara" ); 
    	
     	int maBD = 0; 
    	try {
    		maBD = Integer.parseInt( maBD_raw ); 
    		BangDiemDAO bdDAO = new BangDiemDAO(); 
    		bdDAO.xoaBangDiem(maBD); 
    		
    	} catch( Exception e ) {
    		System.out.println( "DeleteBangDiem doGet()" );
    		System.out.println( e );
    	}
    	
    	req.getRequestDispatcher( "bangdiem" ).forward( req ,  resp );  
    }
}
