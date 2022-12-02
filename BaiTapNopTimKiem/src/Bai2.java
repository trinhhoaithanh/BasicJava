import java.util.Scanner;

public class Bai2 {

	public Bai2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(scan,n);
		xuatMang(a);
		timViTriGiaTriChan(a);
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
	public static void timViTriGiaTriChan(int a[])
	{
		int i;
		for ( i=0;i<a.length;i++)
		{
			if (a[i]%2==0)
			{
				System.out.println("Vị trí của giá trị chẵn đầu tiên là "+i);
				break; 
			}
			else
			{
				System.out.println(-1);
				break;
			}
		}
	}
}