import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		float tong  = tinhTongCach2(scan);
		System.out.print("Ket qua la: "+ tong);
	}
	public static float tongCacSoDuongCach1(Scanner scan)
	{
		float tong=0;
		int nhap=1;
		while (nhap >0)
		{
			System.out.print("Vui long nhap cac so >0 de tinh tong");
			nhap = Integer.parseInt(scan.nextLine());
			if (nhap>0)
			{
				tong+=nhap;
			}
			
		}
		return tong;
	}
	public static float tinhTongCach2(Scanner scan)
	{
		float tong=0;
		boolean flag= true;
		while (flag)
		{
			System.out.print("Vui long nhap cac so >0 de tinh tong");
			int nhap = Integer.parseInt(scan.nextLine());
			if (nhap>0)
			{
				tong+=nhap;
			}
			else 
			{
				flag = false;
			}
		}
		return tong;
	}

}
