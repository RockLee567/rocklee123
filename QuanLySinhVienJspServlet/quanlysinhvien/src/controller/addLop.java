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
import dal.LopDAO;
import model.ChuyenNganh;
import model.Khoa;


@WebServlet( urlPatterns= { "/themlop" } )
public class addLop  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String maKhoa = (String)req.getAttribute( "ID_Khoa_para" ); 
    	
    	ChuyenNganhDAO cnDAO = new ChuyenNganhDAO(); 
    	cnDAO.showChuyenNganh(maKhoa);
    	
    	req.setAttribute( "listCN" ,  cnDAO.listChuyenNganh );
    	
    	
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
        	boolean checkAddLop = false; 
        	req.setAttribute( "checkAddLop" , checkAddLop );
    	
    	
    	
    	//req.getRequestDispatcher( "addLop.jsp" ).forward( req , resp );
    	req.getRequestDispatcher( "chuyenNganh.jsp" ).forward( req , resp );
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html;charset=UTF-8");
    	req.setCharacterEncoding("UTF-8");
    	
    	String maLop = req.getParameter( "maLop" ); 
    	String tenLop = req.getParameter( "tenLop" ); 
    	String maCN = req.getParameter( "maCN" ); 
    	URLDecoder.decode( maLop , "UTF-8"); 
    	URLDecoder.decode( tenLop , "UTF-8"); 
    	URLDecoder.decode( maCN , "UTF-8"); 
    	LopDAO lDAO = new LopDAO(); 
    	lDAO.appendLop( maLop , tenLop , maCN ); 
    	
    	resp.sendRedirect( "chuyennganh" );
    }
}
