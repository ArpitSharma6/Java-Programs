package Batch51JavaPrograms;

import java.util.Enumeration;
import java.util.Vector;

public class Asgn_100Enumeration {

	public static void main(String[] args)
	{
		Vector v = new Vector();
		v.add(100);
		v.add("Arpit");
		v.add("is winning");
		
		Enumeration e = v.elements();

		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
	}

}
