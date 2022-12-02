import java.util.Scanner;

public class TruongPhong extends NhanSu {
	final int LUONG_NGAY=200;
	final int PHU_CAP_MOI_NHAN_VIEN_QL=100;
	//1. Attributes
	private int soNhanVienDuoiQuyen;
	//2. Get set 
	
	public int getSoNhanVienDuoiQuyen() {
		return soNhanVienDuoiQuyen;
	}

	public void setSoNhanVienDuoiQuyen(int soNhanVienDuoiQuyen) {
		this.soNhanVienDuoiQuyen = soNhanVienDuoiQuyen;
	}

	//3. Constructor
	public TruongPhong() {
		// TODO Auto-generated constructor stub
		this.soNhanVienDuoiQuyen=0;
	}

	public TruongPhong(String hoTen, String maSo, String soDienThoai, float soNgayLamViec) {
		super(hoTen, maSo, soDienThoai, soNgayLamViec);
		// TODO Auto-generated constructor stub
		this.soNhanVienDuoiQuyen=0;
	}
	//4. Input,output
	@Override
	public void nhap(Scanner scan)
	{
		super.nhap(scan);
	}
	@Override
	public void xuat()
	{
		super.xuat();
		System.out.println("\t Số nhân viên: "+this.soNhanVienDuoiQuyen+"\t Lương: "+this.luong);
	}
	//5. Business
	public void tinhLuong()
	{
		this.luong = soNgayLamViec*LUONG_NGAY+this.soNhanVienDuoiQuyen*PHU_CAP_MOI_NHAN_VIEN_QL;
	}
	public void tangNhanVien()
	{
		this.soNhanVienDuoiQuyen++;
	}
	public void giamNhanVien()
	{
		this.soNhanVienDuoiQuyen--;
	}

}
