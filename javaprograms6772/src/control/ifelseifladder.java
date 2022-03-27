package control;

import java.util.Scanner;

public class ifelseifladder {

	private static Scanner sc;

	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		System.out.println("Enter day between 0 to 6 day=");
		int day =sc.nextInt();
		if(day==0)
		{
			System.out.println("\n Sunday");
		}
		
		else if(day==1)
		{
			System.out.println("\n Monday");
		}
		else if(day==2)
		{
			System.out.println("\n Tuesday");
		}
		else if(day==3)
		{
			System.out.println("\n Wenesday");
			
		}
		else if(day==4)
		{
			System.out.println("\n Thursday");
		}
		else if(day==5)
		{
			System.out.println("\n friday");
		}
		else if(day==6)
		{
			System.out.println("\n Saturday");
		}
		else
		{
			
				System.out.println("Wrong input");
		}
		
		
		

	}

}
