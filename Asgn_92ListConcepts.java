package Batch51JavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class Asgn_92ListConcepts {

	public static void main(String[] args) 
	{
		List<String> l1 = new ArrayList<>();
		l1.add("Arpit");
		l1.add("Abhi");
		l1.add("don");
		l1.add("Shon");
	
		System.out.println(l1);
		
		l1.add(1, "Hero");
		l1.add(3, "Smart");
		
		System.out.println(l1);
		
		l1.get(1);
		System.out.println(l1);
		
		l1.set(4, "Hulk");
		System.out.println(l1);
		
		l1.remove(3);
		System.out.println(l1);
		
		boolean b1= l1.contains("Ronaldo");
		System.out.println(b1);
		
		int i = l1.size();
		System.out.println(i);
		
		boolean b2 = l1.isEmpty();
		System.out.println(b2);
		
		// int s3 = l1.indexOf("Rahul");
		//System.out.println(l1);
		
		l1.clear();
		System.out.println(l1);
		

	}

}
