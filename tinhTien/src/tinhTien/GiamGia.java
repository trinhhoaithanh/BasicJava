package tinhTien;

import java.util.Scanner;

public class GiamGia {

	public GiamGia() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SI_1 = 100;
		final int SI_2 = 50;
		final float SALE_1 = 0.88f;
		final float SALE_2 = 0.92f;
		String name;
		int amount;
		float price;
		float cost;
		Scanner scan = new Scanner(System.in);
		System.out.print("Tên mặt hàng: ");
	    name = scan.nextLine();
	    System.out.print("Số lượng: ");
	    amount = Integer.parseInt(scan.nextLine());
	    System.out.print("Giá của sản phẩm: ");
	    price = Float.parseFloat(scan.nextLine());
	    if (amount >= SI_1)
	    {
	    	cost = SI_1*price + (amount - SI_1)*price*SALE_1;
	    }
	    else if ((amount >SI_2)&&(amount<SI_1))
	    {
	    	cost = SI_2*price + (amount - SI_2)*price*SALE_2;
	    }
	    else 
	    	
	    {
	    	cost = amount*price;
	    }
System.out.print("tên: " + name +"\t số lượng: "+ amount + "\t Giá tiền" + price + "\t Thành tiền: "+ cost);
	}

}
