import java.util.Scanner;

public class Bai16 {

	public Bai16() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner (System.in);
		int n = nhapN(scan);
		int a[] =nhapMang(scan,n);
		xuatMang(a);
		maxDauTien(a);
		minDauTien(a);
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
	public static int timPTXuatHienNhieuNhat(int a[],int b[])
	{
		int max=b[0];
		for (int i=0;i<b.length;i++)
		{
			if (b[i]>max)
			{
				max = b[i];
			}
		}
		return max;
	}
	public static void maxDauTien(int a[])
	{
		int b[]= demPhanTu(a);
		int max = timPTXuatHienNhieuNhat(a,b);
		for (int i=0;i<a.length;i++)
		{
		if (b[i]==max)
		{
			System.out.println("Phần tử xuất hiện nhiều nhất: "+a[i]+"["+max+" lần]");
		}
		}
	}
	public static int timPTXuatHienItNhat(int a[],int b[])
	{
		int min=b[0];
		for (int i=0;i<b.length;i++)
		{
			if (b[i]<min&&b[i]>0)
			{
				min = b[i];
			}
		}
		return min;
	}
	public static void minDauTien(int a[])
	{
		int b[]= demPhanTu(a);
		int min = timPTXuatHienItNhat(a,b);
		for (int i=0;i<b.length;i++)
		{
		if (b[i]==min)
		{
			System.out.println("Phần tử xuất hiện ít nhất: "+a[i]+"["+min+" lần]");
		}
		}
	}

	
}
