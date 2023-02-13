package model;

import java.util.List;

public class Lop {
    private String maLop; 
    private String tenLop; 
    private ChuyenNganh cNganh;
    private List<SinhVien> listSinhVien; 
    
    
	public Lop() {
		this.cNganh = null;
		this.maLop = "Unknown";
		this.tenLop = "Unknown";
	}
    
	public Lop( String maLop, String tenLop ) {
		super();
		this.cNganh = null;
		this.maLop = maLop;
		this.tenLop = tenLop;
	}


	public Lop(String maLop, String tenLop, ChuyenNganh cNganh) {
		super();
		this.maLop = maLop;
		this.tenLop = tenLop;
		this.cNganh = cNganh;
	}



	public String getMaLop() {
		return maLop;
	}



	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}



	public String getTenLop() {
		return tenLop;
	}



	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}



	public ChuyenNganh getcNganh() {
		return cNganh;
	}



	public void setcNganh(ChuyenNganh cNganh) {
		this.cNganh = cNganh;
	}
	
	
    
    
    
    
}
