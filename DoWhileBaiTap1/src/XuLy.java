import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner (System.in);
		System.out.print("Vui long nhap so a:");
		float a = Float.parseFloat(scan.nextLine());
		System.out.print("Vui long nhap so b:");
		float b = Float.parseFloat(scan.nextLine());
		xuLyMenu (scan, a ,b);
		

	}

	public static void inMenu()
	{
		System.out.println("Chương Trình Các Phép Tính Đơn Giản");
		System.out.println("1. Tính Tổng ");
		System.out.println("2. Tính Hiệu");
		System.out.println("3.Tính Tích");
		System.out.println("4. Tính Thương");
		System.out.println("0. Thoát");
		
	}

	public static void xuLyMenu(Scanner scan, float a, float b )
	{
		boolean flag = true;
		int chon;
		
		do 
		{	inMenu();
			System.out.print("Chon >>");
			chon = Integer.parseInt(scan.nextLine());
			switch (chon)
			{
			case 1: 
				float tong = a + b;
				System.out.print("Tong 2 so " + a + " va "+ b +" la " + tong);
				break;
			case 2: 
				float hieu = a - b;
				System.out.print("Hieu 2 so "+ a + " va "+ b +" la " + hieu);
				break;
			case 3: 
				float tich = a * b;
				System.out.print("Tich 2 so "+ a + " va "+ b +" la " + tich);
				break;
			case 4: 
				float thuong = a / b;
				System.out.print("Thuong 2 so "+ a + " va "+ b +" la " + thuong);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.print("Vui long chon tu 0 den 4");
			}
			
		}
		while(flag);

	}
}
