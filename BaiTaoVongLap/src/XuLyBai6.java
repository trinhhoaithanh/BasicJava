import java.util.Scanner;

public class XuLyBai6 {

	public XuLyBai6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		float soTienGui = nhapSoTienGui(scan);
		float soTienMuon = nhapSoTienMuon(scan);
		float soTienLai = tinhSoTienLai (scan, soTienGui);
		int soNamChoDoi = tinhSoNamChoDoi (scan,soTienGui, soTienMuon, soTienLai);
		System.out.print("Số năm ít nhất mà anh X phải chờ đợi là: "+ soNamChoDoi + " năm.");
	}
	public static float nhapSoTienGui (Scanner scan)
	{
		float soTienGui;
		do
		{
		System.out.print("Vui lòng nhập vào số tiền gửi: ");
		soTienGui = Float.parseFloat(scan.nextLine());
		}while (soTienGui<0);
		return soTienGui;
	}
	public static float nhapSoTienMuon (Scanner scan)
	{
		float soTienMuon;
		System.out.print("Vui lòng nhập vào số tiền mong muốn: ");
		soTienMuon = Float.parseFloat(scan.nextLine());
		return soTienMuon;
	}
	public static float tinhSoTienLai (Scanner scan, float soTienGui)
	{
		float laiSuatTietKiem;
		float soTienLai;
			System.out.print("Vui lòng nhập số lãi suất tiết kiệm: ");
			laiSuatTietKiem = Float.parseFloat(scan.nextLine());
			soTienLai = soTienGui* (laiSuatTietKiem*1.0f/100);
		return soTienLai;
	}
	public static int tinhSoNamChoDoi (Scanner scan, float soTienGui, float soTienMuon, float soTienLai)
	{	int soNamChoDoi = 0;
		float soTienTichLuy;
		do
		{
		soTienTichLuy = soTienGui + soTienLai;
		soNamChoDoi++;
		}while (soTienTichLuy>=soTienMuon);
		return soNamChoDoi;
	}
}
