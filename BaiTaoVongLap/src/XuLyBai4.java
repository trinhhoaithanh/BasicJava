import java.util.Scanner;

public class XuLyBai4 {

	public XuLyBai4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int x = nhapX(scan);
		int n = nhapN(scan);
		int tong = tinhTong(x,n);
		System.out.print("Tổng là: "+tong);
	}
	public static int nhapX(Scanner scan)
	{
		int x;
		System.out.print("Vui lòng nhập cơ số x: ");
		x = Integer.parseInt(scan.nextLine());
		return x;
	}
	public static int nhapN(Scanner scan)
	{
		int n;
		System.out.print("Vui lòng nhập mũ số n: ");
		n = Integer.parseInt(scan.nextLine());
		return n;
	}
	public static int tinhTong(int x, int n)
	{
		int tong=0;
		int tam=1;
		for (int i=1;i<=n;i++)
		{
			tam*=x;
			tong+=tam;
		}
		return tong;
	}
	
}
