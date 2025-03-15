package Batch51JavaPrograms;

import java.util.Scanner;

public class Asgn_66TwoExceptions {

	public static void main(String[] args)
	{
		Scanner s1= new Scanner(System.in);
		
		try
		{
			System.out.println("Enter number 1");
			int age = s1.nextInt();
			System.out.println("Enter Number 2");
			int age2 = s1.nextInt();
			double result = age/age2;
			System.out.println(" reuslt is " + result);
		}
		catch(java.util.InputMismatchException e) 
		{
			System.out.println("Invalid input please enter a valid input ");
		}
		catch (ArithmeticException e) 
		{
            System.out.println("division by zero is not allowed ");
		}       
		finally 
		{
        s1.close(); // Close scanner
        System.out.println("Program execution completed.");
    }

}
}