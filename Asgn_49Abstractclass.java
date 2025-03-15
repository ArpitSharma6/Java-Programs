package Batch51JavaPrograms;

abstract class  Asgn_49Abstractclass1
{
	abstract void add ();
	abstract void sub ();
}

public class Asgn_49Abstractclass extends	Asgn_49Abstractclass1 
{
	void add()
	{
		int a= 100;
		int b= 200;
		int sum = a+b;
		System.out.println("Real Logic" + sum);
		
	}

		void sub() 
		{

			int a= 100;
			int b= 200;
			int sub= a-b;
			
		System.out.println("Real Logic2"+ sub);
	}

	public static void main(String[] args) 
	{
		Asgn_49Abstractclass s1= new Asgn_49Abstractclass();
		s1.add();
		s1.sub();
		
		
		
	}

}
