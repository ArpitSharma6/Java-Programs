package Batch51JavaPrograms;
class Parentclass
{
	void login() 
	{
		System.out.println("Login with email ");
	}
}
public class Asgn_44Methodoverridding extends Parentclass
{	
	void login() 
	{
		System.out.println("Login with mobile no.");
	}

public static void main(String[] args) 
	{
		Asgn_44Methodoverridding s1 =new Asgn_44Methodoverridding(); 
		s1.login();
	}

}