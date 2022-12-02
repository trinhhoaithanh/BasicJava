import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n  = nhapN(scan);
		int a[]= nhapMang (scan,n);
		xuatMang (a);
		a = xoaTaiIndex (a, scan);
		xuatMang (a);
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
	public static int [] xoaTaiIndex (int a[], Scanner scan) 
	{
		int b[] = new int [a.length -1];
		int index;
		do 
		{
			System.out.print("Nhập chỉ số cần xóa từ 0 đến "+ (a.length -1)+": ");
			index = Integer.parseInt(scan.nextLine());
		}while (index<0||index >= a.length);
		for (int i=0,j=0;i<a.length-1;i++,j++)
		{
			if (j==index)
			{
				j++;
			}
				b[i]=a[j];
		}
		a=b;
		return a;
	}
}
