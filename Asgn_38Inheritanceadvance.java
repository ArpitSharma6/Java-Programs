package Batch51JavaPrograms;
import java.util.Scanner;

class ParentClass	
{
	
	static void add(Scanner s1) 
	{
		
		System.out.println("Enter the value for a");
		double a = s1.nextDouble();
		System.out.println("Enter the value for b");
		double b = s1.nextDouble();
		double sum = a + b ;
		System.out.println("The addition is result : " + sum );
		
	}
	static void sub(Scanner s1) 
	{
	
		System.out.println("Enter the value for a");
		double a = s1.nextDouble();
		System.out.println("Enter the value for b");
		double b = s1.nextDouble();
		double sub = a - b ;
		System.out.println("The subtraction result is : " + sub );
		
	}	
	
}
public class Asgn_38Inheritanceadvance extends ParentClass
{
	static void mul(Scanner s1) {
		
		System.out.println("Enter the value for c");
		double c = s1.nextDouble();
		System.out.println("Enter the value for d");
		double d = s1.nextDouble();
		double mul = c * d ;
		System.out.println("The multiply result is : " + mul );	
		
	}
	static void div(Scanner s1) {
		System.out.println("Enter the value for c");
		double c = s1.nextDouble();
		System.out.println("Enter the value for d");
		double d = s1.nextDouble();
		double div = c / d ;
		System.out.println("The division result is : " + div );	
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s1 = new Scanner(System.in);
		add(s1);
		sub(s1);
		mul(s1);
		div(s1);		
		s1.close();
	}
}

