package Batch51JavaPrograms;

public class Asgn_51AccessSpecifier
{
	public static void add() // we can also create a non static and later create object in main method 
	{
		System.out.println("can access");
	}
	 private static void sub()
	 {
		 System.out.println("can access");
		
	 }
	 

	 protected static void mul()
	 {
		 System.out.println("can access");
	 }
	 

	 static void div()
	 {
		 System.out.println("can access");
	 }
	 
	public static void main(String[] args)
	{
		div();
		mul();
		sub();
		add();
	}

}
