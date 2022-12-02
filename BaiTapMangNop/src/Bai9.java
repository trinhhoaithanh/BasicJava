import java.util.Scanner;

public class Bai9 {

	public Bai9() {
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
		float trungBinhCong = (int) tinhTrungBinhCongCacSoNguyenTo(a);
		if (trungBinhCong==0)
		{
			System.out.print("Không tồm tại số nguyên tố trong mảng");
		}
		else
		{
		System.out.print("Trung Bình Cộng Câc Só Nguyên Tố: "+trungBinhCong);
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
	public static int kiemTraNguyenTo(int n)
	{
		if (n<2)
		{
			return 0;
			
		}
		else if (n>2)
		{
			if (n%2==0)
			{
				return 0;
			}
			for (int i=3;i<=Math.sqrt(n);i+=2)
			{
				if (n%i==0)
				{
				return 0;
				}
			}
		}
		return 1;
	}
	public static float tinhTrungBinhCongCacSoNguyenTo(int a[])
	{
		int dem=0;
		int tong=0;
		float trungBinhCong;
		for (int i=0;i<a.length;i++)
		{
			if (kiemTraNguyenTo(a[i])==1)
			{	
				dem++;
				tong+=a[i];
			}
		}
		trungBinhCong = (tong*(1.0f)/dem); 
		return trungBinhCong;
	}
}
