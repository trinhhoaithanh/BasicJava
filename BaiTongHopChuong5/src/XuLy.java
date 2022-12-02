import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.print ("Nhap n");
		int n = Integer.parseInt(scan.nextLine());
		xuLySo(n);

	}
	public static void xuLySo(int n)
	{
		int count =0;
		int tong =0;
		int soBanDau = n;//Tạo bản sao cua n để xử lý
		int soDangTach;
		do 
		{
			soDangTach=soBanDau%10;
			count++;
			tong+=soDangTach;
			soBanDau/=10;
		}while(soBanDau!=0);
		System.out.println("Số "+n + "có "+ count +" chữ số");
		System.out.println("Chữ số cuối cùng của "+ n +"là "+ n%10);
		System.out.println("Chữ Số Đầu Tiên của "+ n +" là "+ soDangTach);
		System.out.println("Tổng các chữ số của "+ n+ " là "+ tong);
		//Đảo ngược
		System.out.print("Số Đảo Ngược Của Số "+n+" là ");
		while (n%10==0)
		{
			n/=10;
		}
		do 
		{
			System.out.print("" + n%10);
			n/=10;
		}while(n!=0);
		
	}
}
