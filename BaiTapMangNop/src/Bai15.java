import java.util.Scanner;

public class Bai15 {

	public Bai15() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n=nhapN(scan);
		int a[]= nhapMang(scan,n);
		xuatMang(a);
		int dem = demSoChinhPhuong(a);
		if (dem>0)
		{
			a=xoaSoChinhPhuong(a,dem);
			xuatMang(a);
		}
		else
		{
			System.out.println("Không tồn tại số chính phương trong mảng");
		}
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
	public static boolean kiemTraSoChinhPhuong(int n)
	{
		return Math.sqrt((float)n) == (int) Math.sqrt((float)n);
	}
	public static int demSoChinhPhuong(int a[])
	{
		int dem=0;
		for (int i=0;i<a.length;i++)
		{
			if (kiemTraSoChinhPhuong(a[i]))
			{
				dem++;
			}
		}
		return dem++;
	}
	public static int [] xoaSoChinhPhuong(int a[],int dem)
	{
		int b[] = new int [a.length-dem];
		int j=0;
		for (int i=0;i<a.length;i++)
		{
			if (!kiemTraSoChinhPhuong(a[i]))
			{
				b[j++]=a[i];
			}
				
		}
		a=b;
		return a;
	}
}
