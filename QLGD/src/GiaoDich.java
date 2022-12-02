import java.util.Scanner;

/*
 * Mục đích: Tạo lớp superclass để lưu trữ và xử lý liên quan Giao Dịch
 * Người tạo: Trịnh Hoài Thanh
 */
public class GiaoDich {
	//1. Attributes
	protected int maGiaoDich;
	protected int ngay;
	protected int thang;
	protected int nam;
	protected float donGia;
	protected int soLuong;
	protected float thanhTien;
	//2. Get, set methods
	
	public int getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(int maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public float getThanhTien() {
		return thanhTien;
	}

	//3. Constructors
	public GiaoDich() {
		// TODO Auto-generated constructor stub
	}

	public GiaoDich(int maGiaoDich, int ngay, int thang, int nam, int donGia, int soLuong) {
		this.maGiaoDich = maGiaoDich;
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	
	//4. Input, output methods
	public void nhap(Scanner scan)
	{
		System.out.println("Nhập mã: ");
		this.maGiaoDich = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập ngày: ");
		this.ngay = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập tháng: ");
		this.thang = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập năm: ");
		this.nam = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập số lượng: ");
		this.soLuong = Integer.parseInt(scan.nextLine());
		System.out.println("Nhập đơn giá: ");
		this.donGia = Float.parseFloat(scan.nextLine());
	}
	public void xuat()
	{
		System.out.println("Mã: "+ this.maGiaoDich+"\t Ngày/tháng/năm: "+this.ngay+"/"+this.thang+"/"+this.nam
				+"\t Số lượng: "+this.soLuong+"\t Đơn giá: "+this.donGia);
	}
	//5. Business methods
	public void tinhTien()
	{
		this.thanhTien=0;
	}

}
