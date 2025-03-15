package Batch51JavaPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Asgn_91CollectionIterator {

	public static void main(String[] args) 
	{
		
		Collection<Object>c1 = new ArrayList<Object>(); //upcasting
		c1.add("Arpit Sharma");
		c1.add(75000);
		c1.add(94141376);
		c1.add("AS");
		System.out.println(c1);
		Iterator <Object>i1 = c1.iterator();
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
			

	}

}
