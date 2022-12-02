import java.util.Scanner;

/*
 * Mucj đích: quản lý chuyến xe ngoại thành
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe {
	//1.Attributes
	private String noiDen;
	private float soNgayDiDuoc;
	//2. Get set methods
	
	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public float getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	public void setSoNgayDiDuoc(float soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	//3. Constructor methods
	public ChuyenXeNgoaiThanh() {
		// TODO Auto-generated constructor stub
		super();
	}

	public ChuyenXeNgoaiThanh(String maSoChuyenXe, String hoTenTaiXe, String soXe, float doanhThu, String noiDen, float soNgayDiDuoc) {
		super(maSoChuyenXe, hoTenTaiXe, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
		// TODO Auto-generated constructor stub
	}
	
	//4. Input,output methods
	@Override
	public void nhap(Scanner scan)
	{
		super.nhap(scan);
		System.out.print("Nhập nơi đến:");
		this.noiDen = scan.nextLine();
		System.out.print("Nhập số  ngày đi được: ");
		this.soNgayDiDuoc = Float.parseFloat(scan.nextLine());
	}
	@Override
	public void xuat()
	{
		super.xuat();
		System.out.println("\t Nơi đến: "+this.noiDen+"\t Số ngày đi được:"+this.soNgayDiDuoc);
	}
	//5. Business methods
	

}
