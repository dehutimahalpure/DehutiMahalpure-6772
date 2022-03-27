package ExceptionHandling;

public class arithmaticexception {

	public static void main(String[] args) {
		int a,b;
		try
		{
			a=0;
			b=7/a;
			System.out.println("This will not be printed");
			
		}
		catch(ArithmeticException e)
				{
			System.out.println("Division by zero");
			
				}
		System.out.println("After catch statement");
		


	}

}
