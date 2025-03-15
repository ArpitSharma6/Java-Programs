package Batch51JavaPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Asgn_96SetIterator {

	public static void main(String[] args) {
		
		Set<String> s1 = new HashSet<>();
		s1.add("Arpit");
		s1.add("Sharma");
		s1.add("Is Coding ");
		s1.add("Arpit"); // which is ignored 
		System.out.println(s1);
		
		Iterator i1 = s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		
		
		
		
	}

}
