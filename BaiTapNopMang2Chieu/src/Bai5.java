import java.util.Scanner;

public class Bai5 {

	public Bai5() {
		// TODO Auto-generated constructor stub
	}
	final static int MIN = -50;
	final static int MAX = 50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int soDong= nhapN(scan);
		int soCot = nhapN(scan);
		int a[][] = taoMang(soDong,soCot);
		xuatMang(a,soDong,soCot);
		int soNguyenToLonNhat = timSoNguyenToDauTien(a,soDong,soCot);
		if (soNguyenToLonNhat==-1)
		{
			System.out.print("Ma trận không tồn tại số nguyên tố nào.");
		}
		else
		{
			System.out.print("Số nguyên tố đầu tiên trong ma trận là: "+soNguyenToLonNhat);
		}
	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập vào giá trị >1");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}
	public static int[][] taoMang(int soDong, int soCot) {
		int a[][] = new int[soDong][soCot];

		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				a[i][j] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
			}
		}

		return a;

	}
	public static void xuatMang(int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\t");
		}
	}
	public static int kiemTraSoNguyenTo(int n)
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
	public static int timSoNguyenToDauTien(int a[][], int soDong, int soCot)
	{
		for (int i=0;i<soDong;i++)
		{
			for (int j=0;j<soCot;j++)
			{
				if (kiemTraSoNguyenTo(a[i][j])==1)
				{
					return a[i][j];
				}
			}
		}
		return -1;//Không có số nguyên tố nào
	}
}
