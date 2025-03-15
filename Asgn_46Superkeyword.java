package Batch51JavaPrograms;

class Asgn_46Superkeyword1
{
		void addition() 
		{
			System.out.println("addition is performed ");
		
		}
}
public class Asgn_46Superkeyword extends Asgn_46Superkeyword1
{
	void addition() 
	{
		super.addition();
		System.out.println("addition is performed2 ");
	
	}
		
	public static void main(String[] args)
	{
		Asgn_46Superkeyword s1 = new Asgn_46Superkeyword();
		s1.addition();
	}

}

