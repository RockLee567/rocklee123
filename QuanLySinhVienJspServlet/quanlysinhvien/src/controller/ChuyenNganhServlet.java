package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.ChuyenNganhDAO;
import dal.KhoaDAO;
import model.ChuyenNganh;
import model.Khoa;

@WebServlet( urlPatterns= { "/chuyennganh" } )
public class ChuyenNganhServlet extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 String maKhoa = ""; 
    	if( req.getAttribute( "ID" ) != null ) {
    		maKhoa = (String)req.getAttribute( "ID" ); 
    		getServletContext().setAttribute( "ID_Khoa" , maKhoa ); 
        	//req.setAttribute( "ID" , maKhoa); 
    	}
    	else {
    		maKhoa = (String)getServletContext().getAttribute( "ID_Khoa" ); 
    	}
    	
    	
    	
    	KhoaDAO kDAO = new KhoaDAO(); 
    	Khoa k = kDAO.getKhoaByID_Khoa( maKhoa ); 
    	getServletContext().setAttribute( "Ten_Khoa" , k.getTenKhoa() ); 
    	
    	ChuyenNganhDAO cnDAO = new ChuyenNganhDAO(); 
    	cnDAO.showChuyenNganh(maKhoa); 
    	List<ChuyenNganh> list = cnDAO.listChuyenNganh; 
    	
    	
    	req.setAttribute( "Khoa" , k );
    	req.setAttribute( "listChuyenNganh" , cnDAO.listChuyenNganh  ); 
    	boolean dk = false; 
    	if( cnDAO.listChuyenNganh.size() == 0 ) {
    		
    		req.setAttribute("dieuKien",  dk );
    	}
    	else {
    		dk = true;
    		
    		req.setAttribute("dieuKien",  dk);
    	}
    	req.getRequestDispatcher( "chuyenNganh.jsp" ).forward( req , resp ); 
    	
    }
}
