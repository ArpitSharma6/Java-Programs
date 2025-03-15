package Batch51JavaPrograms;

import java.util.Scanner;

public class Asgn_64FinallyKeyword {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		try
		{
			System.out.println("Enter your Age");
			int age = s1.nextInt();
			System.out.println("The age is  " + age );
		}
		catch(Exception a) 
		{
			System.out.println("Invalid input. Please enter a valid number.");
			
			try
			{
				System.out.println("Enter your Age it must be anumber ");
				s1.nextLine();
				int age = s1.nextInt();
				System.out.println("The age is  " + age );
			}
			catch(Exception b) 
			{
				System.out.println("Last attempt please enter a valid input ");
				try
				{
					System.out.println("Enter your Age it must be anumber ");
					s1.nextLine();
					int age = s1.nextInt();
					System.out.println("The age is  " + age );
				}
				catch(Exception c) 
				{
				}
			}
			
			finally 
			{
				s1.close();
				System.out.println("program completed ");
			}
		
	}

	}
}


