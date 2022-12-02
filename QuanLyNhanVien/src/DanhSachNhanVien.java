import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachNhanVien {
	// 1.Attributes
	private  ArrayList<NhanVien> listNV;
	// 2.Get, set methods
	
	public ArrayList<NhanVien> getListNV() {
		return listNV;
	}

	public void setListNV(ArrayList<NhanVien> listNV) {
		this.listNV = listNV;
	}

	// 3.Constructor methods
	public DanhSachNhanVien() {
		thietLapDefault();
	}
	public void thietLapDefault()
	{
		this.listNV = new ArrayList <NhanVien>();
	}
	// 4.Input, output methods
	public  void nhap(Scanner scan)
	{
			NhanVien nv = new NhanVien();
			nv.nhap(scan);
	
	}
	public void themNhanVien (NhanVien nv)
	{
		this.listNV.add(nv);
	}
	public  void xuat()
	{
		for (NhanVien nv:listNV)
		{
			nv.xuat();
		}
	}
	// 5. Business methods
	public void tinhLuongNhanVien()
	{
		for (NhanVien nv:listNV)
		{
			nv.tinhLuongNhanVien();
		}
	}
	public ArrayList <NhanVien> timNVCoLuongCaoNhat()
	{
		ArrayList <NhanVien> listMax = new ArrayList<NhanVien>();
		if (this.listNV.size() > 0)
		{
			NhanVien nvMax = this.listNV.get(0);
			int viTriMaxDauTien = 0;
			for (int i=0;i<this.listNV.size();i++)
			{
				NhanVien nvCurrent = this.listNV.get(i);
				if (nvCurrent.getLuongNhanVien()>nvMax.getLuongNhanVien())
				{
					nvMax = nvCurrent;
					viTriMaxDauTien = i;
				}
			}
			listMax.add(nvMax);
			for (int i = viTriMaxDauTien+1;i<this.listNV.size();i++)
			{
				NhanVien nvCurrent = this.listNV.get(i);
				if (nvCurrent.getLuongNhanVien()==nvMax.getLuongNhanVien())
				{
					listMax.add(nvCurrent);
				}
			}
		}
		return listMax;
	}

}
