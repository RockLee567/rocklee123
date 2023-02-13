package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.BangDiemDAO;
import dal.SinhVienDAO;
import model.SinhVien;



@WebServlet( urlPatterns= { "/bangdiem" } )
public class BangDiemServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html;charset=UTF-8");
    	req.setCharacterEncoding("UTF-8");
    	
    	
    	String maSV_raw  = (String)req.getAttribute( "ID_SVpara" ); 
    	
    	 int maSV = 0; 
    	 
    	 if( req.getAttribute( "ID_SVpara" ) != null ) {
    		 try {
        		 maSV = Integer.parseInt( maSV_raw ); 
        		 getServletContext().setAttribute( "ID_SV" , maSV );
        	 } catch( Exception e ) {
        		 System.out.println( "BangDiemServlet doGet() 1" );
        		 System.out.println( e );
        	 }
    	 }
    	 else {
    		 int m = (Integer)getServletContext().getAttribute( "ID_SV" ) ;
    		 
    		 try {
        		 maSV = m; 
        		
        	 } catch( Exception e ) {
        		 System.out.println( "BangDiemServlet doGet() 2" );
        		 System.out.println( e );
        	 }
    		
    	 }
    	
    	 BangDiemDAO bdDAO = new BangDiemDAO(); 
    	 bdDAO.showBangDiemTheoID_SV( maSV );
    	 
    	 if( bdDAO.listBangDiem.size() == 0 ) {
    		 req.setAttribute( "nullBD" , "Không có bảng điểm nào!") ; 
    	 }
    	 else {
    		 req.setAttribute( "listBD"  , bdDAO.listBangDiem  ) ; 
    	 } 
    	 
    	 SinhVienDAO svDAO = new SinhVienDAO(); 
    	 SinhVien sv = svDAO.getSinhVienByID_SV(maSV); 
    	 getServletContext().setAttribute( "Ten_Lop" , sv.getLop().getTenLop()  );
    	 
    	 req.setAttribute( "SV" ,  sv );
    	 req.getRequestDispatcher( "bangDiem.jsp" ).forward( req , resp );
    	 
    }
}
