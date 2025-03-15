	package Batch51JavaPrograms;
	
	import java.util.Scanner;
	
	public class Asgn_65ThrowKeyword {
		
	static void add () 
	{
			Scanner s1= new Scanner(System.in);
			
		try
		{
			System.out.println("Enter your Age");
			int age = s1.nextInt();
			 if (age < 0)
			  {
	              throw new ArithmeticException("Age cannot be negative.");  
			  } 
		}
		catch(Exception b) 
		{
			System.out.println("Try next time ");
		}
		finally 
		{
			s1.close();
			 System.out.println(" Program execution completed.");
		}
	}
	
		public static void main(String[] args) 
		{
			 add();
		}
	
	}
