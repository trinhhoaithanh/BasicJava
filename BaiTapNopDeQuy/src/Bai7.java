import java.util.Scanner;

public class Bai7 {

	public Bai7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Vui lòng nhập n: ");
		float n = Integer.parseInt(scan.nextLine());
		float ketQua = tongChia(n);
		System.out.println("Kết quả: "+ketQua);
	}
	public static float tong(float n)
	{
		if (n==1)
		{
			return 1;
		}
		return tong(n-1)+n;
	}
	public static float tongChia(float n)
	{
		if (n==1)
		{
			return 1;
			
		}
		return tongChia(n-1)+1/(tong(n-1)+n);
	}
	
}
