package Batch51JavaPrograms;

class Asgn_41Parentclass
{
	Asgn_41Parentclass()
	{
	System.out.println("This is the parent constructor");	
	}
}
class Asgn_41Parentclass2 extends Asgn_41Parentclass
{
		Asgn_41Parentclass2()
	{
			super ();
	System.out.println("This is the child constructor");	
	}
		
}

public class Asgn_41Supercallingstatement extends Asgn_41Parentclass2
{	
	Asgn_41Supercallingstatement()
	{	super();
		System.out.println("This is sub child constructor ");
	}

public static void main(String[]args) 
{
	new Asgn_41Supercallingstatement();

}
	
}
