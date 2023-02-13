package model;

import model.Lop;


public class SinhVien {
     private int maSinhVien; 
     private String tenSinhVien; 
     private String ngaySinh; 
     private String gioiTinh; 
     private String queQuan; 
     private int sdt ; 
     private String email; 
     private Lop lop;
     
     
     
     
	public SinhVien() {
		super();
	}
	

	public SinhVien(int maSinhVien, String tenSinhVien, String ngaySinh, String gioiTinh, String queQuan, int sdt,
			String email, Lop lop) {
		super();
		this.maSinhVien = maSinhVien;
		this.tenSinhVien = tenSinhVien;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.queQuan = queQuan;
		this.sdt = sdt;
		this.email = email;
		this.lop = lop;
	}










	public int getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getTenSinhVien() {
		return tenSinhVien;
	}
	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Lop getLop() {
		return lop;
	}
	public void setLop(Lop lop) {
		this.lop = lop;
	}
     
    
     
	
    
	
     
     
}
