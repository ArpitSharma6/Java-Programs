package Batch51JavaPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Asgn_95SetConcepts {

	public static void main(String[] args) 
	{
		Set<String> s1 = new HashSet<>();
		s1.add("Arpit");
		s1.add("Sharma");
		s1.add("Is Coding ");
		s1.add("Arpit"); // which is ignored 
		
		
		System.out.println(s1);
		
		s1.remove("Sharma");
		System.out.println(s1);
		
		boolean b1= s1.contains("Arpit");
		System.out.println(b1);
		
		
		System.out.println(s1.size());
		
		System.out.println(s1.isEmpty()); // or we can use boolean because of 'is'
		
		Iterator<String> i1 =  s1.iterator();
		while (i1.hasNext())
		{
			System.out.println(i1.next());
			
		}
		
		s1.clear();
		System.out.println(s1);
		
		
	}

}
