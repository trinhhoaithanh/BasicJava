import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	public static int timSoLonNhat (int a, int b, int c)
	{
		int soLonNhat = a;
		if (b>soLonNhat)
		{
			soLonNhat =b;
		}
		if (c>soLonNhat)
		{
			soLonNhat = c;
		}
		return soLonNhat;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int x;
	    int y;
	    int z;
	    Scanner scan = new Scanner (System.in);
	    System.out.println("Vui lòng nhập 3 số: ");
	    x = Integer.parseInt(scan.nextLine());
	    y = Integer.parseInt(scan.nextLine());
	    z = Integer.parseInt(scan.nextLine());
	    int max = timSoLonNhat (x, y ,z);
	    System.out.print("Số Lớn Nhất là: " + max);
	}

}
