import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN(scan);
		int a[] = nhapMang (scan,n);
		xuatMang(a);
		System.out.print("Vui lòng nhập phần tử x cần tìm kiếm: ");
		int x = Integer.parseInt(scan.nextLine());
		boolean index = linearSearch (a,x);
		boolean found  = linearSearch (a,x);
		if (found)
		{
			System.out.print("Tìm thấy x = "+ x + " trong mảng ở vị trí "+index);
		}
		else
		{
			System.out.print("Không tìm thấy x = "+ x + " trong mảng");
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
	public static boolean linearSearch (int a[],int x)
	{
		int i = 0;
		while (i<a.length && a[i]!=x)
		{
			i++;
		}
		if (i==a.length)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	}
	
