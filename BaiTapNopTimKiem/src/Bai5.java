import java.util.Scanner;

public class Bai5 {

	public Bai5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n= nhapN(scan);
		int a[] = nhapMang(scan,n);
		xuatMang(a);
		lietKePTGanGiaTriX(a,scan);
	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập n > 0  ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1 );
		return n;
	}

	public static int[] nhapMang(Scanner scan, int n) {
		int a[] = new int[n];
		for(int i  = 0; i < n; i++) {
			System.out.print("a[" +i +"] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	} 
	public static void lietKePTGanGiaTriX(int a[], Scanner scan)
	{
		System.out.println("Vui lòng nhập vào giá trị x: ");
		int x = Integer.parseInt(scan.nextLine());
		int b[]= new int [a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=Math.abs(a[i]-x);
		}
	int indexMin=0;
	for (int i=0;i<b.length;i++)
	{
		if (b[i]<b[indexMin])
		{
			indexMin=i;
		}
	}
	System.out.print("Các phần tử cách xa phần tử x = "+x+" là: ");
	for (int i=0;i<b.length;i++)
	{
		if (b[i]==b[indexMin])
		{
		System.out.println(a[i]+"\t");
		}
	}
	}
}
