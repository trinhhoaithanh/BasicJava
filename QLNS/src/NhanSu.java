import java.util.Scanner;

public class NhanSu {
	//1. Attributes
	protected String hoTen;
	protected String maSo;
	protected String soDienThoai;
	protected float soNgayLamViec;
	protected float luong;
	//2. get set
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}
	public float getLuong()
	{
		return this.luong;
	}

	//3. Constructor
	public NhanSu() {
		// TODO Auto-generated constructor stub
	}

	public NhanSu(String hoTen, String maSo, String soDienThoai, float soNgayLamViec) {
		super();
		this.hoTen = hoTen;
		this.maSo = maSo;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;
	}
	
	//4. Input, output method
	public void nhap(Scanner scan)
	{
		System.out.println("===================Thêm nhân sự======================");
		System.out.println("Nhập mã số");
		this.maSo = scan.nextLine();
		System.out.println("Nhập họ tên");
		this.hoTen = scan.nextLine();
		System.out.println("Nhập số điện thoại");
		this.soDienThoai = scan.nextLine();
		System.out.println("Nhập số ngày làm việc");
		this.soNgayLamViec = Float.parseFloat(scan.nextLine());
		System.out.println("==================Kết thúc===================");
		this.maSo = scan.nextLine();
		
	}
	public void xuat()
	{
		System.out.println("Mã số: "+this.maSo);
		System.out.println("\t Họ tên: "+this.hoTen);
		System.out.println("\t Số điện thoại: "+this.soDienThoai);
		System.out.println("\t Số ngày làm việc: "+this.soNgayLamViec);
	}
	public void xuatMaVaTen()
	{
		System.out.println("Mã: "+this.maSo+"\t Tên: "+this.hoTen);
	}
	//5. Business
	public void tinhLuong()
	{
		this.luong=0;
	}

}
