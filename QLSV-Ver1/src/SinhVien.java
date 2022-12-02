import java.util.Scanner;

/*
 * Mục đích: Quản Lý Các Nghiệp vụ liên quan đến Sinh viên
 * Người tạo: Trịnh Hoài Thanh
 * Ngày tạo: 24/12/2021
 * Verion: 1.0
 */
public class SinhVien {
	// 1.Thuộc tính
	private String tenSV;
	private int maSV;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTB;
	private String xepLoai;

	// 2. Get,Set methods

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	// 3. Constructor method
	public SinhVien() {

	}
	// Cách 1
	/*
	 * public SinhVien(String ten, int ma ,float toan,float ly,float hoa) {
	 * this.tenSV = ten; this.maSV = ma; this.diemToan = toan; this.diemLy = ly;
	 * this.diemHoa = hoa; }
	 */

	public SinhVien(String tenSV, int maSV, float diemToan, float diemLy, float diemHoa) {
		super();
		this.tenSV = tenSV;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	// 4. input, output method
	public void nhap(Scanner scan) {
		System.out.print("Nhập tên: ");
		this.tenSV = scan.nextLine();
		System.out.print("Nhập mã sinh viên: ");
		this.maSV = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập điểm toán: ");
		this.diemToan = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập điểm lý: ");
		this.diemLy = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập điểm hóa: ");
		this.diemHoa = Float.parseFloat(scan.nextLine());

	}
	public void xuat()
	{
		System.out.println("SinhVien - Ma "+ this.maSV+ "\t Tên: "+ this.tenSV + "\t Toán: "+ this.diemToan+
				"\t Lý: "+this.diemLy+"\t Hoá: "+this.diemHoa+ "\t Điểm TB: "+ this.diemTB+"\t Xếp loại: "+ this.xepLoai);
	}

	// 5. Business method
	public void tinhDTB()
	{
		this.diemTB = (this.diemToan+this.diemLy+this.diemHoa)/3; 
	}
	public void xepLoai()
	{
		if (this.diemTB>=9)
		{
			this.xepLoai = "Xuất sắc";
		}
		else if (this.diemTB>=8)
		{
			this.xepLoai = "Giỏi";
		}
		else if (this.diemTB>=7)
		{
			this.xepLoai = "Khá";
		}
		else if (this.diemTB>=6)
		{
			this.xepLoai = "TB- Khá";
		}
		else if (this.diemTB>=5)
		{
			this.xepLoai  = "TB";
		}
		else
		{
			this.xepLoai = "Yếu";
		}
	}
	private String formatNumCell(Number num)
	{
		String paddLeft = "%5s";
		String paddRight = "%-8s";
		return String.format(paddLeft, " ")+String.format(paddRight, num)+"|";
	}
	private String formatTextCell(String text)
	{
		String paddleft = "%-15s";//Âm là bên trái
		return String.format(paddleft, " "+text );
	}
	public void xuatRowFormat()
	{
		String text;
		text = formatNumCell(this.maSV);
		text += formatTextCell(this.tenSV) + "|";
		text += formatNumCell(this.diemToan);
		text += formatNumCell(this.diemLy);
		text += formatNumCell(this.diemHoa);
		double dtb = Math.round(this.diemTB*100.0)/100.0;//làm tròn đến hai chữ số thập phân
		text += formatNumCell(dtb);
		text += formatTextCell(this.xepLoai)+"||";
		System.out.println(text);
	}
	
}
