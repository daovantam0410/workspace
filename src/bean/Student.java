package bean;

public class Student {
	private String mSV;
	private String hoTen;
	
	public String getmSV() {
		return mSV;
	}
	public void setmSV(String mSV) {
		this.mSV = mSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Student(String mSV, String hoTen) {
		this.mSV = mSV;
		this.hoTen = hoTen;
	}
	
	public Student() {}
	
}
