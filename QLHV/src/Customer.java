import java.util.Scanner;

/*
 * Mục đích ; quản lý nghiệp vụ cho customer
 */
public class Customer extends Person {
	//1. Attribute
	private String tenCongTy;
	private float triGiaHoaDon;
	private String danhGia;
	//2. get set 
	
	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public float getTriGiaHoaDon() {
		return triGiaHoaDon;
	}

	public void setTriGiaHoaDon(float triGiaHoaDon) {
		this.triGiaHoaDon = triGiaHoaDon;
	}

	public String getDanhGia() {
		return danhGia;
	}

	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
	}

	//3. constructor
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String hoTen, String diaChi, String ma, String email, float triGiaHoaDon, String tenCongTy, String danhGia) {
		super(hoTen, diaChi, ma, email);
		// TODO Auto-generated constructor stub
		this.tenCongTy=  tenCongTy;
		this.triGiaHoaDon = triGiaHoaDon;
		this.danhGia = danhGia;
	}
	//4. input, output
	@Override 
	public void nhap(Scanner scan)
	{
		super.nhap(scan);
		System.out.println("Tên công ty: ");
		this.tenCongTy = scan.nextLine();
		System.out.println("Trị giá hóa đơn: ");
		this.triGiaHoaDon = Float.parseFloat(scan.nextLine());
		System.out.println("Đánh giá: ");
		this.danhGia = scan.nextLine();
	}
	@Override 
	public void xuat()
	{
		System.out.print("\t Tên công ty: "+this.tenCongTy+"\t Trị giá hóa đơn: "+this.triGiaHoaDon+"\t Đánh giá: "+ this.danhGia);
	}
	//5. business
	

}
