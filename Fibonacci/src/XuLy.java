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
		inFibo(n);
		

	}
	public static int fibonacci( int n)
	{
		int a0=0;
		int a1=1;
		int an =1;//để kích hoạt
		int kq ;
		if (n<0)
		{
			kq= -1;
		}
		else if (n==0||n==1)
		{
			kq=n;
		}
		else 
		{
			for (int i=2;i<n;i++)
			{
				a0=a1;
				a1=an;
				an=a0+a1;
			}
			kq=an;
		}
		return kq;
	}
	public static void inFibo (int n)
	{
		System.out.print(n+ " chữ số của dãy fibonacci: ");
		for (int i=0; i<n;i++)
		{
			int ai = fibonacci(i);
			System.out.print(ai + "\t");
		}
	}
}
