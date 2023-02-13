package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.SinhVienDAO;
import model.SinhVien;


@WebServlet( urlPatterns= { "/timkiemsinhvien" } )
public class TimKiemSinhVien extends HttpServlet  {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String maSV_raw = req.getParameter( "IDSV" ) ; 
    	int maSV = 0 ; 
    	boolean check = true; 
    	boolean checkSV = true ; 
    	try {
    		maSV = Integer.parseInt( maSV_raw ); 
    	} catch (Exception e ) {
    		check = false; 
    		System.out.println( "TimKiemSinhvien doGet()" );
    		System.out.println( e );
    	}
    	if( check == false ) {
    		req.setAttribute( "error" ,  "Mã Sinh Viên chưa đúng" ); 
    	}
    	else {
    		SinhVienDAO svDAO = new SinhVienDAO(); 
    		SinhVien sv = svDAO.getSinhVienByID_SV( maSV ) ;
    		if( sv != null ) {
    			checkSV = false; 
    			getServletContext().setAttribute( "ID_Lop"  , sv.getLop().getMaLop()   );
    			getServletContext().setAttribute( "ID_Khoa"  , sv.getLop().getcNganh().getKhoa().getMaKhoa()  );
    			getServletContext().setAttribute( "Ten_Khoa"  , sv.getLop().getcNganh().getKhoa().getTenKhoa() );
    			getServletContext().setAttribute( "Ten_CN"  , sv.getLop().getcNganh().getTenChuyenNganh()  );
    			getServletContext().setAttribute( "Ten_Lop"  , sv.getLop().getTenLop()  );
        		req.setAttribute( "SV" ,  sv  );
    		}
    		
    		
    	}
    	req.setAttribute( "checkSV" ,  checkSV );
    	req.getRequestDispatcher( "timKiemSinhVien.jsp" ).forward(req , resp );
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    }
}
