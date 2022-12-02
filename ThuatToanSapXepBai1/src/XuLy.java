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
		int a[] = nhapMang (n);
		xuatMang (a);
		a = interchangeSort (a);
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
	public static int [] interchangeSort (int a[])
	{
		int i,j;
		for ( i=0;i<a.length-1;i++)
		{
			for (j=i+1;i<a.length;j++)
			{
				if (a[j]<a[i])//So Sánh xem có bị nghịch thế hay không 
				{	//Thực hiện hoán vị đổi chỗ cho nhau
					int tam = a[i];
					a[i]=a[j];
					a[j] = tam;
				}
			}
		}
		return a;
	}
}
