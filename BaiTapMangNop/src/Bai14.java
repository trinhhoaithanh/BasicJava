import java.util.Scanner;

public class Bai14 {

	public static final int MIN = -100;
	public static final int MAX = 100;
	public Bai14() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n =nhapN(scan);
		int a[] = nhapMang(n,scan);
		xuatMang(a);
		a=xoayPhai(a,scan);
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

	public static int[] nhapMang(int n, Scanner scan) {
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
	public static int[] xoayPhai(int a[],Scanner scan)
	{
		int k;
		int tam;
		do
		{
			System.out.println("Vui lòng nhập k>0: ");
			 k = Integer.parseInt(scan.nextLine());
		}while (k<0);
		k%=a.length;
		for (int i=0;i<k;i++)
		{
			 tam = a[a.length-1];
			for (int j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=tam;
		}
		return a;
	}
}
