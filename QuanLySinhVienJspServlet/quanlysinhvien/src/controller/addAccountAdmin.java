package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.AccountDAO;



@WebServlet( urlPatterns= { "/themtaikhoanadmin" } )
public class addAccountAdmin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	boolean checkAdd = false; 
   	    req.setAttribute( "checkAdd" , checkAdd );
   	    AccountDAO accDAO = new AccountDAO(); 
   	    accDAO.showlistAccount();
        req.setAttribute( "accAdmin" , accDAO.listAccountAdmin );
        
     	req.getRequestDispatcher( "taiKhoan.jsp" ).forward( req , resp );
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String user_raw = (String)req.getParameter( "user" ); 
   	    String pass_raw = (String)req.getParameter( "pass" ); 
     	//String role_raw = (String)req.getAttribute( "role" ); 
     	int user = 0; 
     	int role = 1; 
     	String pass = pass_raw.trim(); 
	    try {
		    user = Integer.parseInt( user_raw ); 
	    } catch( Exception e ) {
		    System.out.println( "addAccountAdmin doPost()" );
		    System.out.println( e );
	    }
	    
	    AccountDAO accDAO = new AccountDAO() ; 
	    accDAO.addAccount(user, pass, role );
	    resp.sendRedirect( "taikhoanadmin" );
    }
}
