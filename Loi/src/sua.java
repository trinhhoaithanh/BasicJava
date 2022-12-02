
public class sua {

	public sua() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.util.Scanner;

		public class XuLy {

			public XuLy() {
				// TODO Auto-generated constructor stub
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
			    diemTrungBinh = (diemToan + diemLy + diemHoa)/3;
			    if (diemTrungBinh >= 8.5)
			    {
			    	xepLoai = "Giỏi";
			    }
			    else if ((diemTrungBinh >=6.5)&&(diemTrungBinh < 8.5))
			    {
			    	xepLoai = "Khá";
			    }
			    else if ((diemTrungBinh >=5)&&(diemTrungBinh < 6.5))
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


	}

}
