import java.util.Scanner;

public class XuLyBai2 {

	public XuLyBai2() {
		// TODO Auto-generated constructor stub
	}
	public static final float THUE_SUAT_DEN60 = 0.05f;
	public static final float THUE_SUAT_60_DEN_120 = 0.1f;
	public static final float THUE_SUAT_120_DEN_216 = 0.15f;
	public static final float THUE_SUAT_216_DEN_384 = 0.2f;
	public static final float THUE_SUAT_384_DEN_624 = 0.25f;
	public static final float THUE_SUAT_624_DEN_960 = 0.3f;
	public static final float THUE_SUAT_TREN_960 = 0.35f;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		String hoTen = nhapHoTen( scan);
		float thuNhap = nhapTongThuNhapNam(scan);
		int soNguoiPhuThuoc = nhapSoNguoiPhuThuoc(scan);
		float thuNhapChiuThue = tinhThuNhapChiuThue(scan, thuNhap, soNguoiPhuThuoc);
		float thueSuat = tinhThueSuat (thuNhapChiuThue);
		float tienThuePhaiTra = tinhThueThuNhapCaNhan( thuNhapChiuThue,  thueSuat, scan,  soNguoiPhuThuoc, thuNhap);
		System.out.print("Thuế thu nhập cá nhân phải trả là: "+ tienThuePhaiTra);
	}
	public static String nhapHoTen(Scanner scan)
	{
		String hoTen;
		System.out.print("VuiLòng Nhập Họ Tên:");
		hoTen = scan.nextLine();
		return hoTen;
	}
	public static float nhapTongThuNhapNam(Scanner scan)
	{
		float thuNhap;
		System.out.print("Vui Lòng Nhập Thu Nhập Năm: ");
		thuNhap = Float.parseFloat(scan.nextLine());
		return thuNhap;
	}
	public static int nhapSoNguoiPhuThuoc(Scanner scan)
	{
		int soNguoiPhuThuoc;
		System.out.print("Vui lòng nhập số người phụ thuộc: ");
		soNguoiPhuThuoc = Integer.parseInt(scan.nextLine());
		return soNguoiPhuThuoc;
	}
	public static float tinhThuNhapChiuThue(Scanner scan, float thuNhap, int soNguoiPhuThuoc)
	{
		float thuNhapChiuThue=0;
		thuNhapChiuThue = thuNhap - 4 - soNguoiPhuThuoc*1.6f;
		return thuNhapChiuThue;
	}
	public static float tinhThueSuat (float thuNhapChiuThue)
	{
		float thueSuat = 0;
		if (thuNhapChiuThue >0 && thuNhapChiuThue <=60)
		{
			thueSuat = THUE_SUAT_DEN60;
		}
		else if (thuNhapChiuThue > 60 && thuNhapChiuThue <=120)
		{
			thueSuat = THUE_SUAT_60_DEN_120;
		}
		else if (thuNhapChiuThue >120 && thuNhapChiuThue <=216)
		{
			thueSuat = THUE_SUAT_120_DEN_216;
		}
		else if (thuNhapChiuThue >216 && thuNhapChiuThue <=384)
		{
			thueSuat = THUE_SUAT_216_DEN_384;
		}
		else if (thuNhapChiuThue >384 && thuNhapChiuThue <=624)
		{
			thueSuat = THUE_SUAT_384_DEN_624;
		}
		else if (thuNhapChiuThue >624 && thuNhapChiuThue <=960)
		{
			thueSuat = THUE_SUAT_624_DEN_960;
		}
		else if (thuNhapChiuThue >960)
		{
			thueSuat = THUE_SUAT_TREN_960;
		}
		return thueSuat;
	}
	public static float tinhThueThuNhapCaNhan(float thuNhapChiuThue, float thueSuat,Scanner scan, int soNguoiPhuThuoc, float thuNhap)
	{
		float tienThuePhaiTra = 0;
		tienThuePhaiTra = tinhThuNhapChiuThue(scan, thuNhap, soNguoiPhuThuoc)*tinhThueSuat (thuNhapChiuThue);
		return tienThuePhaiTra;
		
	}
	
	

}
