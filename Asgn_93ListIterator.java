package Batch51JavaPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Asgn_93ListIterator {

	public static void main(String[] args) {
		

		List<String> l1 =new ArrayList<String>();
		l1.add("Abhi");
		l1.add("Arpit");
		l1.add("Sharma");
		l1.add("Hero");
		l1.add("Don");
		System.out.println("orignal list"+ l1);
		
		Iterator<String> i2 = l1.iterator();
		while (i2.hasNext())
		{
			System.out.println( i2.next());
		}
		
		
		l1.add(4, "Hulk ");
		System.out.println(l1);
		
		
		
		
	}
}
