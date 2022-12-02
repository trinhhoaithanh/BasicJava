import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		CongTy congTy = new CongTy();
		//congTy.nhap(scan);
		doMenu(congTy);
		
		
	}
	public static void inMenu() {
		System.out.println("Vui lòng chọn thực hiện:");
		System.out.println("1. Nhập nhân viên");
		System.out.println("2. Xuất danh sách nhân viên");
		System.out.println("3. Xuất danh sách nhân viên có lương cao nhất");
		System.out.println("0. Thoát");
	}
	public static void doMenu(CongTy congTy)
	{
		boolean flag=true;
		Scanner scan =new Scanner (System.in);
		do 
		{
			inMenu();
			System.out.print("Mời chọn");
			int chon = Integer.parseInt(scan.nextLine());
			switch(chon)
			{
			case 1: 
				NhanVien nv = new NhanVien();
				nv.nhap(scan);
				congTy.themNhanVien(nv);
				break;
			case 2:
				congTy.tinhLuongNhanVien();
				congTy.xuat();
				break;
			case 3:
				ArrayList <NhanVien> listMax = congTy.timNVCoLuongCaoNhat();
				congTy.xuatHelper(listMax);
				break;
			case 0:
				flag=false;
				break;
			}
		}while (flag);
	}

}
