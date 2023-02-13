package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.ChuyenNganh;
import model.Khoa;
import model.Lop;
import model.MonHoc;

public class ChuyenNganhDAO {
	
     public List<ChuyenNganh> listChuyenNganh ; 
     
     
     public ChuyenNganhDAO() {
    	 listChuyenNganh = new ArrayList<>(); 
    	 //String sql = "SELECT * FROM "
     }
     
     // Tim 1 chuyen nganh 
     public ChuyenNganh getChuyenNganhByID_ChuyenNganh( String ID_ChuyenNganh ) {
    	 String sql = "SELECT * FROM ChuyenNganh WHERE ID_ChuyenNganh = ? "; 
    	 try {
    		 PreparedStatement pre = DBContext.connect.prepareStatement( sql ); 
    		 pre.setString( 1 , ID_ChuyenNganh ); 
    		 pre.execute(); 
    		 ResultSet res = pre.executeQuery(); 
    		 if( res.next() ) {
    			 ChuyenNganh cn = new ChuyenNganh(); 
    			 cn.setMaChuyenNganh( res.getString( "ID_ChuyenNganh" ) ); 
    			 cn.setTenChuyenNganh( res.getNString( "Ten_ChuyenNganh" ) ); 
    			 KhoaDAO kDAO = new KhoaDAO(); 
    			 Khoa k = kDAO.getKhoaByID_Khoa( res.getString( "ID_FK_Khoa" ) );
    			 cn.setKhoa(k); 
    			 return cn; 
    		 }
    		 
    	 } catch( Exception e ) {
    		 System.out.println( "ChuyenNganhDAO getChuyenNganhByID_ChuyenNganh()" );
    		 System.out.println( e );
    	 }
    	 
    	 return null; 
     }
     
     
     // Danh sanh lop cua 1 chuyen nganh 
     public List<Lop> getLopByID_ChuyenNganh( String maChuyenNganh ){
    	 List<Lop> list = new ArrayList<>();
    	 String sql = "SELECT Lop.ID_Lop , Lop.Ten_Lop FROM Lop , ChuyenNganh WHERE "
    	 		+ "ID_FK_ChuyenNganh = ID_ChuyenNganh AND ID_ChuyenNganh = ? "; 
    	 try {
    		 PreparedStatement pre = DBContext.connect.prepareStatement(sql); 
    		 pre.setString( 1 , maChuyenNganh ); 
    		 pre.execute(); 
    		 ResultSet res = pre.executeQuery(); 
    		 if( res.next() ) {
    			 Lop lo = new Lop(); 
    			 lo.setMaLop( res.getString( "ID_Lop" ) );
    			 lo.setTenLop( res.getNString( "Ten_Lop" ) );
    			 list.add( lo ); 
    			 while( res.next() ) {
        			 Lop l = new Lop(); 
        			 l.setMaLop( res.getString( "ID_Lop" ) );
        			 l.setTenLop( res.getNString( "Ten_Lop" ) );
        			 list.add( l ); 
        		 }
    		 }
    		 else {
    			 Lop l = new Lop(); 
    			 list.add( l );
    		 }
    		 
    		 return list; 
    	 }catch( Exception e ) {
    		 System.out.println( "ChuyenNganhDAO getLopByID_ChuyenNganh()" );
    		 System.out.println( e );
    	 }
    	 
    	 return null; 
     }
     
     // Hien thi thong tin chuyen nganh 
     public void showChuyenNganh( String maKhoa ) {
    	 String sql = "SELECT ChuyenNganh.ID_ChuyenNganh , ChuyenNganh.Ten_ChuyenNganh FROM ChuyenNganh JOIN Khoa  \r\n" + 
    	 		"ON ChuyenNganh.ID_FK_Khoa = Khoa.ID_Khoa AND Khoa.ID_Khoa = ? "; 
    	 
    	 try {
    		 
    		 PreparedStatement pre = DBContext.connect.prepareStatement(sql); 
    		 pre.setString( 1 , maKhoa ); 
    		 pre.execute(); 
    		 ResultSet res = pre.executeQuery(); 
    		 while( res.next() ) {
    			 
    			 ChuyenNganh cn = new ChuyenNganh(); 
    			 cn.setMaChuyenNganh( res.getString("ID_ChuyenNganh") );
    			 cn.setTenChuyenNganh( res.getNString("Ten_ChuyenNganh") );
    			 KhoaDAO kDAO = new KhoaDAO(); 
    		    	Khoa k = kDAO.getKhoaByID_Khoa( maKhoa ); 
    		     cn.setKhoa(k);
    			 List<Lop> listLop = getLopByID_ChuyenNganh( res.getString("ID_ChuyenNganh") ) ; 
    			 cn.setListLop(listLop); 
    			 listChuyenNganh.add(cn); 
    		 }
    		 
    		 
    	 } catch( Exception e ) {
    		 System.out.println( "ChuyenNganhDAO showChuyenNganh()" );
    		 System.out.println( e ); 
    	 }
     }
     
     
     // Them chuyen nganh 
     public void themChuyenNganh( String maCN , String tenCN , String ID_Khoa ) {
    	 String sql = "INSERT INTO ChuyenNganh VALUES( ? , ? , ? ) "; 
    	 try {
    		 PreparedStatement pre = DBContext.connect.prepareStatement(sql); 
    		 pre.setString( 1 , maCN ); 
    		 pre.setNString( 2 , tenCN ); 
    		 pre.setString( 3 , ID_Khoa ); 
    		 pre.execute(); 

    	 } catch( Exception e ) {
    		 System.out.println( "ChuyenNganhDAO themChuyenNganh()" );
    		 System.out.println( e ); 
    	 }
     }
     
