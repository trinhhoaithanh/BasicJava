import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		soNgauNhien(scan);
	}
	public static void soNgauNhien(Scanner scan)
	{	int nhap;
		int soBiMat;
		soBiMat = (int) (Math.random()*99+1);

		do 
		{
			System.out.println("Vui long nhap mot so: ");
		    nhap = Integer.parseInt(scan.nextLine());
		    if (nhap>soBiMat)
		    {
		    	System.out.println("Vui long nhap so nho hon");
		 
		    }
		    else if (nhap< soBiMat)
		    {
		    	System.out.println("Vui long nhap so lon hon");
		    }
		} while (nhap!=soBiMat);
		System.out.println("Chuc mung chien thang!");
	}
}
