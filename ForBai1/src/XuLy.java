
public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	public static final int NUMBER = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inLeDungWhile();

	}
	public static void inLeDungFor()
	{
		for (int i=0; i<NUMBER; i++)
		{
			if (i%2!=0)
			{
				System.out.print(i+"\t");
			}
		}
	}
	public static void inLeDungForCach2()
	{
		for (int i=1; i<NUMBER; i+=2)
		{
			System.out.print(i+ "\t");
		}
	}
	public static void inLeDungWhile() 
	{
		int i=1;
		while (i<NUMBER)
		{
			System.out.print(i + "\t");
			i+=2;
		}
	}
}
