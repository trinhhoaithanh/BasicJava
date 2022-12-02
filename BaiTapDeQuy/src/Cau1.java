import java.util.Scanner;

public class Cau1 {

	public Cau1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.print("Vui lòng nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		float tong = tinhTong(n);
		System.out.print("Tổng là: "+tong);
	}
	public static float tinhTong (int n)
	{
		if (n==1)
		{
			return 0.5f;
		}
		else
		{
		return tinhTong(n-1)+n/(n+1);
		}
	}
}
