package Batch51JavaPrograms;
import java.util.Scanner;

class Parentclass1 
{
	static void addition(Scanner s1) 
	{
		
		System.out.println("Enter the value of a ");
		double a = s1.nextDouble();
		System.out.println("Enter the value of b");
		double b = s1.nextDouble();
		double sum = a + b ;
		System.out.println("The sum of a + b is : " + sum );
		
	}
}

public class Asgn_39SingleInheritance extends Parentclass1
{
	static void subtraction (Scanner s1)
{	
	
	System.out.println("Enter the value of a ");
	double a = s1.nextDouble();
	System.out.println("Enter the value of b");
	double b = s1.nextDouble();
	double sub = a - b ;
	System.out.println("The sum of a + b is : " + sub );
}	



	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		addition(s1);
		subtraction(s1);
	}

}
