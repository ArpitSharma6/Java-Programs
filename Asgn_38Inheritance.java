package Batch51JavaPrograms;

import java.util.Scanner;

class Asgn_38Inheritancescanner
{
	 static Scanner s1 =new Scanner(System.in);
	static void add() 
	{
		
		System.out.println("Enter the value for a");
		double a = s1.nextDouble();
		System.out.println("Enter the value for b");
		double b = s1.nextDouble();
		double sum = a + b ;
		System.out.println("The addition is result : " + sum );
		
	}
	static void sub() 
	{
	
		System.out.println("Enter the value for a");
		double a = s1.nextDouble();
		System.out.println("Enter the value for b");
		double b = s1.nextDouble();
		double sub = a - b ;
		System.out.println("The subtraction result is : " + sub );
		
	}	
	
}
public class Asgn_38Inheritance extends Asgn_38Inheritancescanner
{
	static void mul() {
		
		System.out.println("Enter the value for c");
		double c = s1.nextDouble();
		System.out.println("Enter the value for d");
		double d = s1.nextDouble();
		double mul = c * d ;
		System.out.println("The multiply result is : " + mul );	
		
	}
	static void div() {
		System.out.println("Enter the value for c");
		double c = s1.nextDouble();
		System.out.println("Enter the value for d");
		double d = s1.nextDouble();
		double div = c / d ;
		System.out.println("The division result is : " + div );	
		
}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		add();
		sub();
		mul();
		div();		
		s1.close();
	}
}
