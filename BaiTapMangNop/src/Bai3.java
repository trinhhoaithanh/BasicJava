import java.util.Scanner;

public class Bai3 {

	public Bai3() {
		// TODO Auto-generated constructor stub
	}
	public static final int MIN = -100;
	public static final int MAX = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN (scan);
		int a[] = nhapMang (n);
		xuatMang (a);
		lietKeSoChan(a,scan);
	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập n > 0  ");
			n = Integer.parseInt(scan.nextLine());
		} while (n %2!= 0 );
		return n;
	}

	public static int[] nhapMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}
	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}
	public static void lietKeSoChan (int a[], Scanner scan)
	{
		int x;
		int y;
		System.out.print("Vui lòng nhập x: ");
		x = Integer.parseInt(scan.nextLine());
		System.out.print("Vui lòng nhập y: ");
		y = Integer.parseInt(scan.nextLine());
		for (int pt:a)
		{
			if (pt>=x && pt<=y && pt%2==0)
			{
				System.out.print(pt + "\t");
			}
		}
	}
	
}
