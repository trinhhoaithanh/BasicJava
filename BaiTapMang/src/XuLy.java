import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Xin vui lòng nhập n:");
		int n = Integer.parseInt(scan.nextLine());
		int a[]= nhapMang(n,scan);
		xuatMang(a);
		int tongSoChan = tinhTongSoChanDungFor(a);
		System.out.println("Tổng các số chẵn là: " + tongSoChan);
		int tongSoChanCach2 = tinhTongSoChanDungForEach(a);
		System.out.println("Tổng số chắn dùng fỏ each: " +tongSoChanCach2);
		int demSoAm = demSoAmDungFor(a);
		System.out.println("Có "+ demSoAm + " số âm");
		int demSoAmCach2 = demSoAmDungForEach(a);
		System.out.println("Có "+ demSoAmCach2 + " số âm");
		int tongSoAm = tinhTongSoAm( a);
		System.out.println("Tổng các số âm là: " + tongSoAm);
		int tongSoAmCach2 = tinhTongAmDungForEach ( a);
		System.out.print("Tổng các số âm là: " + tongSoAmCach2);

	}
	public static int [] nhapMang(int n, Scanner scan)
	{
		int a[]=new int[n];
		System.out.print("Nhập các số nguyên:");
		for (int i=0; i<a.length;i++)
		{
			System.out.print("a["+i+"]= ");
			
			a[i]= Integer.parseInt(scan.nextLine());
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
	public static int tinhTongSoChanDungFor(int a[])
	{
		int tong=0;
		for (int i=0;i<a.length;i++)
		{
		if (a[i]%2==0)
		{
			tong+=a[i];
		}
		}
		return tong;
	}
	public static int tinhTongSoChanDungForEach(int a[])
	{
		int tong=0;
		for (int pt:a)
		{
			if (pt%2==0)
			{
				tong+=tong;
		}
		}
		return tong;
	}
	public static int demSoAmDungFor(int a[])
	{
		int count=0;
		for (int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				count++;
			}
		}
		return count;
	}
	public static int demSoAmDungForEach(int a[])
	{	int count =0;
		for (int pt:a)
		{
			if (pt<0)
			{
				count++;
			}
		}
		return count;
	}
	public static int tinhTongSoAm(int a[])
	{
		int tong=0;
		for (int i=0; i<a.length;i++)
		{
			if (a[i]<0)
			{
				tong+=a[i];
			}
		}
		return tong;
	}
	public static int tinhTongAmDungForEach (int a[])
	{
		int tong=0;
		for (int pt:a)
		{
			if (pt<0)
			{
				tong+=pt;
			}
		}
		return tong;
	}
}
