package Batch51JavaPrograms;

public class Asgn_12nonStatic2 
{
	int a=10;
	int b=20;
	int c= 30;
	int d= 40;
	
	 
	public void add () 
	{	

		int sum = a + b ;
		System.out.println(sum);
			
	}
	
	public void sub()
	{
		int sum2 = c-d;
		System.out.println(sum2);
		
	}
	public void mul()
	{
		int sum3 = a * c;
		System.out.println(sum3);
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Asgn_12nonStatic2 a1 = new  Asgn_12nonStatic2();
		a1.add();
		a1.sub();
		a1.mul();
		
		
	}

}
