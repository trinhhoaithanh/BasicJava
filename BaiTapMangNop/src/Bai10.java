import java.util.Scanner;

public class Bai10 {

	public Bai10() {
		// TODO Auto-generated constructor stub
	}
	public static final int MIN = -1000;
	public static final int MAX = 1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(n,scan);
		xuatMang(a);
		System.out.print("Vui lòng nhập giá trị x: ");
		int x = Integer.parseInt(scan.nextLine());
		float trungBinhCong = tinhTrungBinhCongGiaTriLonHonGiaTriX( a,  scan, x);
		if (trungBinhCong==0)
		{
			System.out.print("Không có giá trị nào lớn hơn x.");
		}
		else
		{
			System.out.print("Trung bình cộng các giá trị lớn hơn giá trị x là: "+trungBinhCong);
		}
		
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
	public static float tinhTrungBinhCongGiaTriLonHonGiaTriX(int a[],Scanner scan, int x)
	{
		int tong=0;
		int dem=0;
		 float trungBinhCong = 0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>x)
			{
				dem++;
				tong+=a[i];
			}
		}
		if (tong!=0)
		{
	  trungBinhCong= (tong*1.0f)/dem;
		}
	return trungBinhCong;
	}
}
