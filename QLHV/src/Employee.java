import java.util.Scanner;

/*
 * Mục đích: xử lý nghiệp vụ cho lớp employee
 */
public class Employee extends Person {
	//1. Attributes
	private float soNgayLamViec;
	private int luongTheoNgay;
	//2. Get, set method
	
	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	public int getLuongTheoNgay() {
		return luongTheoNgay;
	}

	public void setLuongTheoNgay(int luongTheoNgay) {
		this.luongTheoNgay = luongTheoNgay;
	}

	//3. Constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String hoTen, String diaChi, String ma, String email, float soNgayLamViec, int luongTheoNgay) {
		super(hoTen, diaChi, ma, email);
		// TODO Auto-generated constructor stub
		this.soNgayLamViec = soNgayLamViec;
		this.luongTheoNgay = luongTheoNgay;
	}
	//4. input, output methods
	@Override
	public void nhap(Scanner scan)
	{
		super.nhap(scan);
		System.out.print("Lương theo ngày: ");
		this.luongTheoNgay = Integer.parseInt(scan.nextLine());
		System.out.print("Số ngày làm việc: ");
		this.soNgayLamViec = Integer.parseInt(scan.nextLine());
	}
	@Override
	public void xuat()
	{
		System.out.println("\t Số ngày làm việc: "+this.soNgayLamViec+"\t Lương theo ngày: "+this.luongTheoNgay);
	}
	//5. Business methods
	

}
