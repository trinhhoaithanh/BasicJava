import java.util.Scanner;

public class Bai9 {

	public Bai9() {
		// TODO Auto-generated constructor stub
	}
	final static int MIN = -50;
	final static int MAX = 50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int soDong = nhapN(scan);
		int soCot = nhapN(scan);
		int a[][] = taoMang(soDong,soCot);
		xuatMang(a,soDong,soCot);
		System.out.print("Vui lòng nhập số cột cần tính tổng: ");
		int cot = Integer.parseInt(scan.nextLine());
		int tong = tinhTongGiaTriLeTrenCot(a, soDong, cot);
		System.out.print("Tổng các giá trị lẻ trên cột "+cot+" là: "+tong);
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
	public static int tinhTongGiaTriLeTrenCot(int a[][], int soDong,int cot)
	{
		int tong=0;
		for (int i=0;i<soDong;i++)
		{
			if (a[i][cot]%2!=0)
			{
				tong+=a[i][cot];
			}
		}
		return tong;
	}
}
