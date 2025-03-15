package Batch51JavaPrograms;

public class Asgn_13StaticNonStatic
{
	public void add (int a, int b ) 
	{
		int sum =a+b;
	 System.out.println(sum);	
	}
	
	public static void sub (int b, double c ) 
	{
		double sum1 =b-c;
	 System.out.println(sum1);	
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Asgn_13StaticNonStatic w1 = new Asgn_13StaticNonStatic();
		w1.add(10, 3);
		sub(20, 10.2);
		
	}

}
