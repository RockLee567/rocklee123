package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.AccountDAO;
import model.Account;


@WebServlet( urlPatterns= { "/updatematkhausinhvien" } )
public class updateMatKhauSinhVien extends HttpServlet {
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 String user_raw = (String)req.getAttribute( "username_para" ); 
    	 String pass = (String)req.getAttribute( "password_para" ); 
    	 AccountDAO accDAO = new AccountDAO(); 
    	 int user = 0; 
    	 try {
    		 user = Integer.parseInt( user_raw ); 
    	 } catch( Exception e ) {
    		 System.out.println( "updateMatKhauSinhVien doGet()" );
    		 System.out.println( e );
    	 }
    	 Account acc = accDAO.checkAccount(user, pass, 0 ) ; 
    	 boolean checkUpdate = false; 
    	 req.setAttribute( "checkUpdateSV" , checkUpdate );
    	 req.setAttribute( "acc" , acc );
    	 
    	 
       	 accDAO.showlistAccount(); 
       	 req.setAttribute( "accSinhVien" , accDAO.listAccountSinhVien );
         req.setAttribute( "accAdmin" , accDAO.listAccountAdmin );
         
    	 req.getRequestDispatcher( "taiKhoan.jsp" ).forward( req , resp );
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String user_raw = (String)req.getParameter( "user" ); 
   	    String pass_raw = (String)req.getParameter( "pass" ); 
     	//String role_raw = (String)req.getAttribute( "role" ); 
     	int user = 0; 
     	int role = 0; 
     	String pass = pass_raw.trim(); 
	    try {
		    user = Integer.parseInt( user_raw ); 
	    } catch( Exception e ) {
		    System.out.println( "updateMatKhau doPost()" );
		    System.out.println( e );
	    }
	    
	    AccountDAO accDAO = new AccountDAO() ; 
	    accDAO.updateMatKhau(user, pass, role);
	    
	    resp.sendRedirect( "taikhoanadmin" );
	    
    }
}
