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


@WebServlet( urlPatterns = { "/capnhatchuyennganh" } ) 
public class updateChuyenNganh extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html;charset=UTF-8");
    	req.setCharacterEncoding("UTF-8");
    	
    	String maLop = req.getParameter( "ID_Lop" ); 
    	
    	String maCN = (String)req.getAttribute( "ID_ChuyenNganh" ); 
    	ChuyenNganhDAO cnDAO = new ChuyenNganhDAO(); 
    	ChuyenNganh cn = cnDAO.getChuyenNganhByID_ChuyenNganh( maCN ); 
    	req.setAttribute( "ChuyenNganh" ,  cn );
    	req.setAttribute( "maLop" , maLop );
    	
        /* vvvvvvvvvv cap nhat chuyen nganh vvvvvvvvvvvvvv*/ 
    	String maKhoa = (String)getServletContext().getAttribute( "ID_Khoa" ); 
    	
    	KhoaDAO kDAO = new KhoaDAO(); 
    	Khoa k = kDAO.getKhoaByID_Khoa( maKhoa ); 
    	
    	ChuyenNganhDAO cnDAOnew = new ChuyenNganhDAO(); 
    	cnDAOnew.showChuyenNganh(maKhoa); 
    	List<ChuyenNganh> list = cnDAOnew.listChuyenNganh; 
    	
    	
    	req.setAttribute( "Khoa" , k );
    	req.setAttribute( "listChuyenNganh" , cnDAOnew.listChuyenNganh  ); 
    	boolean dk = false; 
    	if( cnDAOnew.listChuyenNganh.size() == 0 ) {
    		
    		req.setAttribute("dieuKien",  dk );
    	}
    	else {
    		dk = true;
    		
    		req.setAttribute("dieuKien",  dk);
    	}
    	
    	
    	
    	boolean checkUpdateChuyenNganh = false; 
    	req.setAttribute( "checkUpdateChuyenNganh" , checkUpdateChuyenNganh );
    	/* ^^^^^^^^^^ ChuyenNganhServlet ^^^^^^^^^^^^^ */ 
    	
    	
    	
    	
    	//req.getRequestDispatcher( "updateChuyenNganh.jsp" ).forward( req , resp ); 
    	req.getRequestDispatcher( "chuyenNganh.jsp" ).forward( req , resp );
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html;charset=UTF-8");
    	req.setCharacterEncoding("UTF-8");
    	
    	
    	String maCN = req.getParameter( "ID_CN" ); 
    	String tenCN = req.getParameter( "Ten_CN" ); 
    	URLDecoder.decode( maCN , "UTF-8"); 
    	URLDecoder.decode( tenCN , "UTF-8"); 
    	ChuyenNganhDAO cnDAO = new ChuyenNganhDAO(); 
    	cnDAO.updateChuyenNganh(maCN, tenCN); 
    	resp.sendRedirect( "chuyennganh" );
    	
    }
}
