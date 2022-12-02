import java.util.Scanner;

public class Bai13 {

	public Bai13() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n= nhapN(scan);
		int a[] = nhapMang(scan,n);
		xuatMang(a);
		a = xoaSoChan(a);
		xuatMang(a);
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
	public static int demPhanTu(int a[])
	{	
		int dem=0;
		for (int pt:a)
		{
			if (pt%2==0)
			{
				dem++;
			}
		}
		return dem;
	}
	public static int [] xoaSoChan(int a[])
	{
		int dem=demPhanTu(a);
		if (dem>0)
		{
		int b[] = new int [a.length-dem];
		int j=0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i]%2!=0)
			{
				b[j++] = a[i];
			}
		}
		a=b;
		}
		else
		{
			System.out.println("Không có phần tử chẵn trong mảng.");
		}
		return a;
	}
	
}
