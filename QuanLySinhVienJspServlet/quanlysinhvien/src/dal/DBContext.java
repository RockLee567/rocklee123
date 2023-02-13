package dal;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
	public static String user = "JSPServlet"; 
	public static String password = "123456789"; 
	public static String URL_Server = "jdbc:sqlserver://localhost:1433; database=QuanLySV";
	
	public static Connection getConnect() {
		try {
			Class.forName( "com.microsoft.sqlserver.jdbc.SQLServerDriver" );
			return DriverManager.getConnection( URL_Server , user , password ) ; 
		} 
		catch( Exception e ) {
			e.printStackTrace(); 
		}
		return null; 
	} 
	
	public static Connection connect = getConnect(); 
}
