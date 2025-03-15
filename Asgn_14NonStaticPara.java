package Batch51JavaPrograms;

public class Asgn_14NonStaticPara 
{
	public void addition (int a, int b )
	{
		int sum = a + b ;
		System.out.println(sum);
	}
	public void add (int a, double b )
	{
		double  sum = a + b ;
		System.out.println(sum);
	}
	public void added (double a, double b )
	{
		double  sum = a + b ;
		System.out.println(sum);
	}
	public void adding (double a, int  b )
	{
		double  sum = a + b ;
		System.out.println(sum);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Asgn_14NonStaticPara w1 = new Asgn_14NonStaticPara ();
		w1.addition(20, 30);
		w1.add(20, 20.5);
		w1.added(30.5, 20.5);
		w1.adding(25.5,50);
	}

}
