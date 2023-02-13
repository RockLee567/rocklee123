package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.GiangVienDAO;
import dal.HocKyDAO;
import dal.MonHocDAO;
import dal.NamHocDAO;


@WebServlet( urlPatterns= { "/nhapdiem" } )
public class NhapDiem extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String maSV_raw = (String)req.getAttribute( "ID_SVpara" ); 
    	int maSV = 0; 
    	if( req.getAttribute( "ID_SVpara" ) != null ) {
    		try {
    			
    			maSV = Integer.parseInt( maSV_raw ); 
    			getServletContext().setAttribute( "ID_SV" , maSV ); 
    			
    		}catch(Exception e) {
    			System.out.println( "NhapDiem doGet()" );
    			System.out.println( e );
    		}
    	}
    	else {
    		int m = (Integer)getServletContext().getAttribute( "ID_SV" ); 
    		System.out.println( m );
            try {		
    			maSV = m; 
    		}catch(Exception e) {
    			System.out.println( "NhapDiem doGet()" );
    			System.out.println( e );
    		}
    	}
    	
    	if( req.getAttribute("error") != null ) {
    		String er = (String)req.getAttribute("error") ; 
    		req.setAttribute( "error" , er  );
    	}
    	
    	MonHocDAO mhDAO = new MonHocDAO(); 
    	mhDAO.showListMonHoc(); 
    	
    	GiangVienDAO gvDAO = new GiangVienDAO(); 
    	gvDAO.showListGiangVien(); 
    	
    	HocKyDAO hkDAO = new HocKyDAO(); 
    	hkDAO.showListHocKy(); 
    	
    	NamHocDAO nhDAO = new NamHocDAO(); 
    	nhDAO.showListNamHoc(); 
    	
    	req.setAttribute( "MSV" ,  maSV );
    	req.setAttribute( "MonHoc" , mhDAO.listMonHoc );
    	
    	req.setAttribute( "GiangVien" , gvDAO.listGiangVien );
    	req.setAttribute( "HocKy" , hkDAO.listHocKy );
    	req.setAttribute( "NamHoc" , nhDAO.listNamHoc );
    	
    	req.getRequestDispatcher( "nhapDiem.jsp" ).forward( req , resp );
    		
    }
     
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 
    	
    	
    	
    }
}
