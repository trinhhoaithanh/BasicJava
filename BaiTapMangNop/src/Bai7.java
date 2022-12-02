import java.util.Scanner;

public class Bai7 {

	public Bai7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n= nhapN(scan);
		int a[] = nhapMang(scan,n);
		xuatMang(a);
		int tong = tinhTongChuSoHangChucLa5(a);
		if (tong==0)
		{
			System.out.print("Không tồn tại số nào có chữ số hàng chục bằng 5.");
		}
		else
		{
			System.out.print("Tổng các số có chữ số hàng chục bằng 5: "+tong);
		}
		
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
	public static int chuSoHangChucLa5(int n)
	{
		n = Math.abs(n);
		n/=10;
		int hangChuc = n%10;
		if (hangChuc==5)
		{
			return 1;
		}
		return 0;
		
	}
	public static int tinhTongChuSoHangChucLa5(int a[])
	{
		int tong=0;
		for (int i=0;i<a.length;i++)
		{
			if (chuSoHangChucLa5(a[i])==1)
			{
				tong+=a[i];
			}
		}
		return tong;
	}
} 
