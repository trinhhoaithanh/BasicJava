import java.util.Scanner;

public class Bai2 {

	public Bai2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(scan,n);
		xuatMang(a);
		lietKeCapGiaTriGanNhau(a);
	}
	public static int nhapN(Scanner scan)
	{
		int n;
		do 
		{
			System.out.print("Nhập n>2: ");
			n = Integer.parseInt(scan.nextLine());
		}while (n<2);
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
	public static int timKhoangCachGanNhat(int a[])
	{
		int min = Math.abs(a[0]-a[1]);
		for (int i=0;i<a.length-1;i++)
		{
			if (Math.abs(a[i]-a[i+1])<min) {
				min = Math.abs(a[i]-a[i+1]);
			}
		}
		return min;
	}
	public static void lietKeCapGiaTriGanNhau(int a[])
	{
		int min = timKhoangCachGanNhat(a);
		for (int i=0;i<a.length-1;i++)
		{
			if (Math.abs(a[i]-a[i+1])==min)
			{
				System.out.println("("+a[i]+","+a[i+1]+")");
			}
		}
	}
	
}
