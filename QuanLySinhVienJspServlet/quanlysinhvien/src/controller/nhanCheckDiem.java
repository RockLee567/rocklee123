package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.BangDiemDAO;
import dal.MonHocDAO;

@WebServlet( urlPatterns= { "/diem" } )
public class nhanCheckDiem extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String maSV_raw = req.getParameter( "MSV" ) ; 
     	String maMonHoc = req.getParameter( "maMonHoc" );
     	String maGiangVien = req.getParameter( "maGiangVien" );
     	String maHocKy = req.getParameter( "maHocKy" );
     	String maNamHoc = req.getParameter( "maNamHoc" );
     	String diem_raw = req.getParameter( "diem" );
     	
     	int maSV = 0 ; 
     	float diem = 0; 
     	boolean check = true; 
     	try {
     		maSV = Integer.parseInt( maSV_raw ); 
     		diem = Float.parseFloat( diem_raw ); 
     	} catch( Exception e ) {
     		check = false; 
     		System.out.println( "nhanCheckDiem doGet()" );
     		System.out.println( e );
     	}
     	
     	
     	if( check == false ) {
     		req.setAttribute( "error" ,  "Nhập sai điểm" );
     		
     		req.getRequestDispatcher( "nhapdiem" ).forward(req , resp );
     	}
     	else {
     		MonHocDAO mhDAO = new MonHocDAO(); 
         	String tinChi = mhDAO.tinChi(maMonHoc);
         	
         	BangDiemDAO bdDAO = new BangDiemDAO(); 
         	
         	bdDAO.themBangDiem(maSV, maMonHoc, tinChi, maGiangVien, maHocKy, maNamHoc, diem);
         	
         	req.getRequestDispatcher( "bangdiem" ).forward( req , resp );
     	}
     	
     	
     	
     	
    }
}
