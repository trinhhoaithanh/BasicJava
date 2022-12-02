import java.util.Scanner;

public class XuLyBai7 {

	public XuLyBai7() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN(scan);
		tamGiacCan1(n);
		tamGiacCan2(n);
		
	}
	public static int nhapN(Scanner scan)
	{	int n;
		do
		{
		System.out.print("Vui lòng nhập độ cao n: ");
		n = Integer.parseInt(scan.nextLine());
		}while (n<0);
		return n;
	}
	public static void tamGiacCan1(int n)
	{
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<2*n;j++)
			{
				if (Math.abs(n-j)<= Math.abs(i-1))
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.print("\n");
		}
	}
	public static  void tamGiacCan2(int n)
	{	int k=n-1;
		int i;
		int j;
		for ( i=0;i<n-1;i++)
		{
			for ( j=0;j<2*n-1;j++)
			{	

				if (j==k+i||j==k-i)
				{
				System.out.print(" * ");
				}
				else
				{
				System.out.print ("   ");	
				}
			}
			System.out.print("\n");
		}
		for ( i=0;i<2*n-1;i++)
		{
			System.out.print(" * ");
		}
	}
}
