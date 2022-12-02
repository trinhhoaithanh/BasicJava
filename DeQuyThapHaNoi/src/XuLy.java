import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.print("Vui lòng nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		thapHaNoi (n,'A','B','C');
		
	}
	public static void chuyen (int n, char X, char Y)
	{
		//Chuyển đĩa từ cọc X sang cọc Y 
		System.out.println("Chuyển từ đĩ thứ "+n+" từ cọc "+X+" sang cọc "+Y);
	}
	public static void thapHaNoi (int n, char A, char B, char C)
	{
		// điểm dừng
		if (n==1)
		{
			chuyen (1,A,C);
		}
		else
		{
			thapHaNoi (n-1,A,C,B);
			chuyen (n,A,C);
			thapHaNoi (n-1,B,A,C);
		}
	}
}
