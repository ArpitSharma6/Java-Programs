package Batch51JavaPrograms;

public class Asgn_16Methodover
{
public static void Addition(int a, int b ) 
{
	int sum = a + b;
	System.out.println(sum);
	
}public static void Addition(double  a, int b ) 
{
	double  sum = a + b;
	System.out.println(sum);
	
}public static void Addition(int a, double b ) 
{
	double  sum = a + b;
	System.out.println(sum);
	
}
	
public  void Addition(float a, float b ) 
{
	float sum = a + b ;
	System.out.println(sum);
	
}
public static void Addition(byte a, int b ) 
{
	int sum = a + b;
	System.out.println(sum);
	
}
public static void Addition(short a, long b ) 
{
	long sum = a + b;
	System.out.println(sum);
	
}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Asgn_16Methodover w1 = new Asgn_16Methodover();
		Addition(20,30);
		Addition(20.45,50);
		Addition(20.5,20);
	
		w1.Addition(80, 80);
		w1.Addition(20, 60);
		w1.Addition(100, 50);
		
		
	}

}
