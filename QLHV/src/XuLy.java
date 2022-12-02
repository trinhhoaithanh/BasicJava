import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		doMenu(scan);
	}

	public static void inMenu() {
		System.out.println("Chọn thực hiện");
		System.out.println("1. Thêm người vào");
		System.out.println("2. Xóa theo mã");
		System.out.println("3. Sắp xếp theo tên");
		System.out.println("4. Xuất danh sách");
		System.out.println("0. Thoát chương trình");
	}

	private static void doMenu(Scanner scan) {
		boolean flag = true;
		ListPerson objListPerson = new ListPerson();
		objListPerson.dummyData();
		do {
			inMenu();
			System.out.println("Mời chọn");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				objListPerson.nhap(scan);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				objListPerson.sortName();
				objListPerson.xuat();
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Nhập 0,1,2,3,4");
			}
		} while (flag);
	}
}
