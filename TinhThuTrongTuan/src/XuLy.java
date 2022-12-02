import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d;
		int m;
		int y;
		int dayOfWeek;
		int top;
		boolean flag = true;
		Scanner scan = new Scanner (System.in);
		System.out.print("Vui lòng nhập ngày: ");
		d = Integer.parseInt(scan.nextLine());
		System.out.print("Vui lòng nhập tháng: ");
		m = Integer.parseInt(scan.nextLine());
		System.out.print("Vui lòng nhập năm: ");
		y = Integer.parseInt(scan.nextLine());
		if (y<1582)
		{
			flag = false;
		}
		else 
		{
			if ((m <1)&&(m>12))
			{
				flag = false;
			}
			else 
			{
				switch (m)
				{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
				{
					top = 31;
					break;
				}
				case 2:
				{
					if ((y%4==0&&y%100!=0)||(y%400==0))
					{
						top = 29;
					}
					else 
					{
						top =28;
					}
					break;
				}
				default:
				{
					top =30;
				}
				}
			if ((d <1)||(d>top)) 
			{
				flag =false ;
			}
			else 
			{
				if (!flag)
				{
					System.out.print("Ngày không hợp lệ");
				}
				else 
				{
				int a = (14 - m)/12;
				y-=a;
				m+=12*a-2;
				dayOfWeek = (d + y + y/4 - y/100 + y/400 + ((31*m)/12))%7;
				if (dayOfWeek == 0)
				{
					System.out.print("Chủ Nhât");
				}
				else
				{
					System.out.print("Thứ "+ (dayOfWeek +1));
				}
				}
			}
			}
		}

	}

}
