import java.util.Scanner;

public class Bai8 {

	public Bai8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n;
		do
		{
		System.out.println("Vui lòng nhập số nguyên dương n: ");
		 n = Integer.parseInt(scan.nextLine());
		}while (n<0);
		int dem = demChuSo(n);
		System.out.println("Số lượng chữ số của số nguyên dương n là: "+dem);
	}
	public static int demChuSo(int n)
	{
		if (n==0)
		{
			return 0;
		}
		else
		{
			return 1+demChuSo(n/10);
		}
	}
}
