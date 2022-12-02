import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	public static final float KHU_VUC_A = 2.0f;
	public static final float KHU_VUC_B = 1.0f;
	public static final float KHU_VUC_C = 0.5f;
	public static final float DOI_TUONG_1 = 2.5f;
	public static final float DOI_TUONG_2 = 1.5f;
	public static final float DOI_TUONG_3 = 1.0f;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
			float diemMon1;
			float diemMon2;
			float diemMon3;
			System.out.print("Vui lòng nhập điểm môn thứ nhất: ");
			diemMon1 = Float.parseFloat(scan.nextLine());
			System.out.print("Vui lòng nhập điểm môn thứ hai: ");
			diemMon2 = Float.parseFloat(scan.nextLine());
			System.out.print("Vui lòng nhập điểm môn thứ ba: ");
			diemMon3 = Float.parseFloat(scan.nextLine());
		String khuVuc = nhapKhuVuc(scan);
		float doiTuong = nhapDoiTuong(scan);
		float diemChuan = nhapDiemChuanHoiDong(scan);
		float diemTongKet = tinhDiemTongKet (khuVuc, doiTuong,diemMon1, diemMon2, diemMon3);
		xetDauRot(diemChuan, diemTongKet);
	}
	public static float nhapDiemChuanHoiDong(Scanner scan)
	{	float diemChuan;
		System.out.print("Vui Lòng Nhập Điểm Chuẩn: ");
		diemChuan = Float.parseFloat(scan.nextLine());
		return diemChuan;
	}
	public static void nhapDiem3MonThi(Scanner scan)
	{
		float diemMon1;
		float diemMon2;
		float diemMon3;
		System.out.print("Vui lòng nhập điểm môn thứ nhất: ");
		diemMon1 = Float.parseFloat(scan.nextLine());
		System.out.print("Vui lòng nhập điểm môn thứ hai: ");
		diemMon2 = Float.parseFloat(scan.nextLine());
		System.out.print("Vui lòng nhập điểm môn thứ ba: ");
		diemMon3 = Float.parseFloat(scan.nextLine());
	}
	public static float tinhTongDiem3MonThi(float diemMon1, float diemMon2, float diemMon3)
	{
		float diemTong3Mon = 0;
		diemTong3Mon = diemMon1 + diemMon2 + diemMon3;
		return diemTong3Mon;
	}
	public static String nhapKhuVuc(Scanner scan)
	{
		String khuVuc;
		System.out.print("Vui lòng nhập khu vực A,B,C và nếu không có thì nhập X: ");
		khuVuc = scan.nextLine();
		return khuVuc;
	}
	public static float nhapDoiTuong(Scanner scan)
	{
		float doiTuong;
		System.out.print("Vui lòng nhập đối tượng từ 1 đến 3 và không có thì nhập 0: ");
		doiTuong = Float.parseFloat(scan.nextLine());
		return doiTuong;
	}
	public static float tinhDiemKhuVuc(String khuVuc)
	{	float diemKhuVuc = 0;
		switch (khuVuc)
		{
		case "A":
		{
			diemKhuVuc = KHU_VUC_A;
			break;
		}
		case "B": 
		{
			diemKhuVuc = KHU_VUC_B;
			break;
		}
		case "C": 
		{
			diemKhuVuc = KHU_VUC_C;
			break;
		}
		case "X":
		{
			diemKhuVuc = 0;
			break;
		}
		}
		return diemKhuVuc;
	}
	public static float tinhDiemDoiTuong (float doiTuong)
	{
		float diemDoiTuong = 0;
		if (doiTuong == 1)
		{
			diemDoiTuong = DOI_TUONG_1;
		}
		else if (doiTuong == 2)
		{
			diemDoiTuong = DOI_TUONG_2;
		}
		else if (doiTuong == 3)
		{
			diemDoiTuong = DOI_TUONG_3;
		}
		else if (doiTuong == 0)
		{
			diemDoiTuong = 0;
		}
		return diemDoiTuong;
	}
	public static float tinhDiemUuTien(String khuVuc, float doiTuong)
	{
		float diemUuTien = 0;
		diemUuTien = tinhDiemKhuVuc(khuVuc)+ tinhDiemDoiTuong(doiTuong);
		return diemUuTien;
	}
	public static float tinhDiemTongKet(String khuVuc, float doiTuong, float diemMon1, float diemMon2, float diemMon3)
	{
		float diemTongKet =0;
		diemTongKet = tinhTongDiem3MonThi(diemMon1,diemMon2,diemMon3) + tinhDiemUuTien(khuVuc,doiTuong);
		return diemTongKet;
	}
	public static void xetDauRot(float diemChuan, float diemTongKet)
	{
		if (diemTongKet >=diemChuan)
		{
			System.out.print ("Bạn đã thi đậu với tổng số điểm là "+ diemTongKet);
		}
		else 
		{
			System.out.print("Bạn đã thi trượt.");
		}
	}
	

}
