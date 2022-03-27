package control;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) 
	{
		int marks;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your Marks");
		marks=sc.nextInt();
		if(marks>=36)
		{
			System.out.println(" you are pass");
		}
		else
		{
			System.out.println(" you are fail");
		}
		

	}

}
