import java.util.Scanner;

public class LamThemGio {

	public LamThemGio() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    final int STANDARD_HOUR = 40;
	    final float OVERTIME_RATE = 1.5f;
	    float hour;
	    float rate;
	    float payment;
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Nhập số giờ: ");
	    hour = Float.parseFloat(scan.nextLine());
	    System.out.print("Tiền theo giờ: ");
	    rate = Float.parseFloat(scan.nextLine());
	    if (hour>STANDARD_HOUR)
	    {
	    	payment = STANDARD_HOUR* rate + OVERTIME_RATE* rate*(hour - STANDARD_HOUR);
	    }
	    else 
	    {
	    	payment = hour * rate;
	    }
	    System.out.print("Lương là: "+ payment);
	    

	}

}
