import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN(scan);
		int a[]=nhapMang(scan,n);
		xuatMang(a);
		a= themPhanTu(a, scan);
		xuatMang(a);

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
	public static int [] themPhanTu (int a[], Scanner scan)
	{
		int k;
		do
		{
			System.out.print("Vui lòng nhập k từ 0 đến "+ a.length);
			k= Integer.parseInt(scan.nextLine());
		}while(k<0 ||k>a.length);
		System.out.print ("Vui lòng nhập phần tử x: ");
		int x= Integer.parseInt(scan.nextLine());
		int b[]=new int [a.length+1];
		for (int i=0;i<b.length;i++)
		{
			if (i<k)
			{
				b[i]=a[i];
			}
			else if (i==k)
			{
				b[i]=x;
			}
			else if (i>k)
			{
				b[i]=a[i-1];
			}
		}
		a=b;
		return a;
	}
}
