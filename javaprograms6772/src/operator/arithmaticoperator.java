package operator;

import java.util.Scanner;

public class arithmaticoperator {

	private static Scanner s;

	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s.nextInt();
		System.out.println("Enter the value of b");
		int b=s.nextInt();
		int c=a+b;
		System.out.println("Additio =" +c);
		c=a-b;
		System.out.println("substraction =" +c);
		c=a*b;
		System.out.println("Multiplication = " +c);
		c=a/b;
		System.out.println("dividation = " +c);
		c=a%b;
		System.out.println("remainder =" +c);
		
	    
	    
	    
	    
	}

}
