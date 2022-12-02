import java.util.ArrayList;
import java.util.Scanner;

/*
 * Mục đích: tạo ra danh sách để quản lí nhiều sinh viên
 * Người tạo: Trịnh Hoài Thanh
 * Ngày Tạo 24/12/2021
 * Version: 1.0
 */
public class DanhSachSinhVien {
	//1. attributes/data member/ field
	private ArrayList <SinhVien> listSV;
	//2. get set method
	
	public ArrayList<SinhVien> getListSV() {
		return listSV;
	}

	public void setListSV(ArrayList<SinhVien> listSV) {
		this.listSV = listSV;
	}

	//3. Constructor method
	public DanhSachSinhVien() {
		thietLapDefault();
	}
	//Hàm này để khởi động các list và các giá trị mặc định cho lớp
	private void thietLapDefault()
	{
		this.listSV = new ArrayList <SinhVien>();
	}
	//4. Input output method 
	public void nhap(Scanner scan)
	{
		for (SinhVien sv:this.listSV)
		{
			sv.nhap(scan);
		}
	}
	public void themSinhVien (SinhVien sv)
	{
		this.listSV.add(sv);
	}
	public void xuat()
	{
		for (SinhVien sv:this.listSV)
		{
			sv.xuat();
		}
	}
	//5. Business method
	public void tinhDTB()
	{
		for (SinhVien sv: this.listSV)
		{
			sv.tinhDTB();
		}
	}
	public void xepLoai()
	{
		for (SinhVien sv:this.listSV)
		{
			sv.xepLoai();
		}
	}
	public ArrayList<SinhVien> timDSSVCoDTBCaoNhat()
	{
		ArrayList <SinhVien> list = new ArrayList <SinhVien>();
		if (this.listSV.size()>0) {
		SinhVien svMax = this.listSV.get(0);
		int viTriMaxDauTien=0;
		for (int i=0;i<this.listSV.size();i++)
		{
			SinhVien svCurrent = this.listSV.get(i);
			if (svCurrent.getDiemTB()>svMax.getDiemTB())
			{
				svMax=svCurrent;
				viTriMaxDauTien = i;
			}
		}
		//Thêm svMax vào list
		list.add(svMax);
		//Đã tìm thấy svMax
		for (int i = viTriMaxDauTien+1; i<this.listSV.size();i++)
		{	
			SinhVien svCurrent  = this.listSV.get(i);
			if (svCurrent.getDiemTB()==svMax.getDiemTB())
			{
				list.add(svCurrent);
			}
		}
		}
		return list;
	}
	public ArrayList <SinhVien> lietKeDSSVYeu()
	{
		ArrayList <SinhVien> listYeu = new ArrayList<SinhVien>();
		for (SinhVien sv:this.listSV)
		{
			if (sv.getDiemTB()<5)
			{
				listYeu.add(sv);
			}
		}
		return listYeu;
	}
	public ArrayList <SinhVien> timSVTheoTen(String ten)
	{
		ArrayList <SinhVien> list = new ArrayList <SinhVien>();
		for (SinhVien sv: this.listSV)
		{
			if (sv.getTenSV().equalsIgnoreCase(ten))
			{
				list.add(sv);
			}
		}
		return list;
	}
	public SinhVien timSVTheoMa(int ma)
	{
		SinhVien sv = null;//Chưa tìm thấy
		for (SinhVien sv1: this.listSV)
		{
			if (sv1.getMaSV()==ma)
			{
				sv=sv1;
				break;//Đã tìm thấy cần thoát khỏi vòng lập để đỡ tốn bộ nhớ
			}
		}
		return sv;
	}
	public boolean xoaSVTheoMa(int ma)
	{	boolean deleted = false;//chưa xóa
		for (SinhVien sv:this.listSV)
		{
			if(sv.getMaSV()==ma)
			{
				this.listSV.remove(sv);
				deleted = true;//xóa thành công
				break;
			}
		}
		return deleted;
	}
}
