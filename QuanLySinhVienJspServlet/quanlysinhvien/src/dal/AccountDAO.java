package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Account;

public class AccountDAO {
    public Account acc;
    public List<Account> listAccountAdmin ; 
    public List<Account> listAccountSinhVien ; 
    
	public AccountDAO() {
		super();
		this.listAccountAdmin = new ArrayList<>(); 
		this.listAccountSinhVien = new ArrayList<>(); 
	}

	public AccountDAO(Account acc) {
		super(); 
		this.acc = acc;
		this.listAccountAdmin = new ArrayList<>(); 
		this.listAccountSinhVien = new ArrayList<>(); 
	} 
	
	
	public void showlistAccount( ) {
		String sql_SinhVien = "SELECT * FROM AccountSinhVien"; 
		
		try {
			
			Statement sta = DBContext.connect.createStatement(); 
			
			ResultSet res = sta.executeQuery(sql_SinhVien); 
			while( res.next() ) {
				
				Account acSV = new Account(); 
			
				acSV.setId( res.getInt( "ID_AccountSV" ) );
				acSV.setUsername( res.getInt("ID") );
				acSV.setPassword( res.getString("PASS") );
				acSV.setChoose( 0 );
				
				listAccountSinhVien.add( acSV ); 
			}
			
		}catch( Exception e ) {
			System.out.println( "AccountDAO showlistAccount1()" );
			System.out.println( e );
		}
		
        String sql_Admin = "SELECT * FROM AccountAdmin"; 
		
		try {
			
			Statement sta = DBContext.connect.createStatement(); 
			
			ResultSet res = sta.executeQuery(sql_Admin); 
			while( res.next() ) {
				
				Account acAd = new Account(); 
				acAd.setId( res.getInt( "ID_AccountAdmin" ) );
				acAd.setUsername( res.getInt("ID") );
				acAd.setPassword( res.getString("PASS") );
				acAd.setChoose( 1 );
				
				listAccountAdmin.add( acAd ); 
			}
			
		}catch( Exception e ) {
			System.out.println( "AccountDAO showlistAccount2()" );
			System.out.println( e );
		}
	}
	
	
	public void addAccount( int user , String pass , int lt ) {
		String sql = ""; 
		if( lt == 1 ) {
			sql = "INSERT INTO AccountAdmin VALUES( ? , ? , ?  ) "; 
		}
		else {
			sql = "INSERT INTO AccountSinhVien VALUES( ? , ? , ?  )"; 
		}
		
		try {
			
			PreparedStatement pre = DBContext.connect.prepareStatement(sql); 
			
			pre.setInt( 1 , user ); 
			
			pre.setString(2, pass); 
			pre.setInt( 3 , lt );
			pre.execute(); 
			
			
			
			
		}catch( Exception e ) {
			System.out.println( "AccountDAO addAccount()" );
			System.out.println( e );
		}
		
	}
	
	public void deleteAccount( int id , int role) {
		String sql = ""; 
		if( role == 1 ) {
			sql = "DELETE AccountAdmin WHERE ID_AccountAdmin = ? "; 
		}
		else {
			sql = "DELETE AccountSinhVien WHERE ID_AccountSV = ?  "; 
		}
		
		try {
			
			PreparedStatement pre = DBContext.connect.prepareStatement(sql); 
			
			pre.setInt( 1 , id ); 
			
			pre.execute(); 

		}catch( Exception e ) {
			System.out.println( "AccountDAO deleteAccount()" );
			System.out.println( e );
		}
		
	}
	
	
	public Account checkAccount( int user , String pass , int lt ) {
		String sql = ""; 
		if( lt == 0 ) {
			sql = "SELECT * FROM AccountSinhVien WHERE ID = ? AND PASS = ?"; 
		}
		else {
			sql = "SELECT * FROM AccountAdmin WHERE ID = ? AND PASS = ?"; 
		}
		
		try {
			
			PreparedStatement pre = DBContext.connect.prepareStatement(sql); 
			
			pre.setInt( 1 , user ); 
			
			pre.setString(2, pass); 
			
			pre.execute(); 
			
			ResultSet res = pre.executeQuery(); 
			if( res.next() ) {
				
				Account ac = new Account(); 
				ac.setUsername( res.getInt("ID") );
				ac.setPassword( res.getString("PASS") );
				ac.setChoose( lt);
				
				return ac; 
			}
			
		}catch( Exception e ) {
			System.out.println( "AccountDAO checkAccount()" );
			System.out.println( e );
		}
		return null; 
	}
	
	public void updateMatKhau( int username ,  String pass , int role ) {
		String sql = ""; 
		if( role == 1 ) {
			sql = "UPDATE AccountAdmin SET PASS = ? WHERE ID = ? "; 
		}
		else {
			sql = "UPDATE AccountSinhVien SET PASS = ? WHERE ID = ?"; 
		}
		
		try {
			
			PreparedStatement pre = DBContext.connect.prepareStatement(sql); 
			
			pre.setString( 1 , pass ); 
			
			pre.setInt(2, username ); 
			
			pre.execute(); 
			
			
			
		}catch( Exception e ) {
			System.out.println( "AccountDAO updateMatKhau()" );
			System.out.println( e );
		}
	}
     
     
}