     public void updateChuyenNganh( String maCN , String tenCN ) {
    	 String sql = "UPDATE ChuyenNganh SET Ten_ChuyenNganh = ? WHERE ID_ChuyenNganh = ? ";       
    	 
    	 try {
    		 PreparedStatement pre = DBContext.connect.prepareStatement(sql); 
    		 pre.setNString( 1 , tenCN ); 
    		 pre.setString( 2 , maCN ); 
    		 pre.execute(); 
    	 } catch( Exception e ) {
    		 System.out.println( "ChuyenNganhDAO updateChuyenNganh()" ); 
    		 System.out.println( e );
    	 }
    	 
     }
     
     
     public void deleteChuyenNganh( String maChuyenNganh ) {
    	String sql_acc = " DELETE AccountSinhVien\r\n" + 
    	 		"WHERE ID IN ( SELECT SinhVien.ID_SinhVien FROM SinhVien , Lop , ChuyenNganh \r\n" + 
    	 		"WHERE  SinhVien.ID_FK_Lop = Lop.ID_Lop AND Lop.ID_FK_ChuyenNganh = ChuyenNganh.ID_ChuyenNganh AND ID_ChuyenNganh = ?  )   "; 
 		try {
 			PreparedStatement pre = DBContext.connect.prepareStatement( sql_acc ); 
 			pre.setString( 1 , maChuyenNganh ); 
 			pre.execute();
 		} catch( Exception e ) {
 			System.out.println( "ChuyenNganhDAO deleteChuyenNganh()_AccountSinhVien" );
 			System.out.println( e );
 		}
 		
 		String sql_BD = " DELETE BangDiem \r\n" + 
 				"WHERE ID_SV IN ( SELECT SinhVien.ID_SinhVien FROM SinhVien , Lop , ChuyenNganh \r\n" + 
 				"WHERE  SinhVien.ID_FK_Lop = Lop.ID_Lop AND Lop.ID_FK_ChuyenNganh = ChuyenNganh.ID_ChuyenNganh AND ID_ChuyenNganh = ?  )  "; 
 		try {
 			PreparedStatement pre = DBContext.connect.prepareStatement( sql_BD ); 
 			pre.setString( 1 , maChuyenNganh ); 
 			pre.execute();
 		} catch( Exception e ) {
 			System.out.println( "ChuyenNganhDAO deleteChuyenNganh()_BangDiem" );
 			System.out.println( e );
 		}
 		
 		
 		String sql_SV = " DELETE SinhVien\r\n" + 
 				"WHERE ID_SinhVien IN ( SELECT SinhVien.ID_SinhVien FROM SinhVien , Lop , ChuyenNganh \r\n" + 
 				"WHERE  SinhVien.ID_FK_Lop = Lop.ID_Lop AND Lop.ID_FK_ChuyenNganh = ChuyenNganh.ID_ChuyenNganh AND ID_ChuyenNganh = ?  )  "; 
 		try {
 			PreparedStatement pre = DBContext.connect.prepareStatement( sql_SV ); 
 			pre.setString( 1 , maChuyenNganh ); 
 			pre.execute();
 		} catch( Exception e ) {
 			System.out.println( "ChuyenNganhDAO deleteChuyenNganh()_SinhVien" );
 			System.out.println( e );
 		}
 		
 		String sql_Lop = " DELETE Lop \r\n" + 
 				"WHERE ID_Lop IN ( SELECT Lop.ID_Lop FROM  Lop , ChuyenNganh \r\n" + 
 				"WHERE  Lop.ID_FK_ChuyenNganh = ChuyenNganh.ID_ChuyenNganh AND ID_ChuyenNganh = ?  )  "; 
 		try {
 			PreparedStatement pre = DBContext.connect.prepareStatement( sql_Lop ); 
 			pre.setString( 1 , maChuyenNganh ); 
 			pre.execute();
 		} catch( Exception e ) {
 			System.out.println( "ChuyenNganhDAO deleteChuyenNganh()_Lop" );
 			System.out.println( e );
 		}
 		
 		String sql_CN = " DELETE ChuyenNganh\r\n" + 
 				"WHERE ID_ChuyenNganh = ?  "; 
 		try {
 			PreparedStatement pre = DBContext.connect.prepareStatement( sql_CN ); 
 			pre.setString( 1 , maChuyenNganh ); 
 			pre.execute(); 
 		} catch( Exception e ) {  
 			System.out.println( "ChuyenNganhDAO deleteChuyenNganh()_CN" ); 
 			System.out.println( e );
 		}
 		
 		
 		
 		
     }
     
     
     
}
