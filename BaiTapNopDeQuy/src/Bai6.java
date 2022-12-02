import java.util.Scanner;

public class Bai6 {

	public Bai6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Vui lòng nhập x: ");
		int x = Integer.parseInt(scan.nextLine());
		System.out.println("Vui lòng nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		float tinh = tinh(n,x);
		System.out.println("Kết quả là: "+tinh);
	}
	public static float tinh(int n,int x)
	{
		if (n==1)
		{
			return x;
		}
		else
		{
			return (float) (tinh(n-1, x)+Math.pow(x, n));
		}
	}
}
