import java.util.Scanner;

public class XuLyBai1 {

	public XuLyBai1() {
		// TODO Auto-generated constructor stub
	}
	public static final int MIN = -100;
	public static final int MAX = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int nguoiChoi;
		int mayChoi;
		int soNguoiThang=0;
		int soMayThang = 0;
		do
		{
			System.out.print("Vui lòng nhâp một số khác không để chơi: ");
			nguoiChoi = Integer.parseInt(scan.nextLine());
			mayChoi = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
			System.out.println("Lượt máy chơi: "+ mayChoi);
		if (nguoiChoi>mayChoi)
		{
			System.out.println("Bạn đã chiến thắng");
			soNguoiThang++;
		}
		else if (nguoiChoi<mayChoi)
		{
			System.out.println("Bạn đã thua");
			soMayThang++;
		}
		else 
		{
			System.out.println("Hai bên hòa nhau");
		}
		}while (nguoiChoi!=0);
		System.out.println("Trò chơi kết thúc.");
		if (soNguoiThang>soMayThang)
		{
			System.out.println("Bạn thắng nhiều hơn với tỉ số là: "+soNguoiThang+"\t"+soMayThang);
		}
		else if (soMayThang>soNguoiThang)
		{
			System.out.println("Máy thắng nhiều hơn với tỉ số là: "+soMayThang+"\t"+soNguoiThang);
		}
		else
		{
			System.out.println("Hai bên hòa nhau với tỉ số là:"+soNguoiThang+"\t"+soMayThang);
		}
	}
	/*public static int luotNguoiChoi (Scanner scan)
	{	int nguoiChoi;
		do
		{
			System.out.print("Vui lòng nhâp một số khác không để chơi: ");
			nguoiChoi = Integer.parseInt(scan.nextLine());
		}while (nguoiChoi!=0);
		System.out.println("Trò chơi kết thúc.");
		return nguoiChoi;
	}
	public static int luotMayChoi ()
	{	int mayChoi;
			mayChoi = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
			return mayChoi;
	}
	public static void xetThangThua (int nguoiChoi, int mayChoi)
	{	int soNguoiThang=0;
		int soMayThang = 0;
		do
		{
		if (nguoiChoi>mayChoi)
		{
			System.out.println("Bạn đã chiến thắng");
			soNguoiThang++;
		}
		else if (nguoiChoi<mayChoi)
		{
			System.out.println("Bạn đã thua");
			soMayThang++;
		}
		else 
		{
			System.out.println("Hai bên hòa nhau");
		}
	}while (nguoiChoi!=0);
	System.out.println("Trò chơi kết thúc.");
	System.out.println("Số lượt người thắng là: "+soNguoiThang);
	System.out.println("Số lượt máy thắng là: "+soMayThang);
	}
	public static void inTiSo (int soNguoiThang, int soMayThang)
	{
		if (soNguoiThang>soMayThang)
		{
			System.out.print("Người thắng nhiều hơn với tỉ số là: "+soNguoiThang+"\t"+soMayThang);
		}
		else if (soMayThang>soNguoiThang)
		{
			System.out.print("Máy thắng nhiều hơn với tỉ số là: "+soMayThang+"\t"+soNguoiThang);
		}
		else
		{
			System.out.print("Hai bên hòa nhau với tỉ số là:"+soNguoiThang+"\t"+soMayThang);
		}
	}*/
	
}
