import java.util.Scanner;

class Employee{
private String name;
private String address;
private String mobile;
void setname(String name){
    this.name=name;
}
void setaddress(String address){
    this.address=address;
}
void setmobile(String mobile){
    this.mobile=mobile;
}
String getname(){
    return this.name;
}
String getaddress(){
    return this.address;
} 
String getmobile(){
    return this.mobile;
}         
}
class EmployeeMain{
    public static void main(String[] args) 
    {
        Employee e= new Employee();
        int exit=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        e.setname(sc.nextLine());
        System.out.println("Enter Address:");
        e.setaddress(sc.nextLine());
        System.out.println("Enter Mobile:");
        e.setmobile(sc.nextLine());
       
       
        while(exit!=1)
        {
        System.out.println("Verify and Update the details:");
        System.out.println("Menu\n1. Update Employee name\n2. Update Employee Address\n3. Update Employee mobile\n4. All information correct/Exit\n");
            
        int choice=sc.nextInt();
        sc.nextLine();
        switch(choice)
        {
            case 1:
                System.out.println("Current name is: "+e.getname());
                System.out.println("Enter the name:");
                e.setname(sc.nextLine());
                break;
            case 2:
                System.out.println("Current address is: "+e.getaddress());
                System.out.println("Enter the address:");
                e.setaddress(sc.nextLine());
                break;
            case 3:
                System.out.println("Current mobile is: "+e.getmobile());
                System.out.println("Enter the mobile:");
                e.setmobile(sc.nextLine());
                break;
            case 4:
                System.out.println("Name: "+e.getname());
                System.out.println("Address: "+e.getaddress());
                System.out.println("Mobile: "+e.getmobile());
                exit=1;
                break;
            default:
                System.out.print("Invalid choice");
                
          }
       }
    }
}
