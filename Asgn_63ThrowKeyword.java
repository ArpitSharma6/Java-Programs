package Batch51JavaPrograms;

public class Asgn_63ThrowKeyword {

	public static void main(String[] args) throws ArithmeticException, NullPointerException
	{  
		if(1>3) 
		{
			throw new ArithmeticException();	
		}
		else 
		{
			throw new NullPointerException();
		}

	}

}
