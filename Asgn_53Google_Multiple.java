package Batch51JavaPrograms;

interface ArpitSharma
{
	void add();
	void Sub();
}
interface SharmaArpit
{

	void mul();
	void div();
}
public class Asgn_53Google_Multiple implements SharmaArpit, ArpitSharma
{
	
	public static void main(String[] args) 
	{
		Asgn_53Google_Multiple s1= new Asgn_53Google_Multiple();
		s1.add();
		s1.div();
		s1.Sub();
		s1.mul();
	}

	public void add() 
	{
		System.out.println("addition is performed ");
		
	}

	
	public void Sub() 
	{
		System.out.println("addition is subtract ");
		
	}


	public void mul() 
	{
		System.out.println("addition is multiply ");
	}


	public void div() 
	{
		System.out.println("addition is division ");
	}
	
}
