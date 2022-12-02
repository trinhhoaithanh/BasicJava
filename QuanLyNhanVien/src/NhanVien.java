import java.util.ArrayList;
import java.util.Scanner;

/*
 * Mục đích: Quản Lý Các Nghiệp vụ liên quan đến Nhân viên
 * Người tạo: Trịnh Hoài Thanh
 * Ngày tạo: 3/1/2021
 * Verion: 1.0
 */
public class NhanVien {
	// 1. Atrributes
	private int maNV;
	private String tenNV;
	private String ngaySinh;
	private String diaChi;
	private float heSoLuong;
	private float luongCoBan; 
	public float luongNhanVien;
	// 2. Get,set methods
	
	public int getMaNV() {
		return maNV;
	}

	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public float getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public float getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(float luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public float getLuongNhanVien() {
		return luongNhanVien;
	}

	// 3. Constructor methods
	public NhanVien() {
	}

	
	public NhanVien(int maNV, String tenNV, String ngaySinh, String diaChi, float heSoLuong, float luongCoBan,
			float luongNhanVien) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.heSoLuong = heSoLuong;
		this.luongCoBan = luongCoBan;
		this.luongNhanVien = luongNhanVien;
	}
	
	// 4. Input, output methods
	public void nhap(Scanner scan)
	{
		System.out.print("Nhập mã nhân viên: ");
		this.maNV = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập tên nhân viên: ");
		this.tenNV = scan.nextLine();
		System.out.print("Nhập ngày sinh: ");
		this.ngaySinh = scan.nextLine();
		System.out.print("Nhập địa chỉ: ");
		this.diaChi = scan.nextLine();
		System.out.print("Nhập hệ số lương: ");
		this.heSoLuong = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập lương cơ bản: ");
		this.luongCoBan = Integer.parseInt(scan.nextLine());
		
	}
	public void xuat()
	{
		System.out.println("Nhân viên -Mã: "+this.maNV+"\t -Tên nhân viên: "
	+this.tenNV+"\t -Ngày sinh: "+this.ngaySinh+"\t -Địa chỉ: "+this.diaChi+"\t -Lương cơ bản: "+this.luongCoBan+"\t -Hệ số lương: "+this.heSoLuong+"\t -Lương tổng cộng:"+this.luongNhanVien);
	}
	// 5. Business methods
	public void tinhLuongNhanVien()
	{
		this.luongNhanVien = this.luongCoBan*this.heSoLuong;
	}
	
}
