package dal;

import model.Khoa;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList; 

public class KhoaDAO {
    
	public List<Khoa> listKhoa; 
	
	public KhoaDAO() {
		listKhoa = new ArrayList(); 
		String sql = "SELECT * FROM Khoa"; 
		try {
			Statement sta = DBContext.connect.createStatement(); 
			ResultSet res = sta.executeQuery(sql); 
			while( res.next() ) {
				Khoa k = new Khoa(); 
				k.setMaKhoa( res.getString("ID_Khoa") ); 
				k.setTenKhoa( res.getNString( "Ten_Khoa" ) );
				listKhoa.add( k ); 
			}
		} catch( Exception e ) {
			System.out.println( "KhoaDAO KhoaDAO()" );
			System.out.println( e );
		}
	}
	
	public void addKhoa( String maKhoa , String tenKhoa ) {
		String sql = "INSERT INTO Khoa VALUES( ? , ? ) " ; 
		try {
			PreparedStatement pre = DBContext.connect.prepareStatement( sql ); 
			pre.setString( 1 , maKhoa ); 
			pre.setNString( 2, tenKhoa );
			pre.execute(); 
		}catch( Exception e ) {
			System.out.println( "KhoaDAO addKhoa()" );
			System.out.println( e );
		}
	}
	
	public void updateKhoa( String maKhoa , String tenKhoa ) {
		String sql = "UPDATE Khoa SET Ten_Khoa = ? WHERE ID_Khoa = ? " ; 
		try {
			PreparedStatement pre = DBContext.connect.prepareStatement(sql); 
			pre.setNString( 1 , tenKhoa );
			pre.setNString( 2 , maKhoa ); 
			pre.executeUpdate();  
		} catch( Exception e ) {
			System.out.println( "KhoaDAO updateKhao()" );
			System.out.println( e );
		}
	}
	
	public Khoa getKhoaByID_Khoa( String ID_Khoa  ) {
		
		String sql = "SELECT * FROM Khoa WHERE ID_Khoa = ? "; 
		try {
			PreparedStatement pre = DBContext.connect.prepareStatement(sql); 
			pre.setString( 1 , ID_Khoa ); 
			pre.execute(); 
			ResultSet res = pre.executeQuery(); 
			
			if( res.next() ) {
				Khoa k = new Khoa(); 
				k.setMaKhoa( ID_Khoa ); 
				k.setTenKhoa( res.getNString( "Ten_Khoa" ) );
				return k; 
			}
			
		} catch( Exception e ) {
			System.out.println( "KhoaDAO getKhoaByID_Khoa()" );
			System.out.println( e ); 
			
		}
		 
		
		return null; 
	}
	
	public void deleteKhoa( String maKhoa ) {
		String sql_acc = " DELETE AccountSinhVien\r\n" + 
				"WHERE ID IN ( SELECT AccountSinhVien.ID FROM AccountSinhVien ,  SinhVien ,  Lop , ChuyenNganh , Khoa \r\n" + 
				"WHERE AccountSinhVien.ID = SinhVien.ID_SinhVien AND SinhVien.ID_FK_Lop = Lop.ID_Lop AND Lop.ID_FK_ChuyenNganh = ChuyenNganh.ID_ChuyenNganh \r\n" + 
				"AND ChuyenNganh.ID_FK_Khoa = Khoa.ID_Khoa AND ID_Khoa = ?  )  "; 
 		try {
 			PreparedStatement pre = DBContext.connect.prepareStatement( sql_acc ); 
 			pre.setString( 1 , maKhoa ); 
 			pre.execute();
 		} catch( Exception e ) {
 			System.out.println( "KhoaDAO deleteKhoa()_AccountSinhVien" );
 			System.out.println( e );
 		}
 		
 		String sql_BD = " DELETE BangDiem \r\n" + 
 				"WHERE ID_SV IN ( SELECT BangDiem.ID_SV FROM BangDiem ,  SinhVien ,  Lop , ChuyenNganh , Khoa \r\n" + 
 				"WHERE BangDiem.ID_SV = SinhVien.ID_SinhVien AND SinhVien.ID_FK_Lop = Lop.ID_Lop AND Lop.ID_FK_ChuyenNganh = ChuyenNganh.ID_ChuyenNganh \r\n" + 
 				"AND ChuyenNganh.ID_FK_Khoa = Khoa.ID_Khoa AND ID_Khoa = ? ) "; 
 		try {
 			PreparedStatement pre = DBContext.connect.prepareStatement( sql_BD ); 
 			pre.setString( 1 , maKhoa ); 
 			pre.execute();
 		} catch( Exception e ) {
 			System.out.println( "KhoaDAO deleteKhoa()_BangDiem" );
 			System.out.println( e );
 		}
 		
 		
 		String sql_SV = " DELETE SinhVien\r\n" + 
 				"WHERE ID_SinhVien IN ( SELECT SinhVien.ID_SinhVien FROM SinhVien ,  Lop , ChuyenNganh , Khoa \r\n" + 
 				"WHERE SinhVien.ID_FK_Lop = Lop.ID_Lop AND Lop.ID_FK_ChuyenNganh = ChuyenNganh.ID_ChuyenNganh AND ChuyenNganh.ID_FK_Khoa = Khoa.ID_Khoa AND ID_Khoa = ?  ) "; 
 		try {
 			PreparedStatement pre = DBContext.connect.prepareStatement( sql_SV ); 
 			pre.setString( 1 , maKhoa); 
 			pre.execute();
 		} catch( Exception e ) {
 			System.out.println( "KhoaDAO deleteKhoa()_SinhVien" );
 			System.out.println( e );
 		}
 		
 		String sql_Lop = " DELETE Lop \r\n" + 
 				"WHERE ID_Lop IN ( SELECT Lop.ID_Lop FROM Lop , ChuyenNganh , Khoa \r\n" + 
 				"WHERE  Lop.ID_FK_ChuyenNganh = ChuyenNganh.ID_ChuyenNganh AND ChuyenNganh.ID_FK_Khoa = Khoa.ID_Khoa AND ID_Khoa = ? ) "; 
 		try {
 			PreparedStatement pre = DBContext.connect.prepareStatement( sql_Lop ); 
 			pre.setString( 1 , maKhoa ); 
 			pre.execute();
 		} catch( Exception e ) {
 			System.out.println( "KhoaDAO deleteKhoa()_Lop" );
 			System.out.println( e );
 		}
 		
 		String sql_CN = " DELETE ChuyenNganh\r\n" + 
 				"WHERE ID_ChuyenNganh IN ( SELECT ChuyenNganh.ID_ChuyenNganh FROM ChuyenNganh , Khoa WHERE ChuyenNganh.ID_FK_Khoa = Khoa.ID_Khoa AND ID_Khoa = ? ) "; 
 		try {
 			PreparedStatement pre = DBContext.connect.prepareStatement( sql_CN ); 
 			pre.setString( 1 , maKhoa ); 
 			pre.execute(); 
 		} catch( Exception e ) {  
 			System.out.println( "KhoaDAO deleteKhoa()_CN" ); 
 			System.out.println( e );
 		}
 		
 		String sql_Khoa = " DELETE Khoa\r\n" + 
 				"WHERE ID_Khoa = ?   "; 
 		try {
 			PreparedStatement pre = DBContext.connect.prepareStatement( sql_Khoa ); 
 			pre.setString( 1 , maKhoa ); 
 			pre.execute(); 
 		} catch( Exception e ) {  
 			System.out.println( "KhoaDAO deleteKhoa()_Khoa" ); 
 			System.out.println( e );
 		}
 		
	}
	
	
	
}
