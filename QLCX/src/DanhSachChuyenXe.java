import java.util.ArrayList;
import java.util.Scanner;

/*
 *Mục đích: xử lý nghiệp vụ liên quan đến chuyến xe
 */
public class DanhSachChuyenXe {
	//1. Attributes
	private ArrayList <ChuyenXe> listChuyenXe;
	private float tongDoanhThu;
	private float doanhThuNoi;
	private float doanhThuNgoai;
	//2. Get Set method
	
	public ArrayList<ChuyenXe> getListChuyenXe() {
		return listChuyenXe;
	}

	public void setListChuyenXe(ArrayList<ChuyenXe> listChuyenXe) {
		this.listChuyenXe = listChuyenXe;
	}
	
	public float getTongDoanhThu() {
		return tongDoanhThu;
	}

	public float getDoanhThuNoi() {
		return doanhThuNoi;
	}

	public float getDoanhThuNgoai() {
		return doanhThuNgoai;
	}

	//3. Constructor mehtod
	public DanhSachChuyenXe() {
		// TODO Auto-generated constructor stub
		listChuyenXe = new ArrayList<ChuyenXe>();
	}
	//4. Input, out put methods
	public void nhap(Scanner scan)
	{
		boolean flag = true;
		ChuyenXe chuyenXe;
		do 
		{
			System.out.println("Nhập 1. Chuyến xe nội thành");
			System.out.println("Nhập 2. Chuyến xe ngoại thành");
			System.out.println("Nhập 0. Thoát nhập");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon)
			{
			case 1:
				chuyenXe = new ChuyenXeNoiThanh();
				chuyenXe.nhap(scan);// đa hình, nhập này là sẽ nhập thẳng vào chuyến xe nội thành vì ở trên m8nh new chuyến xe nội thành
				this.listChuyenXe.add(chuyenXe);
				break;
			case 2:
				chuyenXe = new ChuyenXeNgoaiThanh();
				chuyenXe.nhap(scan);
				this.listChuyenXe.add(chuyenXe);
				break;
			case 0:
				flag = false;
				break;
			}
		}while (flag);
	}
	public void xuat()
	{
	for (ChuyenXe cx: this.listChuyenXe)
	{
		cx.xuat();//đa hình thể hiện ở đây, nếu nội thì xuất của nội, nếu ngoại thì xuất của ngoại
	}
	}
	//5. Business mthods
	public void tinhTongDoanhThu()
	{
		this.tongDoanhThu = 0;
		
		for (ChuyenXe cx: this.listChuyenXe)
		{
			this.tongDoanhThu+=cx.getDoanhThu();
		}
	}
	public void tinhDoanhThuNoi()
	{
		this.doanhThuNoi=0;
		for (ChuyenXe cx: this.listChuyenXe)
		{
			if (cx instanceof ChuyenXeNoiThanh)
			{
				this.doanhThuNoi+=cx.getDoanhThu();
			}
		}
	}
	public void tinhDoanhThuNgoai()
	{
		this.doanhThuNgoai = 0;
		for (ChuyenXe cx: this.listChuyenXe)
		{
			if (cx instanceof ChuyenXeNgoaiThanh)// kiểm tra cx đang chạy có phải là thể hiện của lớp đối tượng
				// hoặc cx được new ra từ lớp nào
			{
				this.doanhThuNgoai+=cx.getDoanhThu();
			}
		}
	}
	public void dummyData()
	{
		ChuyenXe chuyenXe;
		chuyenXe = new ChuyenXeNoiThanh("1","nội 1","02",1200,"số 12",35);
		this.listChuyenXe.add(chuyenXe);
		chuyenXe = new ChuyenXeNoiThanh("2","nội 2","03",1100,"số 14",5.6f);
		this.listChuyenXe.add(chuyenXe);
		chuyenXe = new ChuyenXeNgoaiThanh("3","ngọai 1","05",2000,"Bình Thuận",2);
		this.listChuyenXe.add(chuyenXe);
		chuyenXe = new ChuyenXeNgoaiThanh("4","ngọai 2","07",3000,"Nha Trang",2);
		this.listChuyenXe.add(chuyenXe);
		chuyenXe = new ChuyenXeNoiThanh("5","nội 3","06",2100,"số 15",8.6f);
		this.listChuyenXe.add(chuyenXe);
		chuyenXe = new ChuyenXeNgoaiThanh("6","ngọai 3","09",1500,"Bình Thuận",1.5f);
		this.listChuyenXe.add(chuyenXe);
	}
	public float tinhDoanhThuCXBinhThuan()
	{
		float doanhThu=0;
		for(ChuyenXe cx:this.listChuyenXe)
		{
			if (cx instanceof ChuyenXeNgoaiThanh)
			{
				ChuyenXeNgoaiThanh ngoai = ((ChuyenXeNgoaiThanh) cx);//Casting ép kiểu
				if (ngoai.getNoiDen().equalsIgnoreCase("Bình Thuận"))
				{
					doanhThu+=ngoai.getDoanhThu();
				}
			}
		}
		return doanhThu;
	}
	

}
