import java.util.Scanner;

public class Bai18 {

	public Bai18() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n= nhapN(scan);
		int a[] = nhapMang(scan,n);
		xuatMang(a);
		int b[] = demPhanTu(a);
		int max = timSoLanXuatHienMax(b);
		lietKePTCaoNhat( a, b, max);
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
	public static int [] demPhanTu(int a[])
	{
		int b[] = new int [a.length];
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					if (j<i)
					{
						break;
					}
					else
					{
						b[i]++;
					}
				}
			}
		}
		return b;
	}
	public static int timSoLanXuatHienMax(int b[])
	{int i;
		int max=b[0];
		for ( i=0;i<b.length;i++)
		{
			if (b[i]>max)
			{
				max = b[i];
			}
		}
		return max;
	}
	public static void lietKePTCaoNhat(int a[],int b[],int max)
	{
		max = timSoLanXuatHienMax(b);
		for (int i=0;i<b.length;i++)
		{
		if (b[i]==max)
		{
			System.out.print("Các phần tử có số lần xuất hiện nhiều nhất là: ");
			System.out.println(a[i]+"["+max+" lần]");
		}
		}
	}
}
