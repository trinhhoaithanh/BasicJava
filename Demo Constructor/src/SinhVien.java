
public class SinhVien {
	public String hoTen;
	public String email;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTB;
	//Get, set, methods
	public String getHoTen () {
		return this.hoTen;
	}
	public void setHoTen(String ten) {
		this.hoTen = ten;
	}
	public String getEmail()
	{
		return this.email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public float getDiemToan()
	{
		return this.diemToan;
	}
	public void setDiemToan(float toan)
	{
		this.diemToan = toan;
	}
	public float getDiemLy()
	{
		return this.diemLy;
	}
	public void setDiemLy(float ly)
	{
		this.diemLy = ly;
	}
	public float getDiemHoa()
	{
		return this.diemHoa;
	}
	public void setDiemHoa(float hoa)
	{
		this.diemHoa = hoa;
	}
	public float getDiemTB()
	{
		return this.diemTB;
	}
	//Phương thức khởi tạo mặc định không tham số
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}
	//Phương thức khởi tạo sử dụng 2 tham số để truyền dữ liệu cho thuộc tính
	public SinhVien (String hoTen, String email)
	{
		this.hoTen = hoTen;
		this.email = email;
	}
	public void tinhDiemTB ()
	{
		this.diemTB = (this.diemToan+this.diemLy+this.diemHoa)/3;
	}
}
