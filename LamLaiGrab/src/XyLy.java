import java.util.Scanner;

public class XyLy {

	public XyLy() {
		// TODO Auto-generated constructor stub
	}
	public final static int GRAB_CAR_KM1 = 8000;
	public final static int GRAB_SUV_KM1 = 9000;
	public final static int GRAB_BLACK_KM1 = 10000;
	public final static int GRAB_CAR_KM1_TO_19 = 7500;
	public final static int GRAB_SUV_KM1_TO_19 = 8500;
	public final static int GRAB_BLACK_KM1_TO_19 = 9500;
	public final static int GRAB_CAR_OVER_19 = 7000;
	public final static int GRAB_SUV_OVER_19 = 8000;
	public final static int GRAB_BLACK_OVER_19 = 9000;
	public final static int GRAB_CAR_WAIT = 2000;
	public final static int GRAB_SUV_WAIT = 3000;
	public final static int GRAB_BLACK_WAIT = 3500;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int loai = chonGrab(scan);
        int soKm = nhapSoKm (scan);
        float thoiGianCho = nhapThoiGianCho (scan);
        float tienTra = tienTinhTra( loai,  soKm,  thoiGianCho );
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
	public static int chonGrab (Scanner scan)
	{	int loai;
		System.out.println("Vui lòng chọn loại Grab:");
		System.out.println("1. GrabCar");
		System.out.println("2. GrabSuv");
		System.out.println("3. GrabBlack");
		loai = Integer.parseInt (scan.nextLine());
		return loai;
	}
	public static float tinhTien1Km(int loai)
	{
		float tien = 0;
		if (loai == 1)
		{
			tien = GRAB_CAR_KM1;
		}
		else if ( loai == 2)
		{
			tien = GRAB_SUV_KM1;
		}
		else 
		{
			tien = GRAB_BLACK_KM1;
		}
		return tien;
	}
	public static float tinhTienKm1To19(int loai, float soKm)
	{	float tien=0;
		if (loai ==1)
		{
			tien = GRAB_CAR_KM1 + (soKm -1)*GRAB_CAR_KM1_TO_19;
		}
		else if (loai == 2)
		{
			tien = GRAB_SUV_KM1 + (soKm -1)*GRAB_SUV_KM1_TO_19;
		}
		else 
		{
			tien = GRAB_BLACK_KM1 + (soKm -1)*GRAB_BLACK_KM1_TO_19;
		}
		return tien;
	}
	public static float tinhTienOver19(int loai, float soKm)
	{
		float tien=0;
		if (loai == 1)
		{
			tien = GRAB_CAR_KM1 + 18*GRAB_CAR_KM1_TO_19 + (soKm - 19)*GRAB_CAR_OVER_19;
		}
		else if (loai ==2 )
		{
			tien = GRAB_SUV_KM1 + 18*GRAB_SUV_KM1_TO_19 + (soKm - 19)*GRAB_SUV_OVER_19;
		}
		else 
		{
			tien = GRAB_BLACK_KM1 + 18*GRAB_BLACK_KM1_TO_19 + (soKm - 19)*GRAB_BLACK_OVER_19;
		}
		return tien;	
	}
	public static float tinhTienCho (int loai, float thoiGianCho)
	{
		float tien=0;
		if (thoiGianCho >=3)
		{
			int soLanCho = Math.round((thoiGianCho*(1.0f))/3);
			if (loai == 1 )
			{
				tien = soLanCho*GRAB_CAR_WAIT;
			}
			else if (loai == 2)
			{
				tien = soLanCho*GRAB_SUV_WAIT;
			}
			else 
			{
				tien = soLanCho*GRAB_BLACK_WAIT;
			}
		}
		return tien;
	}
	public static float tienTinhTra (int loai,float thoiGianCho, float soKm)
	{
		float tienTra = 0;
		if (soKm <=1)
		{
			tienTra = tinhTien1Km (loai)+ tinhTienCho(loai, thoiGianCho);
		}
		else if (soKm > 1 && soKm <19)
		{
			tienTra = tinhTienKm1To19 (loai, soKm)+tinhTienCho(loai, thoiGianCho);
		}
		else 
		{
			tienTra = tinhTienOver19 (loai, soKm)+ tinhTienCho(loai, thoiGianCho);
		}
		return tienTra;
	}
	public static void inDongKm1 (int loai, float soKm)
	{
		int donGia;
		if (loai ==1)
		{
			donGia = GRAB_CAR_KM1;
		}
		else if (loai ==2)
		{
			donGia = GRAB_SUV_KM1;
		}
		else 
		{
			donGia = GRAB_BLACK_KM1;
		}
		if (soKm <1)
			{
			System.out.println ("KM đầu tiên "+ "\t" + soKm +"\t"+ donGia + "\t" + donGia );
			}
		else 
		{
			System.out.println ("KM đầu tiên "+ "\t" + 1 +"\t"+ donGia + "\t" + donGia);
		}		
	}
	public static void inDongKm1to19(int loai, float soKm)
	{
		int donGia;
		if (loai ==1 )
		{
				donGia = GRAB_CAR_KM1_TO_19;
		}
			else if (loai ==2)
			{
				donGia = GRAB_SUV_KM1_TO_19;
			}
			else 
			{
				donGia = GRAB_BLACK_KM1_TO_19;
			}
		inDongKm1 (loai,soKm);
		if (soKm <19)
			{
			System.out.println("Từ 2 đến "+ (soKm -1)+"\t"+(soKm -1)+ "\t"+ donGia + donGia*(soKm -1));
			}
		else 
		{
			System.out.println("Từ 2 đến "+ 18 +"\t"+18+ "\t"+ donGia + donGia*18);
		}
	}
	public static void inDongTren19(int loai, float soKm)
	{	int donGia;
		if (loai==1)
		{
			donGia = GRAB_CAR_OVER_19;
		}
		else if (loai ==2 )
		{
			donGia = GRAB_SUV_OVER_19;
		}
		else 
		{
			donGia = GRAB_BLACK_OVER_19;
		}
		inDongKm1to19 (loai , soKm);
		System.out.print("Từ 19 đến "+"\t " + (soKm-19) + "\t"+ donGia + "\t" + donGia * (soKm -19)); 
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
		float tongTien = tienTinhTra( loai,  soKm,  thoiGianCho );
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t\t\t TỔNG TIỀN" + tongTien);
	}
	
}
