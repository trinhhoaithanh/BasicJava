import java.util.ArrayList;
import java.util.Scanner;

/*
 * Mục đích : quản lý nghiệp vụ liên quan đến các giao dịch
 */
public class DanhSachGiaoDich {
	final int MOT_TY=1000;
	// 1. Attributes
	private ArrayList<GiaoDich> listGiaoDich;
	private int tongSLGDVang;
	private int tongSLGDTienTe;
	public float trungBinhTTGiaoDichTTe;
	// 2. Get set method

	public ArrayList<GiaoDich> getListGiaoDich() {
		return listGiaoDich;
	}

	public void setListGiaoDich(ArrayList<GiaoDich> listGiaoDich) {
		this.listGiaoDich = listGiaoDich;
	}

	public int getTongSLGDVang() {
		return tongSLGDVang;
	}

	public int getTongSLGDTienTe() {
		return tongSLGDTienTe;
	}

	// 3. Constructors
	public DanhSachGiaoDich() {
		listGiaoDich = new ArrayList<GiaoDich>();

	}

	public DanhSachGiaoDich(ArrayList<GiaoDich> listGiaoDich) {
		this.listGiaoDich = listGiaoDich;
	}
	public float getTrungBinhTTGiaoDichTTe()
	{
		return this.trungBinhTTGiaoDichTTe;
	}
	// 4. Input, output methods
	public void nhap(Scanner scan) {
		boolean flag = true;
		GiaoDich giaoDich;
		do {
			System.out.println("Vui lòng chọn: ");
			System.out.println("1. Nhập giao dịch vàng");
			System.out.println("2. Nhập giao dịch tiền tệ");
			System.out.println("0. Thoát");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				giaoDich = new GiaoDichVang();
				giaoDich.nhap(scan);
				giaoDich.tinhTien();
				this.listGiaoDich.add(giaoDich);
				break;
			case 2:
				giaoDich = new GiaoDichTienTe();
				giaoDich.nhap(scan);
				giaoDich.tinhTien();
				this.listGiaoDich.add(giaoDich);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Vui lòng nhập 0, 1 ,2");
				break;
			}

		} while (flag);
	for (GiaoDich gd:this.listGiaoDich)
	{
		gd.xuat();
	}	
}
	// 5. Business methods
	public void tinhTongSLGDVang()
	{
		this.tongSLGDVang=0;
		for (GiaoDich gd: this.listGiaoDich)
		{
			if (gd instanceof GiaoDichVang)
			{
				this.tongSLGDVang+=gd.soLuong;
			}
		}
	}
	public void tinhTongSLGDTienTe()
	{
		this.tongSLGDTienTe=0;
		for (GiaoDich gd: this.listGiaoDich)
		{
			if (gd instanceof GiaoDichTienTe)
			{
				this.tongSLGDTienTe+=gd.soLuong;
			}
		}
	}
	public void tinhTBThanhTienTT()
	{
		float thanhTien=0;
		for (GiaoDich gd: this.listGiaoDich)
		{
			//gd.tinhTien();
			if (gd instanceof GiaoDichTienTe)
			{
				thanhTien+= ((GiaoDichTienTe) gd).getThanhTien();
			}
		}
		this.trungBinhTTGiaoDichTTe = thanhTien/this.tongSLGDTienTe;
		
	}
	public void xuatGiaoDichTheoTieuChi()
	{	System.out.println("Các giao dịch lớn hơn "+MOT_TY);
		for (GiaoDich gd: this.listGiaoDich)
		{
			if (gd.getDonGia()>MOT_TY)
			{
				gd.xuat();
			}
		}
	}
	public void tinhTienChoCacGiaoDich()
	{
		for (GiaoDich gd:this.listGiaoDich)
		{
			gd.tinhTien();
		}
	}
	public void dummyData()
	{
		GiaoDich giaoDich = new GiaoDichVang(1,1,1,2020,4,5,"SJC");
		this.listGiaoDich.add(giaoDich);
		giaoDich = new GiaoDichVang(2,2,1,2020,5,10,"SJC");
		this.listGiaoDich.add(giaoDich);
		giaoDich = new GiaoDichVang(3,3,4,2020,12,11,"9999");
		this.listGiaoDich.add(giaoDich);
		giaoDich = new GiaoDichTienTe(4,5,5,2020,1100,10,23,2);
		this.listGiaoDich.add(giaoDich);
		giaoDich = new GiaoDichTienTe(5,6,7,2020,4100,11,10,1);
		this.listGiaoDich.add(giaoDich);
	}
}
