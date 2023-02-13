package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.GiangVienDAO;

@WebServlet( urlPatterns= { "/giangvien" } )
public class GiangVienServlet extends HttpServlet  {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	GiangVienDAO gvDAO = new GiangVienDAO(); 
    	gvDAO.showListGiangVien(); 
    	req.setAttribute( "listGV" ,  gvDAO.listGiangVien  );
    	req.getRequestDispatcher( "giangVien.jsp" ).forward( req , resp );
    }
}
