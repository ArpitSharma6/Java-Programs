package Batch51JavaPrograms;

import java.util.ArrayList;
import java.util.Collection;

public class Asgn_89Collections {

	public static void main(String[] args)
	{
	
		Collection c1 = new ArrayList(); //upcasting
		c1.add("Arpit Sharma");
		c1.add(75000);
		c1.add(94141376);
		c1.add("AS");
		System.out.println(c1);
		
		
		Collection c2 = new ArrayList();
		c2.add("Abhi Sharma");
		c2.add(70000);
		c2.add(9261486);
		c2.add("AS");
		//c2.addAll(c1);
		System.out.println(c2);
		

	}

}
