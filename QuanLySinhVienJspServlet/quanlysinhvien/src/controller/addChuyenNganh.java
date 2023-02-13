
package controller;

import java.io.IOException;
import java.net.URLDecoder;
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


@WebServlet( urlPatterns= { "/themchuyennganh" } )
public class addChuyenNganh extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String a = (String)req.getAttribute( "ID_Khoa_para" );
    	String maKhoa = new String( a.getBytes("iso-8859-1"), "utf-8");    
    	req.setCharacterEncoding("UTF-8");  
    	resp.setContentType("text/html;charset=UTF-8");
    	
    	req.setAttribute( "ID" , maKhoa );
    	
    	/* vvvvvvvv ChuyenNganhServlet vvvvvvv */ 
    	        //maKhoa = (String)getServletContext().getAttribute( "ID_Khoa" );
    	    	KhoaDAO kDAO = new KhoaDAO(); 
    	    	Khoa k = kDAO.getKhoaByID_Khoa( maKhoa ); 
    	    	
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
    	 boolean checkAddChuyenNganh = false; 
    	 req.setAttribute( "checkAddChuyenNganh" , checkAddChuyenNganh );
    	/* ^^^^^^^^^ ChuyenNganhServlet ^^^^^^^^^^^ */ 
    	    	
    	    	
    	//req.getRequestDispatcher( "addChuyenNganh.jsp" ).forward( req , resp );
    	req.getRequestDispatcher( "chuyenNganh.jsp" ).forward( req , resp ); 
    	
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");  
    	resp.setContentType("text/html;charset=UTF-8");
    	
    	String maCN = req.getParameter( "ID_CN" ); 
    	String tenCN = req.getParameter( "Ten_CN" ); 
    	String maKhoa = req.getParameter( "ID_Khoa" ); 
    	
    	
    	URLDecoder.decode( maCN , "UTF-8");
    	URLDecoder.decode( tenCN , "UTF-8");
    	URLDecoder.decode( maKhoa , "UTF-8");
    	ChuyenNganhDAO cnDAO = new ChuyenNganhDAO(); 
    	cnDAO.themChuyenNganh(maCN, tenCN, maKhoa );
    	
    	
    	resp.sendRedirect( "chuyennganh" ); 
        
    	
    }
}
