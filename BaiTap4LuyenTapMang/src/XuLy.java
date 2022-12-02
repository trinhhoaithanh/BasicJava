import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args) {
			  Scanner scan = new Scanner(System.in);
			  int n = nhapN(scan);
			  int a[]  = nhapMang(scan,n);
			  xuatMang(a);
			  lietKe(a);
		
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

	public static int timSoDuongDauTien ( int a[]) {
		int index = -1; // chưa tìm thấy số dương đầu tiên 
		for(int i = 0; i < a.length; i++) {
			if(a[i] >0) {
				index = i; //đã tìm thấy số dương đầu tiên
				break;
			}
		}
		return index;
	}
	public static int timSoDuongNhoNhat(int a[]) {
		int indexDuong = timSoDuongDauTien(a);
		int indexMin = -1;
		if(indexDuong  == -1) {
			System.out.println("Mảng không có phần tử dương");
		} else {
			indexMin = indexDuong;
			for(int i = indexDuong + 1; i < a.length; i++) {
				if(a[i] > 0 && a[i] < a[indexMin]) {
					indexMin = i; 
				}
			}
		}
		return indexMin;
	}
	public static void lietKe(int a[]) {
		int indexMin = timSoDuongNhoNhat(a);
		if(indexMin == -1) {
			System.out.println("Mảng không có phần tử dương");
		} else {
			System.out.println("Các số dương bằng với số dương đầu tiên nhỏ nhất là: " + a[indexMin]);
			for(int i = indexMin + 1; i < a.length; i++) {
				if(a[i] == a[indexMin]) {
					System.out.println(i + "\t");
				}
			}
		}
	}

}

