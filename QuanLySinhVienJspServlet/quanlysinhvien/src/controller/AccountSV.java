package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dal.AccountDAO;
import dal.BangDiemDAO;
import dal.SinhVienDAO;
import model.Account;
import model.SinhVien;


@WebServlet( urlPatterns= { "/accSV" } )
public class AccountSV extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	resp.setContentType("text/html;charset=UTF-8");
    	req.setCharacterEncoding("UTF-8");
    	resp.setCharacterEncoding("UTF-8");
    	
    	HttpSession ses = req.getSession() ; 
    	SinhVienDAO svDAO = new SinhVienDAO();
    	Account a  = (Account)(ses.getAttribute("AccountSV") ) ;
    	Account acc = null ; 
    	if( a != null ) {
    		AccountDAO accDAO = new AccountDAO(); 
        	acc = accDAO.checkAccount( a.getUsername() , a.getPassword() , a.getChoose() ) ; 
    	}
    	
    	
    	
    	
    	
    	
    	
    	if( acc != null ) {
    		int msv = a.getUsername() ; 
        	System.out.println( "AccountSV doGet() " + msv );
        	SinhVien sv = svDAO.getSinhVienByID_SV(  msv  ); 
        	if( sv.getGioiTinh().equals( "Nam" ) ) {
        		req.setAttribute( "checkGT" ,  true );
        	}
        	else {
        		req.setAttribute( "checkGT" ,  false );
        	}
        	req.setAttribute( "ThongTinSV" ,  sv );
        	 
        	BangDiemDAO bdDAO = new BangDiemDAO() ; 
        	bdDAO.showBangDiemTheoID_SV( msv  ) ;
        	if( bdDAO.listBangDiem.size() == 0 ) {
        		req.setAttribute( "nullBD" , "Không có bảng điểm nào");
        	}
        	else {
        		
        		req.setAttribute( "BD" , bdDAO.listBangDiem );
        	}
    		req.getRequestDispatcher( "accountSV.jsp" ).forward( req , resp );
    	}
    	else {
    		req.getRequestDispatcher( "login" ).forward( req , resp );
    	}
    	
    	
    	
    	
    	
    }
}
