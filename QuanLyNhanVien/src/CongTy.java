import java.util.ArrayList;
import java.util.Scanner;

public class CongTy {
	//1.Attributes
	private DanhSachNhanVien dsnvCongTy;
	//2.Get,set methods
	
	public DanhSachNhanVien getDsnvCongTy() {
		return dsnvCongTy;
	}

	public void setDsnvCongTy(DanhSachNhanVien dsnvCongTy) {
		this.dsnvCongTy = dsnvCongTy;
	}

	//3.Constructor methods
	public CongTy() {
		this.dsnvCongTy = new DanhSachNhanVien();
	}
	//4.Input,output methods
	public void nhap(Scanner scan)
	{
		this.dsnvCongTy.nhap(scan);
	}
	public void themNhanVien (NhanVien nv)
	{
		this.dsnvCongTy.themNhanVien(nv);
	}
	public void xuat()
	{
		this.dsnvCongTy.xuat();
	}
	//5.Business methods
	public void tinhLuongNhanVien()
	{
		this.dsnvCongTy.tinhLuongNhanVien();
	}
	public ArrayList <NhanVien> timNVCoLuongCaoNhat()
	{
		return this.dsnvCongTy.timNVCoLuongCaoNhat();
		
	}
	public void xuatHelper(ArrayList<NhanVien> list) {
		for (NhanVien nv : list) {
			nv.xuat();
		}
	}
}
