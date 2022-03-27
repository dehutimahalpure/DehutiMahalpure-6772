package Inheritance;
import java.util.*;


class a
{
	int rollno;
	String name;
	 Scanner sc =new Scanner(System.in);
	 public void  input()
	 {

		 System.out.println("enter the rollno=");
		 rollno= sc.nextInt();
		 System.out.println("enter the name=");
		 name= sc.next();
		 
	 }
	 public void display()
	 {

		 System.out.println("enter the rollno="+rollno);
		
		 System.out.println("enter the name="+name);
		 System.out.println("------------------------------");
		 
	 }
}
class b extends a
{
	 String Class ;
	 String address;
	 Scanner sc =new Scanner(System.in);
	 
	 
	 public void input1()
	 {
		 System.out.println("enter the class=");
		 Class= sc.next();
		 System.out.println("enter the address=");
		 address= sc.next();
		 
	 }
	 public void display1()
	 {

		 System.out.println("enter the class="+Class);
		 System.out.println("enter the address="+address);
		 System.out.println("------------------------------");
		 
		 
		
	 }
}
 class c extends b
{
	int mobileno;
	String city;
	 Scanner sc =new Scanner(System.in);
	 public void input2()
	 {

		 System.out.println("enter the mobileno=");
		 mobileno= sc.nextInt();
		 System.out.println("enter the city=");
		 city= sc.next();
		 
	 }
	 public void display2()
	 {

		
		 System.out.println("enter the mobileno="+mobileno);
		 System.out.println("enter the city="+city);
		 System.out.println("------------------------------");
		
		
	 }
}

public class multilevalInheritance {

	public static void main(String[] args)
	{
	    c obj1=new c();
	
	obj1.input();
	obj1.display();
	
	
	obj1.input1();
	obj1.display1();
	
	obj1.input2();
	obj1.display2();
	
	
	
	}

}
