package Batch51JavaPrograms;

import java.util.Scanner;

public class Asgn_62ExceptionHandlingnested {

	public static void main(String[] args)
	{
		try
		{
			Scanner s1= new Scanner(System.in);
			System.out.println("Enter your Age");
			int age = s1.nextInt();
			System.out.println("The age is  " + age );
		}
		catch(Exception a) 
		{
			try
			{
				Scanner s1= new Scanner(System.in);
				System.out.println("Enter your Age it must be anumber ");
				int age = s1.nextInt();
				System.out.println("The age is  " + age );
			}
			catch(Exception b) 
			{
				System.out.println("Invalid input please neter a valid input ");
			}
			
			
		}
		
	}

}
