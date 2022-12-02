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
		int a[] = nhapMang (n);
		xuatMang (a);
		a = BubbleSort (a);
		xuatMang (a);
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
	public static int [] BubbleSort (int a[])
	{
		int i,j;
		for (i=0;i<a.length;i++)
		{
			for (j=a.length -1;j>i;j++)
			{
				if (a[j]<a[j-1])
				{
					int tam = a[j];
					a[j] = a[j-1];
					a[j-1] = tam;
				}
			}
		}
		return a;
	}
}
