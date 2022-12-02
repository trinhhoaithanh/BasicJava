import java.util.Scanner;

public class XuLy {
	public static final int MIN = -100;
	public static final int MAX = 100;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in)) {
			System.out.println("Nhập số phần tử cho mảng A và B (n,m>0)");
			System.out.print("n= ");
			int n = Integer.parseInt(scan.nextLine());
			System.out.print("m= ");
			int m = Integer.parseInt(scan.nextLine());
			int a[] = taoMang(n);
			int b[] = taoMang(m);
			xuatMang(a);
			xuatMang(b);
			interchangeSort(a);
			interchangeSort(b);
			System.out.print("Mảng A sắp tăng dần: ");
			xuatMang(a);
			System.out.print("Mảng B sắp tăng dần: ");
			xuatMang(b);
			int c[] = merge(a,b);
			giamDan(c);
			System.out.println("Trộn A và B thành C giảm dần:");
			xuatMang(c);
		}
	}
	public static int[] taoMang(int n) {
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
	
	public static void interchangeSort (int a[])
	{
		int i,j;
		int tam = a[0];
		for (i=0;i<a.length-1;i++)
		{
			for (j=i+1;j<a.length;j++)
			{
				if (a[j]<a[i])
				{
					 tam = a[i];
					a[i] = a[j];
					a[j] = tam;
				}
			}
		}
	}
	 public static int[] merge(int[] a, int[] b) {
	        int aIndex = a.length - 1;
	        int bIndex = b.length - 1;
	        int cIndex = a.length + b.length - 1;
	        int[] c = new int[cIndex + 1];
	        for (int i = cIndex; i > -1; i--) {
	            if (aIndex > -1 && bIndex > -1) {
	                if (a[aIndex] < b[bIndex]) {
	                    c[i] = a[aIndex--];
	                } else {
	                    c[i] = b[bIndex--];
	                }
	            } else if (bIndex == -1) {
	                c[i] = a[aIndex--];
	            } else if (aIndex == -1) {
	                c[i] = b[bIndex--];
	            }
	        }
	        return c;
	    }
	 public static void giamDan(int c[])
	 {
		 int tam = c[0];
	        for (int i = 0 ; i < c.length - 1; i++) {
	            for (int j = i + 1; j < c.length; j++) {
	                if (c[i] < c[j]) {
	                    tam = c[j];
	                    c[j] = c[i];
	                    c[i] = tam;
	                }
	            }
	        }
	 }
}
