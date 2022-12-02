package baimoi;

import java.util.Scanner;

public class hay {

	public hay() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double GIOI = 8.5;
		final double KHA = 6.5;
		final double TRUNG_BINH = 5;
	    final int SO_CHIA = 3;
		String hoTen;
		float diemToan;
		float diemLy;
	    float diemHoa;
	    float diemTrungBinh;
	    String xepLoai;
	    Scanner scan = new Scanner (System.in);
	    System.out.print("Nhập họ tên: ");
	    hoTen = scan.nextLine();
	    System.out.print("Nhập điểm Toán: ");
	    diemToan = Float.parseFloat(scan.nextLine());
	    System.out.print("Nhập điểm Lý: ");
	    diemLy = Float.parseFloat(scan.nextLine());
	    System.out.print("Nhập điểm Hoá: ");
	    diemHoa = Float.parseFloat(scan.nextLine());
	    diemTrungBinh = (diemToan + diemLy + diemHoa)/SO_CHIA;
	    if (diemTrungBinh >= GIOI)
	    {
	    	xepLoai = "Giỏi";
	    }
	    else if ((diemTrungBinh >=KHA)&&(diemTrungBinh < GIOI))
	    {
	    	xepLoai = "Khá";
	    }
	    else if ((diemTrungBinh >=TRUNG_BINH)&&(diemTrungBinh < KHA))
	    {
	       xepLoai = "Trung Bình";
	    }
	    else 
	    {
	       xepLoai = "Yếu";
	    }
	    System.out.print("Họ Tên: "+ hoTen +"\t Điểm trung bình: "+diemTrungBinh +"\t Xếp Loại: "+ xepLoai);
	}
}
