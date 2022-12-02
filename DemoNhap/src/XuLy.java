import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in );
	System.out.println("Nhập một số thực ");
    String value1 = scan.nextLine();
    System.out.println("Nhập thêm 1 số thực nữa ");
    String value2 = scan.nextLine();
    float num1 = Float.parseFloat(value1);
    float num2 = Float.parseFloat(value2);
    float tong = num1 + num2;
    System.out.println("Tổng là "+ tong);

	}

}
