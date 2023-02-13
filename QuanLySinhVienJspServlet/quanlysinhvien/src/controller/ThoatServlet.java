package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet( urlPatterns= { "/thoat" } )
public class ThoatServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	HttpSession ses = req.getSession(); 
    	if( ses.getAttribute( "AccountAdmin" ) != null ) {
    		ses.removeAttribute( "AccountAdmin" ); 
        	req.getRequestDispatcher( "menu" ).forward( req , resp );
    	}
    	else if( ses.getAttribute( "AccountSV" ) != null  ) {
    		ses.removeAttribute( "AccountSV" ); 
        	req.getRequestDispatcher( "accSV" ).forward( req , resp );
    	}
    	else {
    		req.getRequestDispatcher( "login" ).forward( req , resp );
    	}
    	
    }
}
