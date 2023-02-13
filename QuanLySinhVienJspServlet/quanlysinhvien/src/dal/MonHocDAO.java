package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.MonHoc;


public class MonHocDAO {
	
    public List<MonHoc> listMonHoc; 
    
    public MonHocDAO() {
    	super(); 
    	listMonHoc = new ArrayList<>(); 
    }
    
    public void showListMonHoc() {
    	String sql = "SELECT * FROM MonHoc " ; 
    	
    	try {
    		Statement sta = DBContext.connect.createStatement() ; 
    		ResultSet res = sta.executeQuery( sql ); 
    		
    		while( res.next() ) {
    			MonHoc mh = new MonHoc(); 
    			mh.setMaMonHoc( res.getString( "ID_MonHoc" ) );
    			mh.setTenMonHoc( res.getNString( "Ten_MonHoc" ) );
    			mh.setSoTinChi( res.getString( "SoTinChi" ) );
    			listMonHoc.add( mh ) ; 
    		}
    		
    	} catch( Exception e ) {
    		System.out.println( "MonHocDAO showListMonHoc()" );
    		System.out.println( e );
    	}
    }
    
    public String tinChi( String maMonHoc ) {
        String sql = "SELECT SoTinChi FROM MonHoc WHERE ID_MonHoc = ? " ; 
    	String tinChi = ""; 
    	try {
    		PreparedStatement pre = DBContext.connect.prepareStatement(sql);  
    		pre.setString( 1 , maMonHoc ); 
    		ResultSet res = pre.executeQuery(); 
    		
    		if( res.next() ) {
    			tinChi = res.getString( "SoTinChi" ) ; 
    		}
    		
    	} catch( Exception e ) {
    		System.out.println( "MonHocDAO showListMonHoc()" );
    		System.out.println( e );
    	}
    	return tinChi; 
    }
    
    public void appendMonHoc( String maMH, String tenMH , String soTin ) {
    	String sql = "INSERT INTO MonHoc VALUES( ? , ? , ? ) " ; 
    	try {
    		PreparedStatement pre = DBContext.connect.prepareStatement(sql);  
    		pre.setString( 1 , maMH ); 
    		pre.setNString( 2 , tenMH ); 
    		pre.setString( 3 , soTin ); 
    		pre.execute(); 
    	} catch( Exception e ) {
    		System.out.println( "MonHocDAO appendMonHoc()" );
    		System.out.println( e );
    	}
    }
    
    public boolean deleteMonHoc( String maMH ) {
    	String sql = "DELETE MonHoc WHERE ID_MonHoc = ? "; 
    	System.out.println( maMH );
    	try {
    		
    		PreparedStatement pre = DBContext.connect.prepareStatement(sql);  
    		pre.setString( 1 , maMH );
    		pre.execute(); 
    		return true; 
    	} catch( Exception e ) {
    		System.out.println( "MonHocDAO deleteMonHoc()" );
    		System.out.println( e );
    	}
    	return false; 
    }
    
    public MonHoc checkMonHoc( String maMH ) {
    	
    	String sql = "SELECT * FROM MonHoc WHERE ID_MonHoc = ? " ; 
    	
    	try {
    		PreparedStatement pre = DBContext.connect.prepareStatement(sql);  
    		pre.setString( 1 , maMH );
    		pre.execute(); 
            
    		ResultSet res =  pre.executeQuery() ; 
    		
    		if( res.next() ) {
    			
    			MonHoc mh = new MonHoc(); 
    			mh.setMaMonHoc( res.getString( "ID_MonHoc" ) ); 
    			mh.setTenMonHoc( res.getNString( "Ten_MonHoc" ) ); 
    			mh.setSoTinChi( res.getString( "SoTinChi" ) );
    			return mh; 
    		}
    		
    	} catch ( Exception e ) {
    		System.out.println( "MonHocDAO checkMonHoc()" );
    		System.out.println( e );
    	}
    	return null; 
    }
    
    
}
