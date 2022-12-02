import java.util.Scanner;

public class XuLyBai3 {

	public XuLyBai3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapSo (scan);
		int tong = tongSoLe (n);
		System.out.print ("Tổng các số lẻ nguyên dương nhỏ hơn n là:" + tong);
	}
	public static int nhapSo (Scanner scan)
	{
		int n;
		do
		{
		System.out.print("Vui lòng nhập một số lớn hơn 0: ");
		n = Integer.parseInt(scan.nextLine());
		}while (n<=0);
		return n;
	}
	public static int tongSoLe (int n)
	{	int tong=0;
		for (int i=0;i<n;i++)
		{
			if (i%2!=0)
			{
				tong+=i;
			}
		}
		return tong;
	}
}
