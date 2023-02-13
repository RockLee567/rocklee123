package dal;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.GiangVien;
import model.MonHoc; 


public class GiangVienDAO {
    public List<GiangVien> listGiangVien; 
    
    
    public GiangVienDAO() {
    	listGiangVien = new ArrayList<>(); 
    }
    
    
    public void showListGiangVien() {
    	String sql = "SELECT * FROM GiangVien"; 
    	try {
    		
    		Statement sta = DBContext.connect.createStatement() ; 
    		ResultSet res = sta.executeQuery( sql ); 
    		
    		while( res.next() ) {
    			GiangVien gv = new GiangVien(); 
    			gv.setMaGV( res.getString(  "ID_GiangVien"  ) );
    			gv.setTenGV( res.getNString( "Ten_GiangVien" ) );
    			gv.setGioiTinh( res.getNString( "GioiTinh" ) ); 
    			gv.setDiaChi( res.getNString( "diaChi" ) );
    			
    			gv.setSdt( res.getInt( "sdt_gv" ) );
    			gv.setEmail( res.getNString( "email" )  );
    			listGiangVien.add( gv );
    		}
    		
    	} catch( Exception e ) {
    		System.out.println( "GiangVienDAO showListGiangVien()" );
    		System.out.println( e );
    	}
    }
    
    public void appendGiangVien( String maGV , String tenGV , String gt ,String diaChi , int sdt , String email ) {
    	String sql = "INSERT INTO GiangVien VALUES( ? , ? , ? , ? , ? , ? ) " ; 
    	try {
    		PreparedStatement pre = DBContext.connect.prepareStatement(sql);  
    		pre.setString( 1 , maGV ); 
    		pre.setNString( 2 , tenGV ); 
    		pre.setString( 3 , gt ); 
    		pre.setString( 4 , diaChi ); 
    		pre.setInt( 5 , sdt ); 
    		pre.setString( 6 , email ); 
    		pre.execute(); 
    	} catch( Exception e ) {
    		System.out.println( "GiangVienDAO appendGiangVien()" );
    		System.out.println( e );
    	}
    }
    
    public boolean deleteGiangVien( String maGV ) {
    	String sql = "DELETE GiangVien WHERE ID_GiangVien = ? "; 
    	try {
    		
    		PreparedStatement pre = DBContext.connect.prepareStatement(sql);  
    		pre.setString( 1 , maGV );
    		pre.execute(); 
    		return true; 
    	} catch( Exception e ) {
    		System.out.println( "GiangVienDAO deleteGiangVien()" );
    		System.out.println( e );
    	}
    	return false; 
    }
    
    public GiangVien checkGiangVien( String maGV ) {
    	
    	String sql = "SELECT * FROM GiangVien WHERE ID_GiangVien = ? " ; 
    	
    	try {
    		PreparedStatement pre = DBContext.connect.prepareStatement(sql);  
    		pre.setString( 1 , maGV );
    		pre.execute(); 
            
    		ResultSet res =  pre.executeQuery() ; 
    		
    		if( res.next() ) {
    			GiangVien gv = new GiangVien(); 
    			gv.setMaGV( res.getString( "ID_GiangVien" ) );
    			gv.setTenGV( res.getNString( "Ten_GiangVien" ) ); 
    			gv.setGioiTinh( res.getNString( "GioiTinh" ) ); 
    			gv.setDiaChi( res.getNString( "diaChi" ) ); 
    			gv.setSdt( res.getInt( "sdt_gv" ) );
    			gv.setEmail( res.getNString( "email" ) ); 
    			return gv; 
    		}
    		
    	} catch ( Exception e ) {
    		System.out.println( "GiangVienDAO checkGiangVien()" );
    		System.out.println( e );
    	}
    	return null; 
    }
    
    
    
}
