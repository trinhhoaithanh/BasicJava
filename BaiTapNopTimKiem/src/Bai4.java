import java.util.Scanner;

public class Bai4 {

	public Bai4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner (System.in);
		int n =nhapN(scan);
		int a[] = nhapMang(scan,n);
		xuatMang(a);
		int soNguyenTo = timKiemSoNguyenToCuoiCung(a);
		System.out.println("Số nguyên tố cuối cùng trong mảng: "+soNguyenTo);
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
	public static int soNguyenTo(int  n)
	{
		if ( n<=1)
		{
			return 0;
		}
		for (int i=2;i< n;i++)
		{
			if ( n%i==0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int timKiemSoNguyenToCuoiCung(int a[])
	{
		for (int i=a.length-1;i>=0;i--)
		{
			if (soNguyenTo(a[i])==1)
			{
				return a[i];
			}
		}
		return -1;
	}
}
