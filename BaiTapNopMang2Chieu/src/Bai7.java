import java.util.Scanner;

public class Bai7 {

	public Bai7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int soDong = nhapN(scan);
		int soCot = nhapN(scan);
		int a[][] =nhapMang(soDong,soCot,scan);
		xuatMang(a,soDong,soCot);
		boolean flag = kiemTraMotCotGiam(a,soDong,soCot);
		if (flag)
		{
			System.out.print("Có cột giảm dần.");
		}
		else
		{
			System.out.print("Không có cột nào giảm dần cả.");
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

	public static int[][] nhapMang(int soDong,int soCot, Scanner scan) {
		int a[][] = new int[soDong][soCot];

		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print("a[" + i + "]" + "[" + j + "] = ");
				a[i][j] = Integer.parseInt(scan.nextLine());
			}
		}

		return a;

	}

	public static void xuatMang(int a[][], int soDong,int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\t");
		}
}
	public static boolean kiemTraMotCotGiam(int a[][], int soDong, int soCot)
	{	boolean flag=true;
		for (int i=0;i<soDong-1;i++)
		{
			for (int j=0;j<soCot;j++)
			{
				if(a[i][j]<a[i+1][j])
				{
					flag=false;
					break;
				}
			}
		}
		return flag;
	}
}
