import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static float tong3So(float a, float b, float c) {
		float tong = a + b + c;
		return tong;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		float x;
		float y;
		float z;
		Scanner scan = new Scanner(System.in);
		System.out.print("Vui long nhập só thứ nhất: ");
		x = Float.parseFloat(scan.nextLine());
		System.out.print("Vui long nhập só thứ hai: ");
		y = Float.parseFloat(scan.nextLine());
		System.out.print("Vui long nhập só thứ ba: ");
		z = Float.parseFloat(scan.nextLine());
		float ketQua = tong3So (x,y,z);
		System.out.print("Kết Quả là: " + ketQua);

	}

}
