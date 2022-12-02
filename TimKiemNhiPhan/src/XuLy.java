import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner (System.in);
		int n = nhapN(scan);
		int a[]= nhapMang(scan,n);
		xuatMang(a);
		System.out.print ("Vui lòng nhập x cần tìm ");
		int x = Integer.parseInt(scan.nextLine());
		boolean found = BinarySearch(a,x);
		if (found)
		{
			System.out.print("Tìm thấy x = "+ x + " trong mảng ở vị trí ");
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
	public static boolean BinarySearch (int a[],int x)
	{
		int left, mid, right;
		left = 0;
		right = a.length-1;
		do
		{
			mid = (left+right)/2;
			if (a[mid]==x)
			{
				return true;
			}
			else if (a[mid]>x)
			{
				right = mid-1;
			}
			else
			{
				left = mid+1;
			}
		}while (left<=right);
		return false;
	}
}
