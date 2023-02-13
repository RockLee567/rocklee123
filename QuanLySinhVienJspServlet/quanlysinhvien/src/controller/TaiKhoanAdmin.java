package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.AccountDAO;



@WebServlet( urlPatterns= { "/taikhoanadmin" } )
public class TaiKhoanAdmin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	AccountDAO accDAO = new AccountDAO(); 
    	accDAO.showlistAccount(); 
    	
        
        
        if( accDAO.listAccountSinhVien.size() != 0 ) {
        	boolean a = false; 
        	req.setAttribute( "checkNullSV" , a  );
        }
        req.setAttribute( "accSinhVien" , accDAO.listAccountSinhVien );
        req.setAttribute( "accAdmin" , accDAO.listAccountAdmin );
    	req.getRequestDispatcher( "taiKhoan.jsp" ).forward( req, resp );
    	
    	 
    	
    }
}
