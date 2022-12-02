import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n = nhapN(scan);
		int a[]=nhapMang (scan,n);
		xuatMang(a);
		lietKeSoAmNhoNhat(a);

	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập n > 0  ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1 );
		return n;
	}

	public static int[] nhapMang(Scanner scan, int n) {
		int a[] = new int[n];
		for(int i  = 0; i < n; i++) {
			System.out.print("a[" +i +"] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}
	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}
	public static void lietKeSoAmNhoNhat (int a[])
	{
		int indexMin = -1;//Chưa tìm thấy 
		for (int i=0;i<a.length;i++)
		{
			if (a[i]<0)
			{
				indexMin = i;
				break;
			}
		}
		if (indexMin !=-1)//Phải xét bước này vì có thể mảng chỉ toàn là dương nên indexMin mãi -1
		{
			//tìm pt âm thật sự
			for (int i = indexMin+1;i<a.length;i++)
			{
				if (a[i]<0 && a[i]<a[indexMin])
				{
					indexMin = i;
				}
				
			}
			System.out.print("các phần tử âm nhỏ nhất "+a[indexMin]+ " xuất hiện tại: ");
			for (int i = indexMin;i<a.length;i++)
			{
				if (a[i]==a[indexMin])
				{
				System.out.print(i+"\t");
				}
				
			}
		}
		else 
		{
			System.out.print("Không có phần tử âm nào cả.");
		}
	
	}
}
