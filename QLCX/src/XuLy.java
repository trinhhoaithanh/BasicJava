import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhSachChuyenXe objDSCX = new DanhSachChuyenXe();
		Scanner scan =new Scanner (System.in);
		//objDSCX.nhap(scan);
		objDSCX.dummyData();
		objDSCX.xuat();
		float doanhThu = objDSCX.tinhDoanhThuCXBinhThuan();
		System.out.print("Doanh thu Bình Thuận: "+ doanhThu);
	}

}
