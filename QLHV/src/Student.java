import java.util.Scanner;

/*
 * Mục đích: tạo lớp quản lý các student
 */
public class Student extends Person {
	//1. Attributes
	private float toan;
	private float ly;
	private float hoa;
	//2. get set 
	
	public float getToan() {
		return toan;
	}

	public void setToan(float toan) {
		this.toan = toan;
	}

	public float getLy() {
		return ly;
	}

	public void setLy(float ly) {
		this.ly = ly;
	}

	public float getHoa() {
		return hoa;
	}

	public void setHoa(float hoa) {
		this.hoa = hoa;
	}

	//3. constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String hoTen, String diaChi, String ma, String email, float toan, float ly, float hoa) {
		super(hoTen, diaChi, ma, email);
		// TODO Auto-generated constructor stub
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}
	//4.input output
	@Override
	public void nhap(Scanner scan)
	{
		super.nhap(scan);
		System.out.print("Nhập điểm toán:");
		this.toan = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập điểm lý:");
		this.ly = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập điểm hóa:");
		this.hoa = Integer.parseInt(scan.nextLine());
	}
	@Override
	public void xuat()
	{
		System.out.println("\t Điểm toán: "+this.toan+"\t Điểm lý: "+this.ly+"\t Điểm hóa: "+this.hoa);
	}
	//5. Business
	

}
