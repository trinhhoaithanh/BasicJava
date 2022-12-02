import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Mục đích: quản lý nghiệp vụ cho danh sách
 */
public class ListPerson {
	// 1. Attribute
	private ArrayList<Person> list;
	// 2. get set method

	public ArrayList<Person> getList() {
		return list;
	}

	public void setList(ArrayList<Person> list) {
		this.list = list;
	}

	// 3. constructor
	public ListPerson() {
		list = new ArrayList<Person>();
	}

	// 4. input, output
	public void inMenu()
	{
		System.out.println("Vui lòng chọn theo menu");
		System.out.println("1. Nhập student");
		System.out.println("2. Nhập employee");
		System.out.println("3. Nhập customer");
		System.out.println("0. Thoát");
	}
	public void nhap(Scanner scan) {
		boolean flag = true;
		do {
			inMenu();
			System.out.println("Mời chọn");
			int chon = Integer.parseInt(scan.nextLine());
			Person person;
			switch (chon) {
			case 1:
				person = new Student();
				person.nhap(scan);
				list.add(person);
				break;
			case 2:
				person = new Employee();
				person.nhap(scan);
				list.add(person);
				break;
			case 3:
				person = new Customer();
				person.nhap(scan);
				list.add(person);
				break;
			case 0:
				flag=false;
				break;
			}

		} while (flag);
	}
	public void xuat()
	{
		for (Person person:this.list)
		{
			person.xuat();
		}
	}
	// 5. business
	public void dummyData()
	{
		Person person;
		person = new Student("Long","92 Tân Định","1","abc@gmail.com",8,4,9);
		this.list.add(person);
		person = new Student("Hùng","2 Nhà Bè","1","ađscc@gmail.com",5,10,9);
		this.list.add(person);
		person = new Employee("Lan","4 Phú Tân","3","đeềc@gmail.com",15,20);
		this.list.add(person);
		person = new Employee("Việt","3 Bến Tre","4","đthanhc@gmail.com",20,20);
		this.list.add(person);
		person = new Employee("Ngà","4 Tiền Giang","5","cthienc@gmail.com",30,24);
		this.list.add(person);
		person = new Customer("An","5 Đà Nẵng","6","dkmek@gmail.com",20,"CyberLearn","Good");
		this.list.add(person);
		person = new Customer("Vùng","8 Đà Nẵng","7","dek@gmail.com",25,"CyberSoft"," Very Good");
		this.list.add(person);
	}
	private void interChangeSort(ArrayList<Person> _list)
	{
		int i;
		int j;
		for (i=0;i<list.size()-1;i++)
		{
			for (j=i+1;j<list.size();j++)
			{
				Person personI = list.get(i);
				Person personJ = list.get(j);
				if  (personJ.getHoTen().compareToIgnoreCase(personI.getHoTen())<0)
				{
					Collections.swap(_list,i,j);
				}
			}
		}
		
	}
	public void sortName()
	{
		interChangeSort(this.list);
	}
}
