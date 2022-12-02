import java.util.Scanner;

/*
 * Mục đích: quản lý nghiệp vụ lien quan đến chuyến xe nội thành
 */
public class ChuyenXeNoiThanh extends ChuyenXe {
	//1.Attributes
	private String soTuyen;
	private float soKM;
	//2. Get,set methods
	
	public String getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}

	public float getSoKM() {
		return soKM;
	}

	public void setSoKM(float soKM) {
		this.soKM = soKM;
	}


	//3. Constructors
	public ChuyenXeNoiThanh() {
		super();
	}
	public ChuyenXeNoiThanh(String maSoChuyenXe, String hoTenTaiXe, String soXe, float doanhThu, String soTuyen, float soKM) { 
		super(maSoChuyenXe, hoTenTaiXe,soXe,doanhThu);
			this.soKM = soKM;
			this.soTuyen = soTuyen;
	}
	//4. Input, output methods
	@Override
	public void nhap(Scanner scan)
	{
		super.nhap(scan);
		System.out.print("Số tuyến: ");
		this.soTuyen = scan.nextLine();
		System.out.print("Số KM: ");
		this.soKM = Float.parseFloat(scan.nextLine());
	}
	@Override 
	public void xuat()
	{
		super.xuat();
		System.out.print("\t Số tuyến:"+ this.soTuyen+"\t Số KM:"+this.soKM);
	}
	//5. Business methods
	

}
