package model;

public class BangDiem {
	 private int maBD; 
     private int maSV; 
     private String tenMonHoc; 
     private String maTinChi; 
     private String tenGV; 
     private String hocKy; 
     private String namHoc; 
     private float diem;
     
     
	public BangDiem() {
		super();
	}
	public BangDiem(int maBD, int maSV, String tenMonHoc, String maTinChi, String tenGV, String hocKy, String namHoc,
			float diem) {
		super();
		this.maBD = maBD;
		this.maSV = maSV;
		this.tenMonHoc = tenMonHoc;
		this.maTinChi = maTinChi;
		this.tenGV = tenGV;
		this.hocKy = hocKy;
		this.namHoc = namHoc;
		this.diem = diem;
	}
	public int getMaBD() {
		return maBD;
	}
	public void setMaBD(int maBD) {
		this.maBD = maBD;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getTenMonHoc() {
		return tenMonHoc;
	}
	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}
	public String getMaTinChi() {
		return maTinChi;
	}
	public void setMaTinChi(String maTinChi) {
		this.maTinChi = maTinChi;
	}
	public String getTenGV() {
		return tenGV;
	}
	public void setTenGV(String tenGV) {
		this.tenGV = tenGV;
	}
	public String getHocKy() {
		return hocKy;
	}
	public void setHocKy(String hocKy) {
		this.hocKy = hocKy;
	}
	public String getNamHoc() {
		return namHoc;
	}
	public void setNamHoc(String namHoc) {
		this.namHoc = namHoc;
	}
	public float getDiem() {
		return diem;
	}
	public void setDiem(float diem) {
		this.diem = diem;
	}
     
     
     
     
     
	
	
     
     
     
     
     
}
