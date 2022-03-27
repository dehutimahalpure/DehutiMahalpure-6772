package Inheritance;
class sem1
{
	int math ,english,science;

	public void input1()
{
	
	math=56;
	english=89;
	science=45;
}
  public void output1()
{
	System.out.println("\n\n-------------Sem1---------------");
	System.out.println("marks of math ="+math);
	System.out.println("marks of english ="+english);
	System.out.println("marks of science ="+science);
	
}
}
class sem2 extends sem1
{
      int c ,cpp,java;

public void input2()
{

c=69;
cpp=59;
java=48;
}
public void output2()
{
System.out.println("\n\n-------------Sem2---------------");
System.out.println("marks of c ="+c);
System.out.println("marks of cpp ="+cpp);
System.out.println("marks of java="+java);

}
}

public class singleinheritance {
	
	public static void main(String[] args) 
	{
		sem2 obj1=new sem2();
		
		obj1.input1();
		obj1.output1();
		
		obj1.input2();
		obj1.output2();
		
	}


}
