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
		int a[] = nhapMang(n);
		xuatMang(a);
		int index = chanCuoiCung (a);
		if (index!=-1)
		{
		System.out.print("Só chẵn cuối cùng trong mảng là: "+ a[index]+ " tại vị trí "+index);
		}
		else
		{
			System.out.print("Không có số chẵn trong mảng");
		}
	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập n > 0  ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1 );
		return n;
	}

	public static int[] nhapMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}
	public static void xuatMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}
	public static int chanCuoiCung (int a[])
	{
		int index = -1;
		for (int i = a.length-1;i>0;i--)
		{
			if (a[i]%2==0)
			{
				index = i;//đã tìm thấy x
				break;
			}
		}
		return index;
	}
}
