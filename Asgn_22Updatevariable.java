package Batch51JavaPrograms;

public class Asgn_22Updatevariable 
{
	static int staticvariable =100;
	int nonstaticvariable=200;
	
	public static void updatstaticevariable() 
	{
		System.out.println(staticvariable);
		
	}
	public void updatnonstaticevariable() 
	{
		System.out.println(nonstaticvariable);
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Asgn_22Updatevariable w1= new Asgn_22Updatevariable ();
		w1.updatnonstaticevariable();
		updatstaticevariable();
		
		
	}

}
