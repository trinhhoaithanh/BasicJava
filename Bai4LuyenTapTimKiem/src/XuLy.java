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
		int a[] = nhapMang(n);
		xuatMang(a);
		lietKePTGiaTriX (a,scan);
	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập n > 0  ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1 );
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
	public static void lietKePTGiaTriX (int a[],Scanner scan)
	{
		System.out.print("Vui lòng nhập vào giá trị x: ");
		int x = Integer.parseInt(scan.nextLine());
		int b[] = new int [a.length];
		//Mảng lưu với khoảng cách từng phần  tử trong a so với x
		for (int i = 0;i<a.length; i++)
		{
			b[i] = Math.abs(a[i] - x);
		}
		//Tìm giá trị max khoảng cách thật sự
		int indexMax = 0;
		for (int i = 0;i<b.length;i++)
		{
			if (b[i]>b[indexMax])
			{
				indexMax = i;
			}
		}
		System.out.print("Các phần tử cách xa phần tử x = "+x+" là: ");
		for (int i = 0;i<b.length;i++) {
			if (b[i]==b[indexMax])
			{
				System.out.print("("+i+","+a[i]+")"+"\t");
			}
		}
	}
}
