package Batch51JavaPrograms;

class Asgn_48MOfinalFinalmethod1 
{
	final void addition()
	{
		System.out.println("This is called final keyword method overridden");
	}
	
}

public class Asgn_48MOfinalFinalmethod extends Asgn_48MOfinalFinalmethod1
{
	void addition2()
	{
		System.out.println("This is called final keyword method overridden2");
	}
	
	
	public static void main(String[] args)
	{
		Asgn_48MOfinalFinalmethod s1 = new Asgn_48MOfinalFinalmethod();
		s1.addition();
		s1.addition2();
	}

}
