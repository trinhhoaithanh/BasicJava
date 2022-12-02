
public class XyLy {

	public XyLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien();
		SinhVien sv2 = new SinhVien();
		sv1.hoTen = "CyberLearn";
		sv1.email = "abc@gnail.com";
		sv2.hoTen = "CyberSoft";
		sv2.email = "cyber@gmail.com";
		System.out.println("Tên: "+sv1.hoTen + "- Email:"+ sv1.email);
		System.out.print("Tên: "+sv2.hoTen + "- Email:"+ sv2.email);
	}
}
