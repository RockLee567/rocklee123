package dal;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.MonHoc;
import model.NamHoc;


public class NamHocDAO {
    public List<NamHoc> listNamHoc ; 
    
    public NamHocDAO() {
    	listNamHoc = new ArrayList<>(); 
    }
    
    public void showListNamHoc() {
    	String sql = "SELECT * FROM NamHoc" ; 
    	try {
    		Statement sta = DBContext.connect.createStatement() ; 
    		ResultSet res = sta.executeQuery( sql ); 
    		
    		while( res.next() ) {
    			NamHoc nh = new NamHoc(); 
    			nh.setMaNamHoc( res.getString( "ID_NamHoc" ) ); 
    			nh.setTenNamHoc( res.getString( "NH" ) ); 
    			
    			listNamHoc.add( nh ); 
    			
    		}
    	} catch( Exception e ) {
    		System.out.println( "NamHocDAO showListNamHoc()" );
    		System.out.println( e );
    	}
    }
    
}
