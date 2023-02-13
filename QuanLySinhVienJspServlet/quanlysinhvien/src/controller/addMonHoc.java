package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.MonHocDAO;


@WebServlet( urlPatterns= { "/themmonhoc" } )
public class addMonHoc extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	resp.setContentType("text/html;charset=UTF-8");
    	req.setCharacterEncoding("UTF-8");
    	
    	  
    	String maMH =  new String( req.getParameter( "maMH" ).getBytes("iso-8859-1"), "utf-8");
    	String tenMH =  new String( req.getParameter( "tenMH" ).getBytes("iso-8859-1"), "utf-8");
    	String soTin =   new String( req.getParameter( "soTinChi" ).getBytes("iso-8859-1"), "utf-8");
    	
    	MonHocDAO mhDAO = new MonHocDAO(); 
    	
    	
    	if( mhDAO.checkMonHoc(maMH) != null ) {
    		req.setAttribute( "errorThemMonHoc" , "Đã có môn này rồi" ); 
    	}
    	else {
    		mhDAO.appendMonHoc(maMH, tenMH, soTin); 
    	}
    	
    	
    	
    	req.getRequestDispatcher( "monhoc" ).forward( req ,  resp );
    	
    }
}
