package Batch51JavaPrograms;

public class Asgn_21Globalvar 
{
	int a= 20;
	int b= 30;
	
	static void add() 
	{
		 Asgn_21Globalvar w1= new  Asgn_21Globalvar ();
		 int sum = w1.a + w1.b;
		 System.out.println(sum);
		 
	}
	public void sub () 
	{
		
		int sum = a- b ;
		System.out.println(sum);
		
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		add();
		Asgn_21Globalvar w2 = new Asgn_21Globalvar ();
		w2.sub();
		

}

}