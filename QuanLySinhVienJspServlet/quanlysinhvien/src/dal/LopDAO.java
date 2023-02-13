package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Lop;
import model.ChuyenNganh;


public class LopDAO {
    
	public void updateLop( String maLop , String tenLop ,String  maCN ) {
		String sql = "";
		LopDAO lDAO = new LopDAO(); 
		Lop l = lDAO.getLopByID_Lop(maLop) ; 
		
		if( l.getTenLop().equals( "Unknown" ) ) {
			sql = "INSERT INTO Lop VALUES( ? , ? , ? )";  
			try {
				PreparedStatement pre = DBContext.connect.prepareStatement(sql); 
				pre.setString( 1 , maLop ); 
				pre.setNString( 2 , tenLop );
				pre.setString( 3 , maCN ); 
				pre.execute(); 
			}catch (Exception e) {
			    System.out.println( "LopDAO updateLop()" );
			    System.out.println(e);
			}
		}
		else {
			sql = "UPDATE Lop SET Ten_Lop = ? WHERE ID_Lop = ?";  
			try {
				PreparedStatement pre = DBContext.connect.prepareStatement(sql); 
				
				pre.setNString( 1 , tenLop );
				pre.setString( 2 , maLop ); 
				
				pre.execute(); 
			}catch (Exception e) {
			    System.out.println( "LopDAO updateLop()" );
			    System.out.println(e);
			}
		}
		
	}
	
	public Lop getLopByID_Lop( String maLop ) {
		String sql = "SELECT * FROM Lop WHERE ID_Lop= ? "; 
		Lop lop = new Lop(); 
		try {
			PreparedStatement pre = DBContext.connect.prepareStatement(sql); 
			pre.setString( 1 , maLop ); 
			pre.execute(); 
			
			ResultSet res = pre.executeQuery(); 
			if( res.next() ) {
				ChuyenNganhDAO cnDAO = new ChuyenNganhDAO(); 
				ChuyenNganh cn = cnDAO.getChuyenNganhByID_ChuyenNganh( res.getString( "ID_FK_ChuyenNganh" ) ) ; 
				lop.setMaLop( maLop ); 
				lop.setTenLop( res.getNString( "Ten_Lop" ) );
				lop.setcNganh( cn );
				return lop; 
			}
			else {
				lop.setMaLop("Unknown");
				lop.setTenLop( "Unknown" );
				return lop;
			}
			
			
		} catch (Exception e) {
			System.out.println( "LopDAO getLopByID_Lop()" );
			System.out.println( e );
		}
		
		
		return null; 
	}
	
	public void deleteLop( String maLop ) {
		String sql_acc = "DELETE AccountSinhVien\r\n" + 
				"WHERE ID IN ( SELECT SinhVien.ID_SinhVien FROM SinhVien WHERE ID_FK_Lop = ? ) "; 
		try {
			PreparedStatement pre = DBContext.connect.prepareStatement( sql_acc ); 
			pre.setString( 1 , maLop ); 
			pre.execute();
		} catch( Exception e ) {
			System.out.println( "LopDAO deleteLop()_AccountSinhVien" );
			System.out.println( e );
		}
		
		String sql_BD = "DELETE BangDiem \r\n" + 
				"WHERE ID_SV IN ( SELECT SinhVien.ID_SinhVien FROM SinhVien WHERE ID_FK_Lop = ? )"; 
		try {
			PreparedStatement pre = DBContext.connect.prepareStatement( sql_BD ); 
			pre.setString( 1 , maLop ); 
			pre.execute();
		} catch( Exception e ) {
			System.out.println( "LopDAO deleteLop()_BangDiem" );
			System.out.println( e );
		}
		
		String sql_SV = "DELETE SinhVien WHERE ID_FK_Lop = ? "; 
		try {
			PreparedStatement pre = DBContext.connect.prepareStatement( sql_SV ); 
			pre.setString( 1 , maLop ); 
			pre.execute();
		} catch( Exception e ) {
			System.out.println( "LopDAO deleteLop()_SinhVien" );
			System.out.println( e );
		}
		
		String sql_Lop = "DELETE Lop WHERE ID_Lop = ? "; 
		try {
			PreparedStatement pre = DBContext.connect.prepareStatement( sql_Lop ); 
			pre.setString( 1 , maLop ); 
			pre.execute();
		} catch( Exception e ) {
			System.out.println( "LopDAO deleteLop()_Lop" );
			System.out.println( e );
		}
		
		
	}
	
	public void appendLop( String maLop , String tenLop , String maCN ) {
		String sql = "INSERT INTO Lop VALUES( ? , ? , ? ) "; 
		Lop lop = new Lop(); 
		try {
			PreparedStatement pre = DBContext.connect.prepareStatement(sql); 
			pre.setString( 1 , maLop ); 
			pre.setNString( 2 , tenLop ); 
			pre.setString( 3 , maCN ); 
			pre.execute(); 
			
		} catch (Exception e) {
			System.out.println( "LopDAO appendLop()" );
			System.out.println( e );
		}
	}
	
}
