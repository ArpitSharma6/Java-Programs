package Batch51JavaPrograms;

class Asgn_42Supercallingpara1
{
	 void name(String a,String b) 
	{
		System.out.println("This is the parent constructor");
		System.out.println("Name: "+ " a + b");
	}
}
class Asgn_42Supercallingpara2 extends Asgn_42Supercallingpara1
{
	void initial (char a , char b ) 
	{
		super.name("Arpit", "Sharma");
		System.out.println("This is the parent 2 Constructor ");
		System.out.println("Initials: " + a + "." + b + ".");
	}
}

public class Asgn_42Supercallingpara extends Asgn_42Supercallingpara2 
{
	void rollno (int a , int b ) 
	{
		super.initial('A', 'S'); 
		System.out.println("This is the child constructor");
		System.out.println("Roll Number: " + a + b);
	}
	
	public static void main(String[] args) 
	{
		 new Asgn_42Supercallingpara();
		
	}

}
