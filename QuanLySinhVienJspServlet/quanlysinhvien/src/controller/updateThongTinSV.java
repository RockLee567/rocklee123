package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.SinhVienDAO;


@WebServlet( urlPatterns= { "/updatethongtinsv" } )
public class updateThongTinSV extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html;charset=UTF-8");
    	resp.setCharacterEncoding("UTF-8");
    	
    	
    	String maSV =  new String( req.getParameter( "ID_SV" ).getBytes("iso-8859-1"), "utf-8");                                                    
    	String hoTen =  new String( req.getParameter( "Ten_SV" ).getBytes("iso-8859-1"), "utf-8"); 
    	String ns =   new String( req.getParameter( "NgaySinh_SV" ).getBytes("iso-8859-1"), "utf-8"); 
    	String gt =  new String( req.getParameter( "GioiTinh_SV" ).getBytes("iso-8859-1"), "utf-8"); 
    	String qq =  new String( req.getParameter( "QueQuan_SV" ).getBytes("iso-8859-1"), "utf-8"); 
    	String sdt_raw =  new String( req.getParameter( "SDT_SV" ).getBytes("iso-8859-1"), "utf-8"); 
    	String email =  new String( req.getParameter( "Email_SV" ).getBytes("iso-8859-1"), "utf-8"); 
    	
    	int sdt = 0;
    	try {
    		sdt = Integer.parseInt( sdt_raw );  
    		
    	} catch( Exception e ) {
    		System.out.println( "updateThongTinSV doGet()" ); 
    		System.out.println( e );
    	}
    	
    	SinhVienDAO svDAO = new SinhVienDAO(); 
    	svDAO.updateSV(maSV, hoTen, ns , gt,qq, sdt , email);
    	
    	req.getRequestDispatcher( "accSV" ).forward(req, resp );
    	
    }
}
