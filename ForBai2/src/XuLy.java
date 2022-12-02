import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n;
		System.out.print("Vui Lòng Nhập Số n");
		n = Integer.parseInt(scan.nextLine());
		int tong = tinhTongDungWhile(n);
		System.out.print("Tongor laf: " +tong);
		
		
	}
	public static int tinhTong(int n) {
	int tong=0;
	for (int i=0;i<=n;i++)
	{
		tong +=i;
	}
	return tong;
	}
	public static int tinhTongDungWhile(int n)
	{	int i=0;
		int tong=0;
		while (i<=n)
		{
			tong +=i;
			i++;
		}
		return tong;
	}
}
