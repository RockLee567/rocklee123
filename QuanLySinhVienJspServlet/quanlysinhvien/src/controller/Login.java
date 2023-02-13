package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dal.AccountDAO;
import model.Account;


@WebServlet( urlPatterns= { "/login" } )
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.getRequestDispatcher( "login.jsp" ).forward(req, resp ); 
    
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String user_raw = req.getParameter( "user" ); 
    	String pass = req.getParameter( "pass" ); 
    	String choose_raw = req.getParameter( "choose" ); 
    	
    	try {
    		int user = Integer.parseInt( user_raw ); 
    		int choose = Integer.parseInt( choose_raw ); 
    		AccountDAO accDAO = new AccountDAO(); 
    		Account acc = accDAO.checkAccount(user, pass , choose ); 
    		
    		if( acc != null ) {
    			if( choose == 1 ) {
    				HttpSession ses = req.getSession();
        			ses.setAttribute( "AccountAdmin" , acc );
        			resp.sendRedirect( "menu.jsp" );
    			} 
    			else {
    				HttpSession ses = req.getSession();
        			ses.setAttribute( "AccountSV" , acc );
        			resp.sendRedirect("accSV");
    			}
    			
    			
    			
    		}
    		else {
    			req.getRequestDispatcher( "login.jsp" ).forward( req , resp);
    		}
    	} catch( Exception e ) {
    		System.out.println( "Login doPost()" );
    		System.out.println( e );
    	}
    	
    }
}
