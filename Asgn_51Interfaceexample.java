package Batch51JavaPrograms;

interface Asgn_51Interfaceexample1
{
	//2 Abstract method //No need to write abstract in interface //
	void add();
	void Sub();
	
}

public class Asgn_51Interfaceexample implements Asgn_51Interfaceexample1
{

	public static void main(String[] args) 
	{
		Asgn_51Interfaceexample s1 = new Asgn_51Interfaceexample();
		s1.add();
		s1.Sub();
	}
	// we can write the the two methods public void add() after the main method also//
	public void add() 
	{
			System.out.println("Added Value");
	}
	
	public void Sub() 
	{
		System.out.println("subtracted  Value");	
	}

}
