package Batch51JavaPrograms;

public class Asgn_18GlobalVar
{
	 public int nonstaticvariable = 200;
	static int staticvariable = 500;
	
	public void displaynonstatic() {
		System.out.println(nonstaticvariable);
		
	}
	public static void displaystaticvariable() {
		System.out.println(staticvariable);
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Asgn_18GlobalVar w1 = new Asgn_18GlobalVar();
		
		displaystaticvariable();
		w1.displaynonstatic();
		
		
			
	}

}
