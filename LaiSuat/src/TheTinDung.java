import java.util.Scanner;

public class TheTinDung {

	public TheTinDung() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float TIEN_LAI = 0.015f;
		float soDu;
	    float thanhToan;
	    float tienPhat = 0;
	    float chuaThanhToan;
	    Scanner scan = new Scanner(System.in);
	    System.out.print ("Số Dư: ");
	    soDu = Float.parseFloat(scan.nextLine());
	    System.out.print("Tiền thanh toán trong tháng này: ");
	    thanhToan = Float.parseFloat(scan.nextLine());
	    chuaThanhToan = soDu - thanhToan;
	    if (chuaThanhToan > 0)
	    {
	    	tienPhat = chuaThanhToan * TIEN_LAI;
	    	
	    }
	    System.out.print("Tiền phạt là: " + tienPhat);

	}

}
