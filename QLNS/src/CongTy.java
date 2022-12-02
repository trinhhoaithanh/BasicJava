import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CongTy {
	// 1,Attribute
	private String tenCongTy;
	private String maSoThue;
	private float doanhThuThang;
	private DanhSachNhanSu objListNhanSu;
	// 2. get set

	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public String getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	public float getDoanhThuThang() {
		return doanhThuThang;
	}

	public void setDoanhThuThang(float doanhThuThang) {
		this.doanhThuThang = doanhThuThang;
	}

	public DanhSachNhanSu getObjListNhanSu() {
		return objListNhanSu;
	}

	public void setObjListNhanSu(DanhSachNhanSu objListNhanSu) {
		this.objListNhanSu = objListNhanSu;
	}

	// 3. constructor
	public CongTy() {
		// TODO Auto-generated constructor stub
		this.objListNhanSu = new DanhSachNhanSu();
	}

	// 4. Input output
	public void nhap(Scanner scan) {
		System.out.println("*****Nhập thông tin công ty*****");
		System.out.print("Tên công ty");
		this.tenCongTy = scan.nextLine();
		System.out.print("Mã số thuế công ty");
		this.maSoThue = scan.nextLine();
		System.out.print("Doanh thu:");
		this.doanhThuThang = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println("*******Thông tin công ty*******");
		System.out.println("Tên công ty: " + this.tenCongTy);
		System.out.println("Mã số thuế: " + this.maSoThue);
		System.out.println("Doanh thu tháng: " + this.doanhThuThang);
		System.out.println("************************************");
		this.objListNhanSu.xuat();
	}

	// 5. Business
	public void tinhLuong() {
		this.objListNhanSu.tinhLuong();
	}

	public void dummyDataCty() {
		this.tenCongTy = "CyberSoft-CyberLearn";
		this.maSoThue = "01292332";
		this.doanhThuThang = 435334f;
	}

	public void dummyDataNhanSu() {
		NhanSu ns = new NhanSu();
		ns = new TruongPhong("TP Bổ sung 1", "13", "098233", 24);
		objListNhanSu.themNhanSu(ns);
		ns = new TruongPhong("TP Bổ sung 2", "14", "091833", 21);
		objListNhanSu.themNhanSu(ns);
		ns = new NhanVienThuong("Lan", "1", "09832", 20);
		objListNhanSu.themNhanSu(ns);
		ns = new NhanVienThuong("Hưng", "2", "098232", 23);
		objListNhanSu.themNhanSu(ns);
		ns = new NhanVienThuong("Việt", "3", "098132", 31);
		objListNhanSu.themNhanSu(ns);
		ns = new NhanVienThuong("An", "4", "091832", 25);
		objListNhanSu.themNhanSu(ns);
		ns = new NhanVienThuong("Tuyết", "5", "098432", 23);
		objListNhanSu.themNhanSu(ns);
		ns = new NhanVienThuong("Mỹ", "6", "092832", 31);
		objListNhanSu.themNhanSu(ns);

		ns = new TruongPhong("TP Mai", "8", "098233", 24);
		objListNhanSu.themNhanSu(ns);
		ns = new TruongPhong("TP Luân", "9", "091833", 21);
		objListNhanSu.themNhanSu(ns);
		ns = new TruongPhong("TP Kiệt", "10", "091833", 23);
		objListNhanSu.themNhanSu(ns);

		ns = new GiamDoc("GD Tiên", "11", "0981", 19, 80);
		objListNhanSu.themNhanSu(ns);
		ns = new GiamDoc("GD Huệ", "12", "09181", 21, 20);
		objListNhanSu.themNhanSu(ns);
	}

	/*
	 * Phân bổ nhân viên về phòng ban hay chỉ đỉnh trưởng phòng Bước 1: Duyệt danh
	 * sách và kiểm tra nếu là NhanVienThuong Bước 2: Show danh sách Trưởng Phòng
	 * (Mã và tên) Bước 3: Có muốn phân bổ hay không, chọn Y đế phân bổ chọn N để đi
	 * tiếp Bước 4: Nếu N đi tiếp đế nhân viên tiếp theo Bước 5: Nếu Y, yêu cầu nhập
	 * mã trưởng phòng đã liệt kê ở bước 2 Bước 6: Kiểm tra mã nhập bước 5 có nằm
	 * trong danh sách mã trưởng phòng nằm trong bước 2 hay không Bước 7: Nếu có:
	 * Lấy trưởng phòng với mã đã chọn ở bước 5 -> Lấy ra obj Trưởng phòng Bước 8:
	 * Gán trưởng phòng bước 7 cho Trưởng phòng của Nhân Viên đang duyệt Bước 9: Nếu
	 * không, lặp lại bước 5 Bước 10: Tăng số lượng nhân viên dưới quyền cho trưởng
	 * phòng đó
	 */
	public void phanBoNhanVienThuong() {
		Scanner scan = new Scanner(System.in);
		// Bước 1
		for (NhanSu ns : this.objListNhanSu.getListNhanSu()) {
			if (ns instanceof NhanVienThuong) {// Bước 2
				System.out.println("Đang phân bổ cho nhân viên");
				ns.xuatMaVaTen();
				phanBoChoMotNhanSu(scan, ns);
			}
		}
	}

	private void phanBoChoMotNhanSu(Scanner scan, NhanSu ns) {
		// start phân bổ cho một nhân sự
		showMaVaTenTPhong();

		boolean flag = true;
		do {
			// Buoc 3
			System.out.println("Chọn 1 để phân bổ, chọn 2 để đi tiếp");
			int chon = Integer.parseInt(scan.nextLine());
			if (chon == 1 || chon == 2) {
				if (chon == 1) {

					TruongPhong tp = chonTruongPhong(scan);
					// Bước 7 đã có trưởng phòng lưu ở tp
					// Bước 8
					((NhanVienThuong) ns).setTruongPhong(tp);
					tp.tangNhanVien();// Bước 10
				}
				flag = false;// buoc 4
			} else {
				System.out.println("Chỉ được chọn 1 hoặc 2");
				flag = true;
			}
		} while (flag);
		// end phân bổ cho một nhân sự
	}

	public TruongPhong chonTruongPhong(Scanner scan) {
		TruongPhong tp = null;
		do {

			System.out.println("Vui lòng chọn mã đã liệt kê trên");
			String chonMa = scan.nextLine();
			// Bước 6: kiểm tra mã có nằm tỏng ds hay không
			tp = timTruongPhongTheoMa(chonMa);
			chonMa = scan.nextLine();
			System.out.println("Vui lòng chọn mã đã liệt kê trên");
		} while (tp == null);
		return tp;
	}

	private void showMaVaTenTPhong() {
		System.out.println("*******Danh sách trưởng phòng*******");
		ArrayList<TruongPhong> list = layDSTruongPhong();
		for (TruongPhong tp : list) {

			tp.xuatMaVaTen();
		}
		System.out.println("=====================================");
	}

	public void lietKeDSTruongPhong() {
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong)

			{
				ns.xuatMaVaTen();
			}
		}
	}

	public TruongPhong timTruongPhongTheoMa(String ma) {
		TruongPhong tPhong = null;// Chưa tìm thấy
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				if (ns.getMaSo().compareTo(ma) == 0) {
					tPhong = (TruongPhong) ns;
				}
			}
		}
		return tPhong;
	}

	public ArrayList<TruongPhong> layDSTruongPhong() {
		ArrayList<TruongPhong> list = new ArrayList<TruongPhong>();
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				list.add((TruongPhong) ns);
			}
		}
		return list;
	}

	public void themNhanSu(Scanner scan) {
		System.out.println("*******Chức Năng Thêm Nhân Sự****** ");
		ArrayList<NhanVienThuong> list = this.objListNhanSu.nhap(scan);
		for (NhanVienThuong nvt : list) {

			phanBoChoMotNhanSu(scan, nvt);
		}

	}

	/*
	 * Các phương thức hỗ trợ xóa nhân sự
	 */
	public boolean xoaNhanSu(Scanner scan) {
		boolean deleted = false;// Chưa xóa
		System.out.println("********Xóa nhân sự*******");
		System.out.println("Vui lòng nhập mã nhân sự cần xóa");
		String maXoa = scan.nextLine();
		NhanSu nhanSu = timNhanSuTheoMa(maXoa);
		if (nhanSu != null)// Tìm thấy và xử lý
		{
			// Nếu trưởng phòng
			if (nhanSu instanceof TruongPhong)// Nếu trưởng phòng
			{
				deleted = xoaTruongPhong((TruongPhong) nhanSu);
			} else if (nhanSu instanceof NhanVienThuong)// Nếu nhân viên thừơng
			{
				deleted = xoaNVThuong((NhanVienThuong) (nhanSu));
			} else {
				// Nếu giám đốc
				this.objListNhanSu.getListNhanSu().remove(nhanSu);
			}
			// Nếu nhân viên thường
			// Nếu giám đốc
		} else {
			System.out.println("Mã nhân sự bạn vừa nhập không có trong danh sách");
		}
		return deleted;
	}
	public boolean xoaNVThuong(NhanVienThuong nvt)
	{
		boolean deleted=false;
		TruongPhong tp = nvt.getTruongPhong();
		if (tp!=null)
		{
			tp.giamNhanVien();
		}
		this.objListNhanSu.getListNhanSu().remove(nvt);
		deleted =true;
		return deleted;
	}
	public boolean xoaTruongPhong(TruongPhong tp) {
		boolean deleted = false;
		for (NhanSu ns : this.objListNhanSu.getListNhanSu()) {
			if (ns instanceof NhanVienThuong) {
				TruongPhong tPhongNVThuong = ((NhanVienThuong) ns).getTruongPhong();
				if (tPhongNVThuong != null) {
					if (tp.getMaSo().equalsIgnoreCase(tPhongNVThuong.getMaSo())) {
						((NhanVienThuong) ns).setTruongPhong(null);
						deleted = true;
					}
				}
			}
		}
		this.objListNhanSu.getListNhanSu().remove(tp);
	
		return deleted;
	}

	public NhanSu timNhanSuTheoMa(String ma) {
		NhanSu nhanSu = null;// Chưa tìm thấy
		for (NhanSu ns : this.objListNhanSu.getListNhanSu()) {
			if (ns.getMaSo().equalsIgnoreCase(ma)) {
				nhanSu = ns;// Tìm thấy ròi
				break;// Vì mỗi nhân sự chỉ có một mã số
			}
		}
		return nhanSu;
	}
	public ArrayList <NhanVienThuong> lietKeDSNhanVienThuongLuongCaoNhat()
	{
		ArrayList <NhanVienThuong> list = new ArrayList<NhanVienThuong>();
		//1. Tìm NhanVienThuong đầu tiên trong ds nhân sự 
		NhanVienThuong nvt =null;//Chưa tìm thấy
		int indexMax = 0;
		for (NhanSu ns:this.objListNhanSu.getListNhanSu())
		{	indexMax++;
			if (ns instanceof NhanVienThuong)
			{
				nvt=(NhanVienThuong)ns;
				break;//Cần bạn đầu tiên thoi
			}
			
		}
		//2. Nếu có, thì cho NVT vừa tìm trong bước 1 là NVT có lương cao nhất
		if (nvt!=null)
		{
			
		
		//3. Duyệt danh sách từ vị trí vừa tìm ở bước 2 và tìm NVT có lương thật sự cao nhất
			for (int i = indexMax-1;i<objListNhanSu.getListNhanSu().size();i++)//indexMax-1 vì nó đã tăng lên rồi nên phải trừ xuống
			{
				
				NhanSu current = objListNhanSu.getListNhanSu().get(i);
				if (current instanceof NhanVienThuong)
				{
					if (current.getLuong()>nvt.getLuong())
					{
						nvt = (NhanVienThuong) current;
						indexMax++;
					}
				}
			}
		//4. Duyệt lại ds và so sánh lương của NVT đang duyệt với NVT max thật sự ở bước 3
			for (int i = indexMax-1;i<objListNhanSu.getListNhanSu().size();i++)
{
				NhanSu current = objListNhanSu.getListNhanSu().get(i);
				if (current instanceof NhanVienThuong)
				{
					if (current.getLuong()==nvt.getLuong())
					{
						list.add(nvt);
					}
				}
}
		}
		return list;
	}
	private void interChangeSort(ArrayList<NhanSu> _list)
	{
		int i;
		int j;
		for (i=0;i<_list.size()-1;i++)
		{
			for (j=i+1;j<_list.size();j++)
			{
				NhanSu personI = _list.get(i);
				NhanSu personJ = _list.get(j);
				if  (personJ.getHoTen().compareToIgnoreCase(personI.getHoTen())<0)
				{
					Collections.swap(_list,i,j);
				}
			}
		}
		
	}
	public void sortName()
	{
		interChangeSort(this.objListNhanSu.getListNhanSu());
	}
}
