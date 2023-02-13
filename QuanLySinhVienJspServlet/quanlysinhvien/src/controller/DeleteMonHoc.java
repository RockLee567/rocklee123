package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.MonHocDAO;


@WebServlet( urlPatterns= { "/xoamonhoc" } )
public class DeleteMonHoc extends HttpServlet {
     
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String maMH = (String)req.getAttribute( "ID_MH_para" );
    	MonHocDAO mhDAO = new MonHocDAO(); 
    	if( mhDAO.deleteMonHoc(maMH) == false ) {
    		req.setAttribute( "errorXoaMonHoc" , "Môn học này đang được sử dụng");
    	}
    	//mhDAO.deleteMonHoc(maMH);
    	req.getRequestDispatcher( "monhoc" ).forward( req , resp  ); 
    }
    
}
