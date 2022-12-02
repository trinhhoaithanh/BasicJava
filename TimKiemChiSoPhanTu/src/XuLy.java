import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	public static final int MIN = -100;
	public static final int MAX = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN (scan);
		int a[]= nhapMang (n);
		xuatMang (a);
		int index = timSoDuongDauTien (a);
		if (index!=-1)
		{
			System.out.print("Tìm thấy số dương "+a[index]+" ở vị trí "+index);
		}
		else
		{
			System.out.print("Không có số dương nào.");
		}
	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Vui lỏng nhập n:");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 2 && n%2!=0);
		return n;
	}

	public static int[] nhapMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}
	public static void xuatMang (int a[])
	{
		for (int pt: a)
		{
			System.out.print(pt +"\t");
		}
		System.out.print("\n");
	}
	public static int timSoDuongDauTien (int a[])
	{
		for (int i = 0; i<a.length;i++)
		{
			if (a[i]>0)
			{
				return i;
			}
		}
			
				return -1;
		}
	}

