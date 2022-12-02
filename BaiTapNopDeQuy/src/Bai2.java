import java.util.Scanner;

public class Bai2 {

	public Bai2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Vui lòng nhập n: ");
		int n =Integer.parseInt(scan.nextLine());
		float tinh = tinh(n);
		System.out.println("Kết quả là: "+tinh);
	}
	public static float tinh(int n)
	{
		if (n==1)
		{
			return 1;
		}
		else
		{
			return (float) Math.sqrt(n+tinh(n-1));
		}
	}
}
