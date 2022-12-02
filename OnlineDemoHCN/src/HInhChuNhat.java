import java.util.Scanner;

/*
 * Mục đich: quản lý nghiệp vụ hình chữ nhật
 * Người tạo: Trịnh Hoài Thanh
 * Ngày tạo: 24/12/2021
 * Version: 1.0
 */
public class HInhChuNhat {
	//1. Các thuộc tính
	private float chieuDai;
	private float chieuRong;
	private float chuVi;
	private float dienTich;
	//2. Các phương thức get, set
	public float getChieuDai()
	{
		return chieuDai;
	}
	public void setChieuDai(float cDai)
	{
		this.chieuDai = cDai;
	}
	public float getChieufRong()
	{
		return chieuRong;
	}
	public void setChieuRong(float cRong)
	{
		this.chieuRong = cRong;
	}
	public float getChuVi() {
		return this.chuVi;
	}
	public float getDienTich()
	{
		return this.dienTich;
	}
	
	//3. Các phương thức khởi tạo
	public HInhChuNhat() {
		
	}	
	public HInhChuNhat(float cDai, float cRong)
	{
		this.chieuDai = cDai;
		this.chieuRong = cRong;
	}
	//4. Các phương thức nhập, xuất 
	public void nhap (Scanner scan)
	{
		System.out.print("Nhhập chiều dài: ");
		this.chieuDai = Float.parseFloat (scan.nextLine());
		System.out.print("Nhhập chiều rộng: ");
		this.chieuRong = Float.parseFloat (scan.nextLine());
	}
	public void xuat()
	{
		System.out.print("HCN ("+chieuDai+","+ chieuRong+"). Diện tích: "+dienTich
				+" \t Chu vi:"+chuVi);
	
	}
	//5. Các phương thức xử lý nghiệp vụ liên quan đến lớp này
	public void tinhChuVi ()
	{
		this.chuVi = (chieuDai+chieuRong)*2;
	}
	public void tinhDienTich()
	{
		this.dienTich = chieuDai*chieuRong;
	}

}
