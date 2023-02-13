package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.BangDiem;

public class BangDiemDAO {
    
	public List<BangDiem> listBangDiem;
	
	public BangDiemDAO(){
		super(); 
		listBangDiem = new ArrayList<>();  
	}
	
	public void showBangDiemTheoID_SV( int msv ) {
		String sql = "SELECT BangDiem.maBD , BangDiem.ID_SV ,   MonHoc.Ten_MonHoc , MonHoc.SoTinChi , GiangVien.Ten_GiangVien , HocKy.HK , Namhoc.NH , BangDiem.Diem FROM BangDiem , MonHoc , GiangVien , HocKy , NamHoc  \r\n" + 
				"WHERE MonHoc.ID_MonHoc = BangDiem.maMonHoc AND BangDiem.maGV = GiangVien.ID_GiangVien AND BangDiem.HocKy = HocKy.ID_HocKy AND BangDiem.NamHoc = NamHoc.ID_NamHoc\r\n" + 
				"AND BangDiem.ID_SV = ? " ;  
		try {
			PreparedStatement pre = DBContext.connect.prepareStatement( sql ); 
			pre.setInt( 1 , msv );
			pre.execute(); 
			ResultSet res = pre.executeQuery(); 
			while( res.next() ) {
				BangDiem bd = new BangDiem(); 
				bd.setMaBD( res.getInt( "maBD" ) );
				bd.setMaSV( res.getInt( "ID_SV" ) );
				bd.setTenMonHoc( res.getNString( "Ten_MonHoc" ) ) ; 
				bd.setMaTinChi( res.getString( "SoTinChi" ) ) ; 
				bd.setTenGV( res.getNString( "Ten_GiangVien" ) ); 
				bd.setHocKy( res.getString( "HK" ) ); 
				bd.setNamHoc( res.getString( "NH" ) ); 
				bd.setDiem( res.getFloat( "Diem" ) );
				listBangDiem.add( bd ); 
			}
			
			
		}catch( Exception e ) {
			System.out.println( "BangDiemDAO showBangDiemTheoID_SV()" );
			System.out.println( e );
		}
	}
	
	
	
	public void themBangDiem( int msv , String maMonHoc , String maTinChi , String maGV , String maHocKy , String maNamHoc , float diem ) {
		
		String sql = "INSERT INTO BangDiem VALUES( ? , ? , ? , ? , ? , ? , ? )  " ; 
		
		try {
			
			PreparedStatement pre = DBContext.connect.prepareStatement( sql ); 
			pre.setInt( 1 , msv );
			pre.setString( 2 , maMonHoc  );
			pre.setString( 3 , maTinChi  );
			pre.setString( 4 , maGV  );
			pre.setString( 5 , maHocKy  );
			pre.setString( 6 , maNamHoc  );  
			pre.setFloat( 7 , diem  ); 
			pre.execute(); 
			
		} catch( Exception e ) {
			System.out.println( e );
		}
	}
	
	public void xoaBangDiem( int maBD ) {
		
		String sql = "DELETE BangDiem WHERE maBD = ? "; 
		try {
			PreparedStatement pre = DBContext.connect.prepareStatement(sql) ; 
			pre.setInt( 1 ,  maBD ); 
			pre.execute(); 
					
		} catch( Exception e ) {
			System.out.println( "BangDiemDAO xoaBangDiem()" );
			System.out.println( e );
		}
		
		
	}
	
	
	
	
	
}
