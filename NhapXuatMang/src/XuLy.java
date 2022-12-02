import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
		Scanner scan= new Scanner (System.in);
		System.out.print("Nhập số phân tử n:");
		int n = Integer.parseInt(scan.nextLine());
		int a[]=nhapMang( n, scan);
		xuatMang(a);
		xuatMangForEach(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner (System.in);
		System.out.print("Nhập số phân tử n:");
		int n = Integer.parseInt(scan.nextLine());
		int a[]=nhapMang( n, scan);
		xuatMang(a);
		xuatMangForEach(a);
	}
	public static int [] nhapMang(int n,Scanner scan)
	{
		int a[]=new int [n];
		System.out.print("Nhập mảng một chiều:");
		for (int i=0;i<a.length;i++)
		{
			System.out.print("a["+i+"]= ");
			a[i]= Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	public static void xuatMang(int a[])
	{
		System.out.print("Xuất mảng một chiều: ");
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
	public static void xuatMangForEach( int a[])
	{	
		System.out.print("Xuất mảng cách hai: ");
		for (int pt:a)
		{
			System.out.print(pt+"\t");
		}
	}
}
