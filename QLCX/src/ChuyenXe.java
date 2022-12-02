import java.util.Scanner;

/*
 * Mục đích: Lớp cha quản lí các chuyến xe
 */
public class ChuyenXe {
	//1. Attributes
	protected String maSoChuyenXe;
	protected String hoTenTaiXe;
	protected String soXe;
	protected float doanhThu;
	//2. Get set methods
	
	public String getMaSoChuyenXe() {
		return maSoChuyenXe;
	}

	public void setMaSoChuyenXe(String maSoChuyenXe) {
		this.maSoChuyenXe = maSoChuyenXe;
	}

	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}

	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public float getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(float doanhThu) {
		this.doanhThu = doanhThu;
	}

	//3. Constructors
	public ChuyenXe() {
		
	}

	public ChuyenXe(String maSoChuyenXe, String hoTenTaiXe, String soXe, float doanhThu) {
		super();
		this.maSoChuyenXe = maSoChuyenXe;
		this.hoTenTaiXe = hoTenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	
	//4. Input, output methods
	public void nhap(Scanner scan)
	{
		System.out.print("Nhập mã số chuyến: ");
		this.maSoChuyenXe = scan.nextLine();
		System.out.print("Nhập họ tên tài xế: ");
		this.hoTenTaiXe = scan.nextLine();
		System.out.print("Nhập số xe: ");
		this.soXe = scan.nextLine();
		System.out.print("Nhập doanh thu: ");
		this.doanhThu = Float.parseFloat(scan.nextLine());
	}
	public void xuat()
	{
		System.out.println("Mã số chuyến: "+ this.maSoChuyenXe+"\t Họ tên tài xế: "+this.hoTenTaiXe+"\t Số xe: "+this.soXe+"\t Doanh thu: "+this.doanhThu);
	}
	//5. Business methods
	

}
