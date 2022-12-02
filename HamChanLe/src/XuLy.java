import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	public static void chanLe (int a)
	{
		if (a%2==0)
		{
			System.out.print("Là số chẵn");
		}
		else 
		{
			System.out.print("Là số lẻ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner scan = new Scanner (System.in);
		System.out.print("Vui lòng nhập vào một số nguyên");
		x = Integer.parseInt(scan.nextLine());
		chanLe (x);
	}

}
