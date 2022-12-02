import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// DanhSachSinhVien ds = new DanhSachSinhVien();
		TruongHoc truong = new TruongHoc();
		truong.nhap();
		doMenu(truong);
	}

	public static void inMenu() {
		System.out.println("Vui lòng chọn thực hiện:");
		System.out.println("1. Thêm sinh viên");
		System.out.println("2. Xuất danh sách sinh viên");
		System.out.println("3. Xuất danh sách sinh viên có ĐTB cao nhất");
		System.out.println("4. Liệt kê DSSV yếu");
		System.out.println("5. Tìm sinh viên theo tên");
		System.out.println("6. Tìm sinh viên theo mã");
		System.out.println("7. Xóa sinh viên theo mã");
		System.out.println("0. Thoát");
	}

	public static void doMenu(TruongHoc truong) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		do {
			inMenu();
			System.out.print("Mời chọn");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				SinhVien sv = new SinhVien();
				sv.nhap(scan);
				truong.themSinhVien(sv);
				break;
			case 2:
				truong.tinhDTB();
				truong.xepLoai();
				// truong.xuat();
				truong.xuatTheoFormat(truong.getDssvToanTruong().getListSV());
				break;
			case 3:
				ArrayList<SinhVien> list = truong.timSinhVienCoDTBCaoNhat();
				// truong.xuatHelper(list);
				truong.xuatTheoFormat(list);
				break;
			case 4:
				ArrayList<SinhVien> listYeu = truong.lietKeDSSVYeu();
				// truong.xuatHelper(listYeu);
				truong.xuatTheoFormat(listYeu);
				break;
			case 5:
				System.out.print("Vui lòng nhập tên sv cần tìm");
				String ten = scan.nextLine();
				ArrayList<SinhVien> listTen = truong.timSVTheoTen(ten);
				// truong.xuatHelper(listTen);
				truong.xuatTheoFormat(listTen);
				break;
			case 6:
				System.out.print("Vui lòng nhập mã sv cần tìm");
				int ma = Integer.parseInt(scan.nextLine());
				SinhVien svFound = truong.timSVTheoMa(ma);
				if (svFound != null) {
					svFound.xuat();
				} else {
					System.out.println("Không có sinh viên có mã là: " + ma);
				}
				break;
			case 7:
				System.out.print("Vui lòng nhập mã sinh viên cần xóa: ");
				int maXoa = Integer.parseInt(scan.nextLine());
				boolean deleted = truong.xoaSVTheoMa(maXoa);
				if (deleted) {
					System.out.print("Xóa thành công");
				} else {
					System.out.print("Chưa được xóa hoặc không có mã sv đó trong ds");
				}
				break;
			case 0:
				System.out.print("Bạn đã thoát danh sách");
				flag = false;
				break;
			}
		} while (flag);
	}
}
