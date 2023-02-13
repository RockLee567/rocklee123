package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Account;


@WebServlet( urlPatterns= { "/menu" } )
public class checkAccount extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	HttpSession ses = req.getSession(); 
    	
    	Account acc = (Account)ses.getAttribute( "AccountAdmin" ); 
    	
    	if( acc != null ) {
    		String act ="NULL"; 
    		act = req.getParameter("action"); 
    		
    		
    		/* Khoa                                                                */
    		if( act.equals( "khoa" ) ) {
    			
    			req.getRequestDispatcher( "khoa" ).forward( req , resp );
    		}
    		else if( act.equals("themKhoa" ) ) {
    			req.getRequestDispatcher( "themkhoa" ).forward( req , resp ); 
    		}
    		else if( act.equals("capNhapKhoa" ) ) {
    			String maKhoa = req.getParameter( "ID_Khoa" ); 
    			req.setAttribute( "ID" , maKhoa  ); 
    			req.getRequestDispatcher( "capnhapkhoa" ).forward(req, resp);
    		}
    		else if( act.equals("xoaKhoa" ) ) {
    			String maKhoa = req.getParameter( "ID_Khoa" ); 
    			req.setAttribute( "ID_Khoa_para" , maKhoa  ); 
    			req.getRequestDispatcher( "xoakhoa" ).forward(req, resp);
    		}
    		
    		/* Chuyen Nganh                                                               */
    		else if( act.equals( "chuyenNganh" )  ) {
    			String maKhoa = req.getParameter( "ID_Khoa" ); 
    			req.setAttribute( "ID" , maKhoa  ); 
    			req.getRequestDispatcher( "chuyennganh" ).forward(req, resp); 
    		}
    		else if( act.equals( "themChuyenNganh" )  ) {
    			String maKhoa = req.getParameter( "ID_Khoa" ); 
    			req.setAttribute( "ID_Khoa_para" , maKhoa  ); 
    			req.getRequestDispatcher( "themchuyennganh" ).forward(req, resp); 
    		}
    		else if( act.equals( "capNhatCN" )  ) {
    			String maChuyenNganh = req.getParameter( "ID_ChuyenNganh" );
    			req.setAttribute( "ID_ChuyenNganh" , maChuyenNganh  );
    			req.getRequestDispatcher( "capnhatchuyennganh" ).forward( req , resp );
    		}
    		else if( act.equals( "xoaChuyenNganh" )  ) {
    			String maChuyenNganh = req.getParameter( "ID_CN" );
    			req.setAttribute( "ID_CN_para" , maChuyenNganh  );
    			req.getRequestDispatcher( "xoachuyennganh" ).forward( req , resp );
    		}
    		
    		/* Lớp                                                              */
    		else if( act.equals( "themLop" )  ) {
    			String maKhoa = req.getParameter( "ID_Khoa" );
    			req.setAttribute( "ID_Khoa_para" , maKhoa  ); 
    			req.getRequestDispatcher( "themlop" ).forward( req , resp );
    		}
    		else if( act.equals( "xoaLop" )  ) {
    			String maLop = req.getParameter( "ID_Lop" );
    			req.setAttribute( "ID_Lop_para" , maLop  ); 
    			req.getRequestDispatcher( "xoalop" ).forward( req , resp );
    		}
    		
    		
    		
    		/* Sinh Vien                                                                */
    		else if( act.equals( "SV" ) ) {
    			String maLop = req.getParameter( "ID_Lop" );
    			String tenChuyenNganh = req.getParameter( "Ten_ChuyenNganh" );
    			
    			req.setAttribute( "ID_Lop_para" , maLop  );
    			req.setAttribute( "Ten_ChuyenNganh_para" , tenChuyenNganh );
    			
    			req.getRequestDispatcher( "sinhvien" ).forward( req , resp );
    		}
    		else if( act.equals( "themSinhVien" ) ) {
    			String maLop = req.getParameter( "ID_Lop" );
    			req.setAttribute( "ID_Lop_para" , maLop  );
    			req.getRequestDispatcher( "themsinhvien" ).forward( req , resp );
    		}
    		else if( act.equals( "capNhatSV" ) ) {
    			String maSV = req.getParameter( "ID_SV" );
    			req.setAttribute( "ID_SVpara" , maSV  );
    			req.getRequestDispatcher( "capnhatsinhvien" ).forward( req , resp );
    		}
    		else if( act.equals( "xoaSinhVien" ) ) {
    			String maSV = req.getParameter( "ID_SV" );
    			req.setAttribute( "ID_SVpara" , maSV  );
    			req.getRequestDispatcher( "xoasinhvien" ).forward( req , resp );
    		}
    		else if( act.equals( "timKiemSinhVien" ) ) {
    			req.getRequestDispatcher( "timKiemSinhVien.jsp" ).forward( req , resp );
    		}
    		
    		
    		/* Bang Diem                                                                */
    		else if( act.equals( "bangDiem" ) ) {
    			String maSV = req.getParameter( "ID_SV" );
    			req.setAttribute( "ID_SVpara" , maSV  );
    			req.getRequestDispatcher( "bangdiem" ).forward( req , resp );
    		}
    		else if( act.equals( "nhapDiem" ) ) {
    			String maSV = req.getParameter( "ID_SV" );
    			req.setAttribute( "ID_SVpara" , maSV  );
    			req.getRequestDispatcher( "nhapdiem" ).forward( req , resp );
    		}
    		

    		
    		else if( act.equals( "xoaBangDiem" ) ) {
    			String maBD = req.getParameter( "ID_BD" );
    			req.setAttribute( "ID_BDpara" , maBD  );
    			req.getRequestDispatcher( "xoabangdiem" ).forward( req , resp );
    		}
    		
    		
    		
    		/* Môn Học                                                              */
    		else if( act.equals( "monHoc" ) ) {
    			req.getRequestDispatcher( "monhoc" ).forward( req , resp );
    		}
            else if( act.equals( "xoaMonHoc" ) ) {
            	String maMH = req.getParameter( "ID_MH" ); 
            	req.setAttribute( "ID_MH_para" ,  maMH ); 
    			req.getRequestDispatcher( "xoamonhoc" ).forward( req , resp );
    		}
    		
    		/* Giảng Viên                                                            */
    		else if( act.equals( "giangVien" ) ) {
    			req.getRequestDispatcher( "giangvien" ).forward( req , resp );
    		}
    		else if( act.equals( "xoaGiangVien" ) ) {
    			String maGV = req.getParameter( "ID_GV" ); 
            	req.setAttribute( "ID_GV_para" ,  maGV ); 
    			req.getRequestDispatcher( "xoagiangvien" ).forward( req , resp );
    		}
    		
    		/* Home                                                              */
    		else if( act.equals( "home" ) ) {
    			req.getRequestDispatcher( "menu.jsp" ).forward( req , resp );
    		}
    		
    		/* Tài Khoản                                                            */
    		
    		else if( act.equals( "taiKhoan" ) ) {
    			req.getRequestDispatcher( "taikhoanadmin" ).forward( req , resp );
    		}
    		else if( act.equals( "doiMK" ) ) {
    			String username = req.getParameter( "username" ); 
    			String password = req.getParameter( "password" ); 
            	req.setAttribute( "username_para" ,  username ); 
            	req.setAttribute( "password_para" ,  password ); 
    			req.getRequestDispatcher( "updatematkhauadmin" ).forward( req , resp );
    		}
    		else if( act.equals( "xoaAccountAdmin" ) ) {
    			String id = req.getParameter( "id" ); 
    			
            	req.setAttribute( "id_admin_para" ,  id ); 
    			req.getRequestDispatcher( "xoaadmin" ).forward( req , resp );
    		}
    		else if( act.equals( "themTKAdmin" ) ) {
    			req.getRequestDispatcher( "themtaikhoanadmin" ).forward( req , resp );
    		} 
    		else if( act.equals( "doiMKSV" ) ) {
    			String username = req.getParameter( "username" ); 
    			String password = req.getParameter( "password" ); 
            	req.setAttribute( "username_para" ,  username ); 
            	req.setAttribute( "password_para" ,  password ); 
    			req.getRequestDispatcher( "updatematkhausinhvien" ).forward( req , resp );
    		}
    		
    		
    		else {
    			req.getRequestDispatcher( "menu.jsp" ).forward(req, resp);
    		}
    		
    	}
    	else {
    		req.getRequestDispatcher( "login.jsp" ).forward(req, resp);
    	}
    	
    }
}
