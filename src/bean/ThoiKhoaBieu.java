package bean;

public class ThoiKhoaBieu {
	protected int id;
	protected String monHoc;
	protected int thu;
	protected int tietBatDau;
	protected int soTiet;
	protected String giangDuong;
	protected int tuanHoc;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMonHoc() {
		return monHoc;
	}
	public void setMonHoc(String monHoc) {
		this.monHoc = monHoc;
	}
	public int getThu() {
		return thu;
	}
	public void setThu(int thu) {
		this.thu = thu;
	}
	public int getTietBatDau() {
		return tietBatDau;
	}
	public void setTietBatDau(int tietBatDau) {
		this.tietBatDau = tietBatDau;
	}
	public int getSoTiet() {
		return soTiet;
	}
	public void setSoTiet(int soTiet) {
		this.soTiet = soTiet;
	}
	public String getGiangDuong() {
		return giangDuong;
	}
	public void setGiangDuong(String giangDuong) {
		this.giangDuong = giangDuong;
	}
	public int getTuanHoc() {
		return tuanHoc;
	}
	public void setTuanHoc(int tuanHoc) {
		this.tuanHoc = tuanHoc;
	}
	
	public ThoiKhoaBieu() {
		
	}
	
	public ThoiKhoaBieu(int id, String monHoc, int thu, int tietBatDau, int soTiet, String giangDuong, int tuanHoc) {
		this.id = id;
		this.monHoc = monHoc;
		this.thu = thu;
		this.tietBatDau = tietBatDau;
		this.soTiet = soTiet;
		this.giangDuong = giangDuong;
		this.tuanHoc = tuanHoc;
	}
}
