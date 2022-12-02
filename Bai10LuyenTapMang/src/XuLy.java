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
		int n = nhapN(scan);
		int a[] = nhapMang(n);
		xuatMang (a);
		int dem = demPTThoaDK(a);
		System.out.println("Có "+ dem +" phần tử chia hết cho 4 và tận cùng bằng 6 ");
		a = nhanDoiLe(a);
		xuatMang(a);
	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Vui lỏng nhập n:");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
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
	public static int demPTThoaDK (int a[])
	{
	int dem=0;
	for (int pt:a)
	{
		if (pt%4==0 && Math.abs(pt)%10==6)
		{
			dem++;
		}
	}
	return dem;
	}
	public static int [] nhanDoiLe(int a[])
	{
		for (int i=0;i<a.length;i++)
		{
			if (a[i]%2!=0)
			{
				a[i]=a[i]*2;
			}
		}
		return a;
	}

}
