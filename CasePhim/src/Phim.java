import java.util.Scanner;

public class Phim {

	public Phim() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		final int NUM_CHAR_PAND_LEFT = -100;
	    String tenPhim;
		int giaVeLon;
		int giaVeEm;
		int soVeLon;
		int soVeNho;
		int phanTramTuThien;
		float tongThu;
		float tuThien;
		float conLai;
		Scanner scan = new Scanner(System.in);
		System.out.print("nhap ten phim: ");
		tenPhim = scan.nextLine();
		System.out.print("nhap gia ve nguoi lon: ");
		giaVeLon = Integer.parseInt(scan.nextLine());
		System.out.print("nhap gia ve tre : ");
		giaVeEm = Integer.parseInt(scan.nextLine());
		System.out.print("nhap so ve nguoi lon: ");
        soVeLon = Integer.parseInt(scan.nextLine());
        System.out.print("nhap so ve em be: ");
		soVeNho = Integer.parseInt(scan.nextLine());
		System.out.print("phan tram tu thien: ");
		phanTramTuThien = Integer.parseInt(scan.nextLine());
		tongThu = soVeLon*giaVeLon + soVeNho*giaVeEm;
		tuThien = tongThu*((1.0f)*phanTramTuThien)/100;
        conLai = tongThu - tuThien;
        String text;
        text = String.format("%1$",NUM_CHAR_PAND_LEFT + "s", "Tên-phim").replace(' ', '.').replace('.',' ');
        System.out.println(text + tenPhim);
        text = String.format("%1$",NUM_CHAR_PAND_LEFT + "s", "Số-vé-đã-bán").replace(' ', '.').replace('.',' ');
        System.out.println(text  + (soVeLon+soVeNho));
        text = String.format("%1$",NUM_CHAR_PAND_LEFT + "s", "Doanh-thu").replace(' ', '.').replace('.',' ');
        System.out.println(text + tongThu);
        text = String.format("%1$",NUM_CHAR_PAND_LEFT + "s", "Trích-phần-trăm-từ-thiện").replace(' ', '.').replace('.',' ');
        System.out.println(text + phanTramTuThien + "%");
        text = String.format("%1$",NUM_CHAR_PAND_LEFT + "s", "Tổng-tiền-trích-từ-thiện").replace(' ', '.').replace('.',' ');
        System.out.println(text + tuThien);
        text = String.format("%1$",NUM_CHAR_PAND_LEFT + "s", "Tổng-thu-được-sau-khi-trừ").replace(' ', '.').replace('.',' ');
        System.out.println(text + conLai);
        
		
		
		
		
		

	}

}
