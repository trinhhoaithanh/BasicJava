import java.util.Scanner;

public class Bai5 {

	public Bai5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(scan,n);
		xuatMang(a);
		lietKeCacGiaTriCoChuSoDauTienChan( a);
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
	public static void lietKeCacGiaTriCoChuSoDauTienChan(int a[])
	{
		int count=0;
		for (int i=0;i<a.length;i++)
		{
			if (((Math.abs(a[i]))/10)%2==0)
			{
				System.out.print(a[i]+"\t");
				count++;
			}
		}
		if (count ==0)
		{
			System.out.print("Không có số nào có chữ số đầu tiên là số chẵn");
		}
	}
}
