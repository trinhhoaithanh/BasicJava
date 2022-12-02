import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Khởi tạo đối tượng
		//Cách 1
		/*HInhChuNhat hcn =  new HInhChuNhat();
		Scanner scan = new Scanner (System.in);
		hcn.nhap(scan);
		hcn.tinhChuVi();
		hcn.tinhDienTich();
		hcn.xuat();*/
		//Cách 2
		/*canner scan = new Scanner (System.in);
		System.out.print ("Nhập chiều dài: ");
		float cDai = Float.parseFloat(scan.nextLine());
		System.out.print ("Nhập chiều rộng: ");
		float cRong = Float.parseFloat(scan.nextLine());*/
		HInhChuNhat hcn = new HInhChuNhat (5.6f,4);//Muón test nhanh
		hcn.tinhDienTich();
		hcn.tinhChuVi();
		hcn.xuat();
	}

}
