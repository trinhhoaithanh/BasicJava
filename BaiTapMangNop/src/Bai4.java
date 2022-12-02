import java.util.Scanner;

public class Bai4 {

	public Bai4() {
		// TODO Auto-generated constructor stub
	}
	public static final int MIN = -1000;
	public static final int MAX = 1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int n =nhapN(scan);
		int a[] = nhapMang(n,scan);
		xuatMang(a);
		lietKeGiaTriToanLe(a,  n);
	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Vui lỏng nhập n:");
			n = Integer.parseInt(scan.nextLine());
		} while (n <1);
		return n;
	}

	public static int[] nhapMang(int n, Scanner scan) {
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
	public static boolean kiemTraLe(int n) {
    n = Math.abs(n);
    do {
        int tam = n % 10;
        if (n % 2 == 0)
            return false;
        n /= 10;
    } while (n > 0);
    return true;
}
 
public static void lietKeGiaTriToanLe(int a[], int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
        if (kiemTraLe(a[i])) {
        	System.out.print(a[i]+"\t");
        	count++;
        }
    }
    if (count == 0)
       System.out.print("Không có số nào toàn chữ số lẻ");
}
}
