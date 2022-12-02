import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	public static final int MIN = -100;
	public static final int MAX = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN(scan);
		int a[]=nhapMang(n);
		xuatMang(a);
		printMaxRun(a);
		
	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Vui lỏng nhập n:");
			n = Integer.parseInt(scan.nextLine());
		} while (n<1);
		return n;
	}

	public static int[] nhapMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}
	public static void xuatMang (int a[])
	{
		for (int pt: a)
		{
			System.out.print(pt +"\t");
		}
		System.out.print("\n");
	}
	public static void printMaxRun (int a[])
	{
		int head = 0;
		int maxLength = 0;
		int maxHead = 0;
		do 
		{
			int i;
			int len =1;
			for(i=head;i<(a.length -1 )&& a[i]<a[i+1];i++)
			{
				len++;
			}
			if (len>maxLength)
				
			{
				maxLength = len;
				maxHead = head;
			}
			head = i +1;
		}while (head<a.length);
		System.out.print ("Run dài nhất là: ");
		for (int i=0;i<maxLength;i++)
		{
			System.out.print(a[maxHead+i] +"\t");
		}
		
	}
}
