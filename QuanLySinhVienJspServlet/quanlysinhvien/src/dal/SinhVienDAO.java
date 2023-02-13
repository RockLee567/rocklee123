package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

import java.util.List;

import model.Lop;
import model.SinhVien;


public class SinhVienDAO {
    
	public List<SinhVien> listSinhVien; 
	
	public SinhVienDAO() {
		listSinhVien = new ArrayList<>(); 
	}
	
	public void getSinhVienByMaLop( String maLop ){

		String sql = " SELECT Lop.Ten_Lop , SinhVien.ID_SinhVien , SinhVien.HoTen , CAST( SinhVien.NgaySinh AS VARCHAR) AS \"NgaySinh\" , SinhVien.GioiTinh , SinhVien.QueQuan , SinhVien.sdt AS \"SDT\" , SinhVien.email \r\n" + 
				"FROM SinhVien , Lop \r\n" + 
				"WHERE SinhVien.ID_FK_Lop = Lop.ID_Lop AND Lop.ID_Lop = ? "; 
		try {
			
			PreparedStatement pre = DBContext.connect.prepareStatement( sql ); 
			pre.setString( 1 , maLop );
			pre.execute(); 
			ResultSet res = pre.executeQuery(); 
			if( res.next() ) {
				LopDAO lDAO = new LopDAO(); 
				Lop l = lDAO.getLopByID_Lop(maLop); 
				
				SinhVien sv = new SinhVien(); 
				sv.setMaSinhVien( res.getInt( "ID_SinhVien" ) );
				sv.setTenSinhVien( res.getNString( "HoTen" ) ); 
				sv.setNgaySinh( res.getString( "NgaySinh" ) );
				sv.setGioiTinh( res.getNString( "GioiTinh" ) );
				sv.setQueQuan( res.getNString( "QueQuan" ) );
				sv.setSdt( res.getInt("SDT") );
			    sv.setEmail( res.getNString("email") );
				
				sv.setLop( l ); 
				
				listSinhVien.add( sv ); 
			} 
			else {
				listSinhVien = null; 
				System.out.println( "SinhVienDAO getSinhVienByMaLop() NULL - No Problem" );
			}
			while( res.next() ) {
				LopDAO lDAO = new LopDAO(); 
				Lop l = lDAO.getLopByID_Lop(maLop); 
				
				SinhVien sv = new SinhVien(); 
				sv.setMaSinhVien( res.getInt( "ID_SinhVien" ) );
				sv.setTenSinhVien( res.getNString( "HoTen" ) ); 
				sv.setNgaySinh( res.getString( "NgaySinh" ) );
				sv.setGioiTinh( res.getNString( "GioiTinh" ) );
				sv.setQueQuan( res.getNString( "QueQuan" ) );
				sv.setSdt( res.getInt("SDT") );
			    sv.setEmail( res.getNString("email") );
				
				sv.setLop( l ); 
				
				listSinhVien.add( sv ); 
				
			}
			
			
 		} catch( Exception e ) {
 			System.out.println( "SinhVienDAO getSinhVienByMaLop()" );
 			System.out.println( e );
 		}
		 
	}
	
	public void updateSV( String maSV , String hoTen , String NS , String gt , String queQuan , int sdt , String email  ) {
		String sql = "UPDATE SinhVien SET HoTen = ?  , NgaySinh = ? , GioiTinh = ? , QueQuan = ? , sdt = ? , email = ? WHERE ID_SinhVien = ? " ;
		try {
			PreparedStatement pre = DBContext.connect.prepareStatement( sql ); 
			pre.setNString( 1 , hoTen );
			pre.setString( 2 , NS );
			pre.setNString( 3 , gt );
			pre.setNString( 4 , queQuan );
			pre.setInt( 5 , sdt );
			pre.setNString( 6 , email );
			pre.setString( 7 , maSV ); 
			
			pre.execute(); 
		}catch (Exception e) {
			System.out.println( "SinhVienDAO updateSV()" );
			System.out.println( e );
		}
		
	}
	
