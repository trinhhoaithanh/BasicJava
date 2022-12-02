import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		CongTy cty = new CongTy();
		cty.dummyDataCty();// tạo dữ liệu cho công ty
		cty.dummyDataNhanSu();
		
		//cty.phanBoNhanVienThuong();
		cty.tinhLuong();
		//cty.themNhanSu(scan);
		cty.xuat();
		/*//cty.xoaNhanSu(scan);
		System.out.println("*******Danh sách nhân viên thường có lương cao nhất*******");
		ArrayList <NhanVienThuong>list = cty.lietKeDSNhanVienThuongLuongCaoNhat();
		for (NhanVienThuong nvt:list)
		{
			nvt.xuat();
		}*/
		//cty.xuat();
		System.out.println("*******Danh sách nhân viên đã sắp xếp theo tên*******");
		cty.sortName();
		cty.xuat();
	}

}
