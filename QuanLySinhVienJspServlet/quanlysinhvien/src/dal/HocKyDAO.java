package dal;


import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.HocKy;
import model.NamHoc; 

public class HocKyDAO {
    public List<HocKy> listHocKy;

	public HocKyDAO() {
		super();
	    listHocKy = new ArrayList<>(); 
	} 
	
	public void showListHocKy() {
		
		String sql = "SELECT * FROM HocKy" ; 
    	try {
    		Statement sta = DBContext.connect.createStatement() ; 
    		ResultSet res = sta.executeQuery( sql ); 
    		
    		while( res.next() ) {
    			HocKy hk = new HocKy(); 
    			hk.setMaHocKy(  res.getString( "ID_HocKy" ) ); 
    			hk.setTenHocKy(  res.getString( "HK" ) ); 
    			
    			listHocKy.add( hk ); 
    			
    		}
    	} catch( Exception e ) {
    		System.out.println( "HocKyDAO showListHocKy()" );
    		System.out.println( e );
    	}
		
	}
    
    
    
    
}