	public SinhVien getSinhVienByID_SV( int msv ) {
		String sql = "SELECT * FROM SinhVien WHERE ID_SinhVien = ? "; 
		try {
			PreparedStatement pre = DBContext.connect.prepareStatement( sql ); 
			pre.setInt( 1 , msv );
			pre.execute(); 
			ResultSet res = pre.executeQuery(); 
			if( res.next() ) {
				LopDAO lDAO = new LopDAO(); 
				Lop l = lDAO.getLopByID_Lop( res.getString( "ID_FK_Lop" ) );
				SinhVien sv = new SinhVien(); 
				sv.setMaSinhVien(msv);
				sv.setTenSinhVien( res.getNString("HoTen") ); 
				sv.setNgaySinh( res.getString( "NgaySinh" ) ); 
				sv.setGioiTinh( res.getNString("GioiTinh")   ); 
				sv.setQueQuan( res.getNString("QueQuan") ); 
				sv.setSdt( res.getInt("sdt") ); 
				sv.setEmail(  res.getNString("email") ); 
				sv.setLop( l );
				return sv; 
			}
			
		} catch (Exception e) {
			
			System.out.println( "SinhVienDAO getSinhVienByID_SV()" );
			System.out.println( e );
		}
		return null; 
	}
	
	
	public void addSinhVien(  int maSV , String tenSV , String NS  , String GT , String QQ ,  int sdt , String email , String maLop  ) {
		
		String sqlSV = "INSERT INTO SinhVien VALUES( ? , ? , ? , ? , ? , ? , ? , ?  )  " ; 
		
		Date date = Date.valueOf( NS ); 
		
		try {
			PreparedStatement pre = DBContext.connect.prepareStatement( sqlSV ); 
			pre.setInt( 1 , maSV ); 
			pre.setString( 2 , tenSV ); 
			pre.setDate( 3 ,  date );
			pre.setString( 4 , GT );
			pre.setString( 5 , QQ );
			pre.setInt( 6 , sdt );
			pre.setString( 7 , email );
			pre.setString( 8 , maLop );
			pre.execute();
		} catch( Exception e ) {
			System.out.println( "SinhVienDAO addSinhVien()_AccountSinhVien2" );
			System.out.println( e );
		}
		
		
		String sql = "INSERT INTO AccountSinhVien VALUES( ? , ? , ? ) " ; 
		try {
			PreparedStatement pre = DBContext.connect.prepareStatement( sql ); 
			pre.setInt( 1 , maSV ); 
			pre.setString( 2 , "12345" ); 
			pre.setInt( 3 , 0 );
			pre.execute();
		} catch( Exception e ) {
			System.out.println( "SinhVienDAO addSinhVien()_AccountSinhVien1" );
			System.out.println( e );
		}
		
		
		
	}
	
	
	public void deleteSinhVien( int msv ) {
		String sql = " DELETE AccountSinhVien WHERE ID = ? "; 
		try {
			PreparedStatement pre = DBContext.connect.prepareStatement( sql ); 
			pre.setInt( 1 , msv ); 
			pre.execute();
		} catch( Exception e ) {
			System.out.println( "SinhVienDAO deleteSinhVien()_AccountSinhVien" );
			System.out.println( e );
		}
		
		String sqlBD = " DELETE BangDiem WHERE ID_SV = ? " ;
		try {
			PreparedStatement pre = DBContext.connect.prepareStatement( sqlBD ); 
			pre.setInt( 1 , msv ); 
			pre.execute();
		} catch( Exception e ) {
			System.out.println( "SinhVienDAO deleteSinhVien()_BangDiem" );
			System.out.println( e );
		}
		
		String sqlSV = " DELETE SinhVien WHERE ID_SinhVien = ? " ;
		try {
			PreparedStatement pre = DBContext.connect.prepareStatement( sqlSV ); 
			pre.setInt( 1 , msv ); 
			pre.execute();
		} catch( Exception e ) {
			System.out.println( "SinhVienDAO deleteSinhVien()_BangDiem" );
			System.out.println( e );
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
