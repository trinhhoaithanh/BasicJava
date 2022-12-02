import java.util.Scanner;

public class Bai5 {

	public Bai5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Vui lòng nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		float kQua = tinh(n);
		System.out.println("Kết quả là: "+kQua);
	}
	public static float tinh(int n )
	{
		if (n==1)
		{
			return 0.5f;
		}
		else
		{
			return tinh(n-1)+1.0f/(n*(n+1));
		}
	}
}
