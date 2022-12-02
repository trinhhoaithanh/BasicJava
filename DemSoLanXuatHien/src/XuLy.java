import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(scan,n);
		xuatMang(a);
		int dem = demXuatHien (a,scan);
		if (dem==0)
		{
			System.out.print("Không có phần tử đó trong mảng");
		}
		else
		{
			System.out.print("Phần tử đó xuất hiện "+dem+" lần");
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
	public static int demXuatHien (int a[],Scanner scan)
	{
		int dem = 0;
		System.out.print("Mời nhập x để tìm kiếm và đếm số lần xuất hiện: ");
		int x = Integer.parseInt(scan.nextLine());
		for (int i= 0;i<a.length;i++)
		{
			if (a[i]==x)
			{
				dem++;
			}
		}
		return dem;
	}
}
