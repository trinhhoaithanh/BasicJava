import java.util.Scanner;

/*
 * Mục đích: quản lí các giao dịch vàng
 */
public class GiaoDichVang extends GiaoDich {
	//1. Attributes
	private String loaiVang;
	//2. Get,set method
	
	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}

	//3. Constructors
	public GiaoDichVang() {
		// TODO Auto-generated constructor stub
	}

	public GiaoDichVang(int maGiaoDich, int ngay, int thang, int nam, int donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngay, thang, nam, donGia, soLuong);
		// TODO Auto-generated constructor stub
		this.loaiVang = loaiVang;
	}
	//4. Input, output methods
	@Override 
	public void nhap(Scanner scan)
	{
		super.nhap(scan);
		System.out.println("Nhập loại vàng: ");
		this.loaiVang = scan.nextLine();
		
	}
	@Override
	public void xuat()
	{
		super.xuat();
		System.out.println("\t Loại vàng: "+this.loaiVang+"\t Thành tiền: "+ this.thanhTien);
		
	}
	//5. Business methods
	@Override
	public void tinhTien()
	{
		this.thanhTien = this.donGia*this.soLuong;
	}

}
