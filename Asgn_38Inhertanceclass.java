package Batch51JavaPrograms;
import java.util.Scanner;
class Usingextendskeyword
{
	static void add() 
	{
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter the value for a");
		double a = s1.nextDouble();
		System.out.println("Enter the value for b");
		double b = s1.nextDouble();
		double sum = a + b ;
		System.out.println("The addition is result : " + sum );
		s1.close();
	}
	static void sub() 
	{
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter the value for a");
		double a = s1.nextDouble();
		System.out.println("Enter the value for b");
		double b = s1.nextDouble();
		double sub = a - b ;
		System.out.println("The subtraction result is : " + sub );
		s1.close();
	}	
	
}
public class Asgn_38Inhertanceclass extends Usingextendskeyword
{
	static void mul() {
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter the value for c");
		double c = s1.nextDouble();
		System.out.println("Enter the value for d");
		double d = s1.nextDouble();
		double mul = c * d ;
		System.out.println("The multiply result is : " + mul );	
		s1.close();
		
	}
	static void div() {
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter the value for c");
		double c = s1.nextDouble();
		System.out.println("Enter the value for d");
		double d = s1.nextDouble();
		double div = c / d ;
		System.out.println("The division result is : " + div );	
		s1.close();
}

	public static void main(String[] args) 
	{
		Scanner s1 =new Scanner(System.in);
		// TODO Auto-generated method stub
		add();
		sub();
		mul();
		div();		
		s1.close();
	}
}
