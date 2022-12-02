import java.util.Scanner;

public class XuLy {
	final static int GRAB_CAR_1KM = 8000;
	final static int GRAB_SUV_1KM = 9000;
	final static int GRAB_BLACK_1KM = 10000;
	final static int GRAB_CAR_1TO19 = 7500;
	final static int GRAB_SUV_1TO19 = 8500;
	final static int GRAB_BLACK_1TO19 = 9500;
	final static int GRAB_CAR_OVER19 = 7000;
	final static int GRAB_SUV_OVER19 = 8000;
	final static int GRAB_BLACK_OVER19 = 9000;
	final static int GRAB_CAR_WAIT = 2000;
	final static int GRAB_SUV_WAIT = 3000;
	final static int GRAB_BLACK_WAIT = 3500;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int loai = chonGrab(scan);
        int soKm = nhapSoKm (scan);
        float thoiGianCho = nhapThoiGianCho (scan);
        float tienTra = tinhTienTra( loai,  soKm,  thoiGianCho );
        System.out.print("Kết quả là:" + tienTra  );
        inChiTiet (loai, soKm, thoiGianCho);
	}

	public static int nhapSoKm(Scanner scan) {
		int soKm;
		System.out.print("Vui lòng nhập vào số Km:");
		soKm = Integer.parseInt(scan.nextLine());
		return soKm;
	}

	public static float nhapThoiGianCho(Scanner scan) {
		float thoiGianCho;
		System.out.print("Vui lòng nhập vào thời gian chờ:");
		thoiGianCho = Float.parseFloat(scan.nextLine());
		return thoiGianCho;
	}

	public static int chonGrab(Scanner scan) {
		int loai;
		System.out.println("Vui lòng chọn loại grab:");
		System.out.println("1: Grabcar.");
		System.out.println("2: Grabsuv.");
		System.out.println("3: Grabblack.");
		loai = Integer.parseInt(scan.nextLine());
		return loai;

	}

	public static float tinhTien1km(int loai) {
		float tien = 0;
		if (loai == 1) {
			tien = GRAB_CAR_1KM;
		} else if (loai == 2) {
			tien = GRAB_SUV_1KM;
		} else {
			tien = GRAB_BLACK_1KM;
		}
		return tien;
	}

	public static float tinhTien1to19(int loai, float soKm) {
		float tien = 0;
		if (loai == 1) {
			tien = GRAB_CAR_1KM + (soKm - 1) * GRAB_CAR_1TO19;
		} else if (loai == 2) {
			tien = GRAB_SUV_1KM + (soKm - 1) * GRAB_SUV_1TO19;
		} else {
			tien = GRAB_BLACK_1KM + (soKm - 1) * GRAB_BLACK_1TO19;
		}
		return tien;
	}

	public static float tinhTienTren19Km(int loai, float soKm) {
		float tien = 0;
		if (loai == 1) {
			tien = GRAB_CAR_1KM + 18 * GRAB_CAR_1TO19 + (soKm - 19) * GRAB_CAR_OVER19;
		} else if (loai == 2) {
			tien = GRAB_SUV_1KM + 18 * GRAB_CAR_1TO19 + (soKm - 19) * GRAB_SUV_OVER19;
		} else {
			tien = GRAB_BLACK_1KM + 18 * GRAB_CAR_1TO19 + (soKm - 19) * GRAB_BLACK_OVER19;
			;
		}
		return tien;
	}

	public static float tinhTienCho(int loai, float thoiGianCho) {
		float tien = 0;
		if (thoiGianCho >= 3) {
			int soLanTinh = Math.round(thoiGianCho * (1.0f) / 3);
			if (loai == 1) {
				tien = soLanTinh * GRAB_CAR_WAIT;
			} else if (loai == 2) {
				tien = soLanTinh * GRAB_SUV_WAIT;
			} else {
				tien = soLanTinh * GRAB_BLACK_WAIT;
			}
		}
		return tien;
	}

	public static float tinhTienTra(int loai, float soKm, float thoiGianCho )
	{
		float tienTra = 0;
		if (soKm <=1)
		{
			tienTra = tinhTien1km( loai) + tinhTienCho ( loai,  thoiGianCho);
		}
		else if (soKm >1 && soKm <19)
		{
			tienTra =tinhTien1to19 ( loai,  soKm) + tinhTienCho ( loai,  thoiGianCho);
		}
		else 
		{
			tienTra =tinhTienCho ( loai,  thoiGianCho) + tinhTienTren19Km( loai,  soKm);
		}
		return tienTra;
	}
	public static void inDongKm1 (int loai, float soKm)
	{
		int donGia;
		if (loai == 1)
		{
			donGia = GRAB_CAR_1KM;
		}
		else if (loai ==2)
		{
			donGia = GRAB_SUV_1KM;
		}
		else 
		{
			donGia = GRAB_BLACK_1KM;
		}
		if (soKm < 1)
		{
			System.out.println("KM ĐẦU TIÊN \t\t"+ soKm + "\t\t"+ donGia +"\t\t"+ donGia);
		}
		else 
		{
			System.out.println("KM ĐẦU TIÊN \t\t"+ 1 + "\t\t"+ donGia +"\t\t\t"+ donGia);
		}
	}
	public static void inDongKm1to19 (int loai, float soKm )
	{
		int donGia;
		if (loai ==1)
		{
			donGia = GRAB_CAR_1TO19;
		}
		else if (loai == 2)
		{
			donGia = GRAB_SUV_1TO19;
		}
		else 
		{
			donGia = GRAB_BLACK_1TO19;
		}
		inDongKm1 ( loai,  soKm);
		if (soKm < 19)
		{
			System.out.println("Từ 2 đến " + (soKm - 1) + "\t\t" + (soKm - 1) + "\t\t" + donGia + "\t\t\t" + donGia * (soKm - 1));
		}
		else 
		{
			System.out.println("Từ 2 đến " + 18 + "\t\t" + 18 + "\t\t" + donGia + "\t\t\t" + donGia * 18);
		}
	}
	public static void inDongTren19(int loai, float soKm)
	{
		int donGia;
		if (loai==1)
		{
			donGia = GRAB_CAR_OVER19;
		}
		else if (loai==2)
		{
			donGia = GRAB_SUV_OVER19;
		}
		else 
		{
			donGia = GRAB_BLACK_OVER19;
		}
		inDongKm1to19 (loai, soKm);
		System.out.println("Từ 19 đến " + soKm + "\t\t" + (soKm-19) + "\t\t" + donGia + "\t\t\t" + donGia * (soKm -19));
	}
	public static void inThoiGianCho (int loai, float thoiGianCho )
	{
		int donGia;
		if (loai ==1)
		{
		 donGia = GRAB_CAR_WAIT;
		}
		else if (loai ==2)
		{
			donGia = GRAB_SUV_WAIT;
		}
		else 
		{
			donGia =GRAB_BLACK_WAIT;
		}
		float tienCho = tinhTienCho( loai,  thoiGianCho);
		System.out.println("Thời gian chờ \t\t " + thoiGianCho + "\t\t" + donGia + "\t\t\t" + tienCho);
		
	}
	public static void inChiTiet (int loai, float soKm, float thoiGianCho)
	{
		System.out.println("************************************ CHI TIẾT HÓA ĐƠN ***********************************");
		System.out.println("CHI TIẾT \t\t SỬ DỤNG \t ĐƠN GIÁ (1000đ)\t THÀNH TIỀN (1000Đ)");
		if (soKm <=1)
		{
			inDongKm1(loai, soKm);
		}
		else if (soKm >1 && soKm <19)
		{
			inDongKm1to19(loai, soKm);
		}
		else
		{
			inDongTren19 (loai, soKm);
		}
		inThoiGianCho (loai, thoiGianCho);
		float tongTien = tinhTienTra( loai,  soKm,  thoiGianCho );
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t\t\t TỔNG TIỀN" + tongTien);
	}
	
}
