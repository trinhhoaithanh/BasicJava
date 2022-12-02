import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN (scan);
		int giaiThua = tinhGiaiThua (n);
		int tong  = tinhTong (n);
		System.out.print("S("+n+") = "+ tong);
	}
	public static int nhapN (Scanner scan)
	{
		int n;
		System.out.print("Vui lòng nhập n: ");
		n = Integer.parseInt(scan.nextLine());
		return n;
	}
	public static int tinhGiaiThua (int n)
	{
		if (n==1)
		{
			return 1;
			
		}
		return tinhGiaiThua (n-1)*n;
	}
	public static int tinhTong (int n)
	{
		if (n==1)
		{
			return  1;
		}
		return tinhTong (n-1)+tinhGiaiThua (n-1)*n;
	}
}
