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
		int n = nhapN (scan );
		int a[ ]= nhapMang(n);
		int b[]=a;
		xuatMang(a);
		a = shuffle(a);
		xuatMang(a);
		b = shuffle(a);
		int count = countShuffle(a,b);
		System.out.print("Cần "+ count + " lần hoán đổi để mảng trở về ban đầu");
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
	public static int [] shuffle (int a[])
	{
		int tam [] = new int [a.length];
		for (int i=0;i<a.length/2;i++)
		{
			tam[2*i]= a[i];
			tam[2*i+ 1 ] = a[a.length/2+i];
		}
		a=tam;
		return a;
	}
	public static boolean isEqual (int a[], int b[])
	{
		for (int i=0;i<a.length;i++)
		{
			if (a[i]!=b[i])
			{
				return false;
			}
		}
			return true;
		}
	public static int countShuffle (int a[], int b[])
	{
		int count =0;
		do
		{
			b=shuffle (b);
			count++;
		}while(!isEqual(a,b));
		return count;
	}
	}
