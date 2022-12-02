
public class XuLyBai2 {
	
	public XuLyBai2() {
		// TODO Auto-generated constructor stub
	}
	public static final int SO_SANH=10000;
		public static void main(String[] args) {
			int tong=0;
			int i=0;
			{	
				do
				{ 
					i++;
					tong+=i;
				} while (tong<=SO_SANH);
			}
			System.out.print("Số nguyên dương nhỏ nhất là: "+ i);
		}
}