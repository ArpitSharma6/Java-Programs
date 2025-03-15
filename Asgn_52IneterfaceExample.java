package Batch51JavaPrograms;

interface ArpitSharma
{
	void add();
	void sub();
}
interface SharmaArpit
{
// we can also put extends //
	void mul();
	void div();
	
}
public class Asgn_52IneterfaceExample implements SharmaArpit  ,ArpitSharma
{

public void add() 
{
	System.out.println("Addition value ");
}


public void sub() 
{
	System.out.println("subtraction value ");
}


public void mul() 
{
	System.out.println("multiplication value ");
}


public void div() 
{
	System.out.println("division value ");
}

public static void main(String[] args) 
{
	Asgn_52IneterfaceExample s1 = new Asgn_52IneterfaceExample();
	s1.add();
	s1.div();
	s1.mul();
	s1.sub();
}
}
