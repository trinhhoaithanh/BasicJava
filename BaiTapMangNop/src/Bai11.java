import java.util.Scanner;

public class Bai11 {

	public Bai11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN(scan);
		int a[]  = nhapMang(scan,n);
		xuatMang(a);
		a = xoaPhanTuLonNhat(a);	
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
	public static int timSoLonNhat(int a[])
	{
		int max = a[0];
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>=max)
			{
				max = a[i];
			}
		}
		return max;
	}
	public static int demPTLonNhat(int a[],int max)
	{
		int dem=0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i]==max)
			{
				dem++;
			}
		}
		return dem;
	}
	public static int [] xoaPhanTuLonNhat(int a[])
	{ 
		int max = timSoLonNhat(a);
		int dem =  demPTLonNhat( a, max);
		int b[] = new int [a.length-dem];
		int j=0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i]!=max)
			{
				b[j++] = a[i];
			}
				
		}
		a=b;
		return a;
	}
}
