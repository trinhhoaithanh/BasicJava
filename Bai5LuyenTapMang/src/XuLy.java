import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	public static final int MIN = -100;
	public static final int MAX = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN(scan);
		int a[] = nhapMang (n, scan);
		xuatMang (a);
		lietKe(a);

	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Vui lỏng nhập n:");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 0 || n % 2 != 0);
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
	public static boolean kiemTraChuSoDauTienLaLe (int x)
	{
		boolean laLe;
		x=Math.abs(x);
		while (x>=10)
		{
			x/=10;
		}
		if (x%2==0)
		{
			laLe = false;
		}
		else
		{
			laLe = true;
		}
		return laLe;
	}
	public static void lietKe(int a[])
	{
		for (int pt :a)
		{
			if (kiemTraChuSoDauTienLaLe(pt))
			{
				System.out.print(pt +"\t");
			}
		}
	}
}
