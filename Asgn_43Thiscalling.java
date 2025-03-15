package Batch51JavaPrograms;

public class Asgn_43Thiscalling 
{
	Asgn_43Thiscalling (char a)
	{
		
		System.out.println("3");
	}
	
	Asgn_43Thiscalling ()
	{
		this ("Hello");
		System.out.println("1");
	}
	Asgn_43Thiscalling (String a)
	{	
		this('A');
		System.out.println("2");
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Asgn_43Thiscalling ();
	}

}
