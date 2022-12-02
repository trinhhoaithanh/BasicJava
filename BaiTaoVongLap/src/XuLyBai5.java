import java.util.Scanner;

public class XuLyBai5 {

	public XuLyBai5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN(scan);
		int ketQua = tinhGiaiThua(n);
		System.out.print("Giai thừa của "+n+ " là: "+ ketQua);
	}
	public static int nhapN (Scanner scan)
	{	
		int n;
		do 
		{
		System.out.print("Vui lòng nhập một số n lớn hơn 0: ");
		n = Integer.parseInt(scan.nextLine());
		}while (n<0);
		return n;
	}
	public static int tinhGiaiThua (int n)
	{	
		int ketQua=1;
		if (n==0 || n==1)
		{
			ketQua =1;
		}
		else 
		{	
			for (int i=1;i<=n;i++)
			{
				ketQua *=i;
			}
		}
		return ketQua;
	}

}
