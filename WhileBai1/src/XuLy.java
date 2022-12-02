import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int count =  demLanThiLai(scan);
		System.out.print("Số lần thi là "+ count);
	}
	public static int demLanThiLai(Scanner scan)
	{
		int count =0;
		float diem =0;
		while (diem <5)
		{
			System.out.print("Vui lòng nhập điểm: ");
			diem = Float.parseFloat(scan.nextLine());
			if (diem<5)
			{
				count++;
			}
			else 
			{
				System.out.println("Chúc mừng bạn đã thi đậu.");
			}
		}
		return count;
	}
}   
    