import java.util.Scanner;

public class Bai1 {

	public Bai1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner (System.in);
		System.out.println("Vui lòng nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		float tong = tong(n);
		System.out.println("Tổng là: "+tong);
	}
	public static float tong(int n)
	{
		if (n==1)
		{
			return 0.5f;
		}
		else
		{
		return tong(n-1)+n*1.0f/(n+1);
		}
	}
}//
