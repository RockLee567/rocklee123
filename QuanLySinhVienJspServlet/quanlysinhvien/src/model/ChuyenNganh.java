package model;

import java.util.ArrayList;
import java.util.List;

public class ChuyenNganh {
    private String maChuyenNganh; 
    private String tenChuyenNganh; 
    private Khoa khoa; 
    private List<Lop> listLop; 
    
    public Khoa getKhoa() {
		return khoa;
	}

	public void setKhoa(Khoa khoa) {
		this.khoa = khoa;
	}
	
    

    
	public ChuyenNganh() {
		super();
		this.maChuyenNganh = maChuyenNganh;
		this.tenChuyenNganh = tenChuyenNganh;
		this.khoa = null; 
		this.listLop = new ArrayList<>() ;
		
	}

	public ChuyenNganh(String maChuyenNganh, String tenChuyenNganh, List<Lop> listLop
			) {
		super();
		this.maChuyenNganh = maChuyenNganh;
		this.tenChuyenNganh = tenChuyenNganh;
		
		this.listLop = listLop;
	
	}
	
	public String getMaChuyenNganh() {
		return maChuyenNganh;
	}
	public void setMaChuyenNganh(String maChuyenNganh) {
		this.maChuyenNganh = maChuyenNganh;
	}
	public String getTenChuyenNganh() {
		return tenChuyenNganh;
	}
	public void setTenChuyenNganh(String tenChuyenNganh) {
		this.tenChuyenNganh = tenChuyenNganh;
	}
	
	public List<Lop> getListLop() {
		return listLop;
	}
	public void setListLop(List<Lop> listLop) {
		this.listLop = listLop;
	}
	
    
 
    
}
