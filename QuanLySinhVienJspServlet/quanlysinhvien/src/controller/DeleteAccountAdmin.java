package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.AccountDAO;


@WebServlet( urlPatterns= { "/xoaadmin" } )
public class DeleteAccountAdmin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String id_raw = (String)req.getAttribute( "id_admin_para" ) ; 
    	
    	int id = 0; 
    	try {
		    id = Integer.parseInt( id_raw ); 
	    } catch( Exception e ) {
		    System.out.println( "DeleteAccountAdmin doPost()" );
		    System.out.println( e );
	    }
    	AccountDAO accDAO = new AccountDAO(); 
    	accDAO.deleteAccount( id , 1 );
    	req.getRequestDispatcher( "taikhoanadmin" ).forward( req , resp );
    }
}
