import java.util.Scanner;

public class Bai6 {

	public Bai6() {
		// TODO Auto-generated constructor stub
	}
	public static final int MIN = -1000;
	public static final int MAX = 1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(n,scan);
		xuatMang(a);
		int tong = tinhTongGiaTriDuong(a);
		if (tong==0)
		{
			System.out.print("Mảng toàn âm.");
		}
		else
		{
			System.out.print("Tổng các giá trị dương trong mảng là: "+tong);
		}
	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Vui lỏng nhập n:");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}
	public static void xuatMang (int a[])
	{
		for (int pt: a)
		{
			System.out.print(pt +"\t");
		}
		System.out.print("\n");
	}
	public static int tinhTongGiaTriDuong(int a[])
	{	int tong=0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>0)
			{
				tong+=a[i];
			}
		}
		return tong;
	}
}
