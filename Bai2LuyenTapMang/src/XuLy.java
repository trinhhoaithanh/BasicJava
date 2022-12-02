import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static final int MIN = -100;
	public static final int MAX = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[]  = nhapMang (n, scan);
		xuatMang(a);
		lietKeMang(a, scan);
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
	public static void lietKeMang(int a[], Scanner scan)
	{
		int x;
		int y;
		System.out.println("vui lòng nhập x dưới: ");
		x= Integer.parseInt(scan.nextLine());
		System.out.println("Vui Lòng nhập y trên: ");
		y= Integer.parseInt(scan.nextLine());
		for (int pt:a)
		{
			if (pt >=x &&pt <=y)
			{
				System.out.print(pt+"\t");
			}
		}
	}
}
