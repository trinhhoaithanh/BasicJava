import java.util.Scanner;

public class CongSo {

	public CongSo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int n;
		int hundred;
		int ten;
		int unit;
		int sum;
		Scanner scan = new Scanner(System.in);
		System.out.print("Hãy nhập một số n có 3 chữ số: ");
		n = Integer.parseInt(scan.nextLine());
	   hundred = n/100;
	   ten = (n%100)/10;
	   unit = n%10;
	   sum = hundred + ten + unit ;
	   System.out.print("Tong cua ba chu so cua "+n+ " la \t"+sum );
		

	}

}
