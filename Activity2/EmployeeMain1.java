import java.util.Scanner;

class Employee
{
	private String name;
	private String address;
	private String mobile;
	void setname(String name)
	{
		this.name = name;
	}
	void setaddress(String address)
	{
		this.address= address;
	}
	void setmobile(String mobile)
	{
		this.mobile = mobile;
	}
  String getname() {
		return this.name;
	}
	String getaddress() {
		return this.address;
	}
  String getmobile()
  {
	  return this.mobile;
  }
}
public class EmployeeMain1 {

	public static void main(String[] args) {
		Employee E = new Employee();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the name:");
		E.setname(sc.nextLine());
		System.out.println("Enter Address:");
		E.setaddress(sc.nextLine());
		System.out.println("Enter Mobile:");
		E.setmobile(sc.nextLine());
		
		System.out.println("Employee Details");
		System.out.println("Name:" + E.getname());
		System.out.println("Address:" + E.getaddress());
		System.out.println("Mobile:" + E.getmobile());
	}

}
