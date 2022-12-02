import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		nhapNguoiChoi(scan);
		mayChoi();
		int nguoiChoi = 0;
		int luotMayChoi = 0;
		choiOanTuTi(nguoiChoi, luotMayChoi);
		int soNguoiThang=0;
		int soMayThang = 0;
		xetTiSo(soNguoiThang, soMayThang);
	}
	public static int nhapNguoiChoi (Scanner scan)
	{	int nguoiChoi;
	     
	    do {
		System.out.println("Nhập số khác 0 để chơi và nhập 0 để dừng chơi: ");
	    nguoiChoi = Integer.parseInt(scan.nextLine());	
	    } while (nguoiChoi!=0);
		System.out.println("Trò chơi kết thúc.");
		return nguoiChoi;
	}
	public static int mayChoi ()
	{	
		
		int luotMayChoi = (int) (Math.random()*99 +1);
		return luotMayChoi;
		
	}
	public static void choiOanTuTi (int nguoiChoi, int luotMayChoi)
	{	
		int soNguoiThang=0;
		int soMayThang=0;
		if (nguoiChoi>luotMayChoi)
		{
			System.out.println("Bạn đã chiến thắng!");
			soNguoiThang++;
		}
		else if (nguoiChoi<luotMayChoi)
		{
			System.out.println("Máy chiến thắng.");
			soMayThang++;
		}
		else if (nguoiChoi == luotMayChoi)
		{
			System.out.println("Hòa nhau.");
		}
	}
	public static String xetTiSo (int soMayThang, int soNguoiThang)
	{
		String tiSo = null ;
		if (soNguoiThang>soMayThang)
		{
			System.out.println("Người có số lượt thắng nhiều hơn.");
			tiSo = soNguoiThang + " : " +soMayThang;
			System.out.print("Với tỉ số là: "+ tiSo);
		}
		else if (soNguoiThang<soMayThang)
		{
			System.out.println("Máy có số lượt thắng nhiều hơn.");
			tiSo = soMayThang +" : "+soNguoiThang;
			System.out.print("Với tỉ số là: "+ tiSo);
			
		}
		return tiSo;
	}

}
