package controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.KhoaDAO;
import dal.LopDAO;
import dal.SinhVienDAO;
import model.Khoa;
import model.Lop;
import model.SinhVien;

@WebServlet( urlPatterns= { "/sinhvien" } )
public class SinhVienServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html;charset=UTF-8");
    	req.setCharacterEncoding("UTF-8");
    	
    	String maLop = "" ; 
    	
    	if( (String)req.getAttribute( "ID_Lop_para" ) != null ) {
    		maLop = (String)req.getAttribute( "ID_Lop_para" ) ; 
    		getServletContext().setAttribute( "ID_Lop" , maLop );
    	}
    	else {
    		maLop = (String)getServletContext().getAttribute( "ID_Lop" ); 
    	}
    	
    	
    	
    	String tenCN = "";
    	if( (String)req.getAttribute( "Ten_ChuyenNganh_para" ) != null ) {
    		String tenCN_raw = (String)req.getAttribute( "Ten_ChuyenNganh_para" ) ;
    		
    		// tomcat 7 
    		tenCN =   new String( tenCN_raw.getBytes("iso-8859-1"), "utf-8");  
    		
    		// tomcat 8 , 8.5 
    		/*
    		URLDecoder.decode( tenCN_raw  , "UTF-8"); 
    		tenCN = tenCN_raw; 
    		*/ 
    		
    		getServletContext().setAttribute( "Ten_CN" , tenCN );
    		
    	}
    	else {
    		tenCN = (String)getServletContext().getAttribute( "Ten_CN" );
    	}
    	
    	//maLop = (String)getServletContext().getAttribute( "ID_Lop" ); 
    	SinhVienDAO svDAO = new SinhVienDAO(); 
    	svDAO.getSinhVienByMaLop(maLop) ; 
    	 
    	List<SinhVien> listSV  = svDAO.listSinhVien;
    	if( listSV != null ) { 
    		req.setAttribute( "list" , svDAO.listSinhVien );
    	}
    	else {
    		req.setAttribute( "nullSV" , "Không có sinh viên" );
    	}
    	
    	LopDAO lDAO = new LopDAO(); 
    	Lop l = lDAO.getLopByID_Lop(maLop);
    	req.setAttribute( "lopK" , l );
    	
    	getServletContext().setAttribute( "Ten_Lop" , l.getTenLop()   );
    	req.getRequestDispatcher( "sinhvien.jsp" ).forward( req , resp );
    	
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    }
}
