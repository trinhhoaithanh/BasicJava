import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN(scan);
		int a[]= nhapMang (scan,n);
		xuatMang (a);
		boolean doiXung = ktDoiXung (a);
		if (doiXung)
		{
			System.out.print("Mảng đối xứng");
		}
		else
		{
			System.out.print("Mảng không đối xứng");
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
	public static boolean ktDoiXung (int a[])
	{
		for (int i=0;i<a.length/2;i++)
		{
			if (a[i]!=a[a.length-1-i])
			{
				return false;
			}
		}
		return true;
	}
}
