import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Vui lòng nhập tên sinh viên");
		String ten = scan.nextLine();
		System.out.print("Vui lòng nhập email ");
		String email = scan.nextLine();
		System.out.print("Vui lòng nhập điểm toán: ");
		float toan = Float.parseFloat(scan.nextLine());
		System.out.print("Vui lòng nhập điểm lý: ");
		float ly = Float.parseFloat(scan.nextLine());
		System.out.print("Vui lòng nhập điểm hóa: ");
		float hoa = Float.parseFloat(scan.nextLine());
		SinhVien sv2 = new SinhVien (ten,email);
		sv2.setDiemToan(toan);
		sv2.setDiemLy(ly);
		sv2.setDiemHoa(hoa);
		sv2.tinhDiemTB();
		System.out.print("Tên "+sv2.getHoTen()+"- Email: "+ sv2.getEmail()+ "-điểm tb: "+sv2.getDiemTB());
		
	}

}
