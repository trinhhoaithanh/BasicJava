import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN(scan);
		int a[]=nhapMang(n,scan);
		xuatMang(a);
		lietKeChiSo(a);

	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Vui lỏng nhập n:");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 0);
		return n;
	}

	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "]=");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	public static void xuatMang(int a[])
	{
		for (int pt:a)
		{
			System.out.print(pt +"\t");
		}
	}
	public static int timChiSoAmDauTien (int a[])
	{
		int index =-1;//chưa tìm thấy
		for (int i=0;i<a.length;i++)
		{
			if (a[i]<0)
			{
				index=i;
			}
			break;
		}
		return index;
	}
	public static void lietKeChiSo (int a[])
	{
		int index=timChiSoAmDauTien( a);
		if (index==-1)
		{
			System.out.println("Mảng không có số âm");
		}
		else 
		{
			System.out.println("Các chỉ số tại đó có giá tị bằng " + a[index]);
			for (int i=index+1;i< a.length; i++)
			{
				if (a[i]==a[index])
				{
					System.out.print(i +"\t");
				}
			}
		}
	}
	
	
}
