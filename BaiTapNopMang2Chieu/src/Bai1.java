import java.util.Scanner;

public class Bai1 {

	public Bai1() {
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
		int soChan = soChanDauTien( a, soDong,  soCot);
		if (soChan!=-1)
		{
		System.out.print("Số chẵn đầu tiên trong ma trận là: "+soChan);
		}
		else
		{
			System.out.print("Mảng không tồn tại số chẵn nào.");
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
	public static int soChanDauTien(int a[][],int soDong, int soCot)
	{	
		for (int i=0;i<soDong;i++)
		{
			for (int j=0;j<soCot;j++)
			{
				if (a[i][j]%2==0)
				{	
					return a[i][j];
				}
			}
		}
		return -1;
		
	}
}
