import java.util.ArrayList;

public abstract class NhanSu implements NhapXuat{
	//1.attribute
	protected String maNV;
	protected String tenNV;
	protected String namSinh;
	protected String email;
	protected String soDienThoai;
	protected String maPhongBan;
	protected DanhSachTask objDSTask;
	protected float luong;
	protected float soNgayLamViec;
	//2. get set 
	
	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMaPhongBan() {
		return maPhongBan;
	}

	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}

	public DanhSachTask getDsTask() {
		return objDSTask;
	}

	public void setDsTask(DanhSachTask objDSTask) {
		this.objDSTask = objDSTask;
	}

	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}
	

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	//3. constructor 
	//thiết lập giá trị mặc định
	private void init()
	{
		this.maPhongBan="-1";
		this.objDSTask = new DanhSachTask();
	}
	public NhanSu() {
		// TODO Auto-generated constructor stub
		init();
	}

	public NhanSu(String maNV, String tenNV, String namSinh, String email, String soDienThoai) {
		super();
		init();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.namSinh = namSinh;
		this.email = email;
		this.soDienThoai = soDienThoai;
		
	}

	public NhanSu(String maNV, String tenNV, String namSinh, String email, String soDienThoai, String maPhongBan,
			float soNgayLamViec) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.namSinh = namSinh;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.maPhongBan = maPhongBan;
		this.soNgayLamViec = soNgayLamViec;
	}

	
	
	//4. input out put
	public void xuat()
	{
		String temp = this.maPhongBan;
		if (this.maPhongBan.equalsIgnoreCase("-1"))
		{
			temp = "Chưa phân bổ";
		}
		System.out.println("Mã: " + this.maNV + "\tTên: " + this.tenNV + "\t Năm sinh: " + this.namSinh + " \tEmail: "
				+ this.email + "\t SĐT: " + this.soDienThoai + " \tMã phòng ban:" + temp + "\t Ngày làm: "
				+ this.soNgayLamViec + "\t Lương: " + this.luong);
	}
	//5. business
	public abstract void tinhLuong();

	

}
