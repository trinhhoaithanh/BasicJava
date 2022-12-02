import java.util.Scanner;

public class DemoCanhhuyen {

	public DemoCanhhuyen() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edge1;
        int edge2;
       Scanner scan= new Scanner(System.in);
       System.out.println("Vui lòng nhập vào canh thứ nhất: ");
       edge1= Integer.parseInt(scan.nextLine());
       System.out.println("Vui lòng nhập vào cạnh thứ 2: ");
       edge2= Integer.parseInt(scan.nextLine());
       double edge3 = Math.sqrt(edge1*edge1 + edge2*edge2 );
       System.out.println("Cạnh Huyền bằng: " + edge3 );
       
       
       
       

	}

}
