import java.util.Scanner;

public class Bai3 {

	public Bai3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n =nhapN(scan);
		int a[] = nhapMang(scan,n);
		xuatMang(a);
		int viTriDuongMin = timViTriDuongMin(a);
		System.out.println("Vị trí có giá trị dương nhỏ nhất là: "+viTriDuongMin);
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
	public static int timViTriDuongMin(int a[])
	{
		int i;
		int min=0;
		int dem=0;
		for ( i=0;i<a.length;i++)
		{
			if (a[i]>0)
			{
				dem++;
				min=i;
				break;
			}
		}
		if (dem==0)
		{
			return -1;
		}
		for ( i=i+1;i<a.length;i++)
		{
			if ((a[i]>0)&&(a[i]<a[min]))
			{
				min=i;
			}
		}
		return min;
	}
}

