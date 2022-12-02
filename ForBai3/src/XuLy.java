import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n;
		System.out.print("Vui long nhap n: ");
		n = Integer.parseInt(scan.nextLine());
		int count ;
		count = chiaHetCho3DungWhile(n);
		System.out.print("Ket Qua La: " + count );

	}
/*	public static int chiaHetCho3(int n)
	{	int count =0;
		for (int i=0; i<n; i++)
		{	
			if (i%3==0)
			{
				count++;
			}
		}
		return count;
	}*/
	public static int chiaHetCho3DungWhile(int n)
	{	int count =0;
	    int i = 0;
		while (i<n)
		{
			if (i%3==0)
			{
				count++;
			}
			i++;
		}
		return count;
	}
}
