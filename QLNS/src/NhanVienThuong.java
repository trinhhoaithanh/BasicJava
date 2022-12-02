
public class NhanVienThuong extends NhanSu {

	final int LUONG_NGAY=100;
	//1.Attribute
	private TruongPhong truongPhong;
	//2. get set
	
	public TruongPhong getTruongPhong() {
		return truongPhong;
	}

	public void setTruongPhong(TruongPhong truongPhong) {
		this.truongPhong = truongPhong;
	}

	//3. constructor
	public NhanVienThuong() {
		// TODO Auto-generated constructor stub
		this.truongPhong = null;//Chưa được phân bổ
	}
	public NhanVienThuong(String hoTen, String maSo, String soDienThoai, float soNgayLamViec) {
		super(hoTen, maSo, soDienThoai, soNgayLamViec);
		// TODO Auto-generated constructor stub
	}
	//4. input output 
	@Override
	public void xuat()
	{	
		super.xuat();
		if (this.truongPhong!=null)
	{
		System.out.println("\t Lương: "+this.luong+"\t Mã TP: "+this.truongPhong.getMaSo()+"\t Tên: "+this.truongPhong.getHoTen());
	}
	else {
		System.out.println("\t Lương: "+this.luong+"Chưa phân bổ");
	}
	}
	//5. Business
	@Override
	public void tinhLuong()
	{
		this.luong = this.soNgayLamViec*LUONG_NGAY;
	}

}
