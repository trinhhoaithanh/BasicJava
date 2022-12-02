import java.util.Scanner;

/*
 * Mục đích: quản lý giao dịch liên quan đến tiền tệ
 */
public class GiaoDichTienTe extends GiaoDich {
	//1. Attributes
	private float tiGia;
	private int loaiTienTe;
	//2. Get, set method
	
	public float getTiGia() {
		return tiGia;
	}

	public void setTiGia(float tiGia) {
		this.tiGia = tiGia;
	}

	public int getLoaiTienTe() {
		return loaiTienTe;
	}

	public void setLoaiTienTe(int loaiTienTe) {
		this.loaiTienTe = loaiTienTe;
	}

	//3. Constructors
	public GiaoDichTienTe() {
		
	}

	public GiaoDichTienTe(int maGiaoDich, int ngay, int thang, int nam, int donGia, int soLuong, float tiGia, int loaiTienTe) {
		super(maGiaoDich, ngay, thang, nam, donGia, soLuong);
		this.tiGia = tiGia;
		this.loaiTienTe = loaiTienTe;
	}
	//4. Input,output methods
	@Override
	public void nhap(Scanner scan)
	{
		super.nhap(scan);
		System.out.println("Nhập tỉ giá: ");
		this.tiGia = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập loại tiền tệ (1. VNĐ 2. USD 3. EURO)");
		this.loaiTienTe = Integer.parseInt(scan.nextLine());
	}
	@Override 
	public void xuat()
	{
		String temp="";
		if (this.loaiTienTe==1)
		{
			temp="VNĐ";
		}
		else if (this.loaiTienTe==2)
		{
			temp="USD";
		}
		else
		{
			temp = "EURO";
		}
		super.xuat();
		System.out.println("\t Tiền: "+ temp+"\t Tỉ giá"+this.tiGia+"\t Thành tiền: "+this.thanhTien);
		
	}
	//5. Business methods
	@Override
	public void tinhTien()
	{
		if (loaiTienTe==1)
		{
			this.thanhTien = this.soLuong*this.donGia;
		}
		else
		{
			this.thanhTien = this.donGia*this.tiGia*this.soLuong;
		}
		
	}

}
