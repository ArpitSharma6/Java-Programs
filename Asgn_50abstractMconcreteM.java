package Batch51JavaPrograms;

abstract class Asgn_50abstractMconcreteM1
{
	abstract void add();
	abstract void sub();
	void addition ()
	{
		System.out.println("Enter the value of addition");
	}
	static void subtraction ()// this can be either static and non static 
	{
		System.out.println("Enter the value of subtraction");
	}
	
}
public class Asgn_50abstractMconcreteM extends Asgn_50abstractMconcreteM1
{
	void add() 
	{

		System.out.println("Enter the value of add");

	}


	void sub() 
	{
		System.out.println("Enter the value of sub");
	
	}



	public static void main(String[] args) 
	
	{
		Asgn_50abstractMconcreteM s1 = new Asgn_50abstractMconcreteM();
		s1.addition ();
		subtraction ();
		s1.add(); // this is addd just to see how abstract method can be called// 
		s1.sub(); //this is addd just to see how abstract method can be called .//
	}

		
}
