package controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.LopDAO;
import dal.SinhVienDAO;
import model.Lop;
import model.SinhVien;


@WebServlet( urlPatterns= { "/capnhatsinhvien" } )
public class updateSinhVien extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html;charset=UTF-8");
    	resp.setCharacterEncoding("UTF-8");
    	
    	int maSV = 0; 
    	if( req.getAttribute( "ID_SVpara" ) != null ) {
    		String gg = (String)req.getAttribute( "ID_SVpara" );  
    		
    		try {
    			maSV = Integer.parseInt( gg );
    			
        		getServletContext().setAttribute( "ID_SV" , maSV ); 
    		} catch ( Exception e ) {
    			System.out.println( "updateSinhVien doGet()" );
    			System.out.println( e ); 
    		}
    		
    		getServletContext().setAttribute( "ID_SV" , maSV ); 
    	}
    	else {
    		maSV = (Integer)getServletContext().getAttribute( "ID_SV"  ) ;
    	}
    	
    	SinhVienDAO svDAO = new SinhVienDAO(); 
    	SinhVien sv = svDAO.getSinhVienByID_SV( maSV ); 
    	
    	req.setAttribute( "SV" , sv ); 
    	
    	/* vvvvvvvvvvvv SinhVienServlet vvvvvvvvvvvvvv */ 
    	
    	String maLop = (String)getServletContext().getAttribute( "ID_Lop" ); 
    	SinhVienDAO svDAOnew = new SinhVienDAO(); 
    	svDAOnew.getSinhVienByMaLop(maLop) ; 
    	 
    	List<SinhVien> listSV  = svDAOnew.listSinhVien;
    	if( listSV != null ) { 
    		req.setAttribute( "list" , svDAOnew.listSinhVien );
    	}
    	else {
    		req.setAttribute( "nullSV" , "Không có sinh viên" );
    	}
    	
    	LopDAO lDAOnew = new LopDAO(); 
    	Lop l = lDAOnew.getLopByID_Lop(maLop);
    	req.setAttribute( "lopK" , l );
    	
    	
    	boolean checkUpdateSinhVien = false; 
    	req.setAttribute( "checkUpdateSinhVien" , checkUpdateSinhVien );
    	/* ^^^^^^^^^^^^ SinhVienServlet ^^^^^^^^^^^^^^ */ 
    	
    	
    	
    	//req.getRequestDispatcher( "updateSinhVien.jsp" ).forward(req , resp );
    	req.getRequestDispatcher( "sinhvien.jsp" ).forward(req , resp );
    }
    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html;charset=UTF-8");
    	resp.setCharacterEncoding("UTF-8");
    	
    	
    	String maSV = req.getParameter( "maSV" ); 
    	String hoTen = req.getParameter( "tenSV" ); 
    	String ns = req.getParameter( "NS" ); 
    	String gt = req.getParameter( "GT" );
    	String qq = req.getParameter( "QQ" );
    	String sdt_raw = req.getParameter( "SDT" );
    	String email = req.getParameter( "E" );
    	
    	int sdt = 0;
    	try {
    		sdt = Integer.parseInt( sdt_raw );  
    		
    	} catch( Exception e ) {
    		System.out.println( "updateSinhVien doPost" ); 
    		System.out.println( e );
    	}
    	
    	URLDecoder.decode( maSV , "UTF-8");
    	URLDecoder.decode( hoTen , "UTF-8");
    	URLDecoder.decode( ns , "UTF-8");
    	URLDecoder.decode( gt , "UTF-8");
    	URLDecoder.decode( qq , "UTF-8");
    	
    	URLDecoder.decode( email , "UTF-8");
    	
    	SinhVienDAO svDAO = new SinhVienDAO(); 
    	svDAO.updateSV(maSV, hoTen, ns , gt,qq, sdt , email);
    	
    	resp.sendRedirect( "sinhvien" );
    }
}
