package Batch51JavaPrograms;

import java.util.ArrayList;
import java.util.Collection;

public class Asgn_89Collectionconcept {

	public static void main(String[] args)
	{
		Collection<Integer> c1 = new ArrayList<Integer> ();
		c1.add(45);
		c1.add(55);
		c1.add(66);
		System.out.println(c1);
		
		Collection<Double> c2 = new ArrayList<Double> ();
		c2.add(45.00);
		c2.add(55.60);
		c2.add(66.40);
		System.out.println(c2);
		
		Collection<String> c3 = new ArrayList<String> ();
		c3.add("Arpit");
		c3.add("Sharma");
		c3.add("selected");
		System.out.println(c3);
		
		Collection<Double> c4 = new ArrayList<Double> ();
		c4.add(45.00);
		c4.add(55.60);
		c4.add(66.40);
		boolean b1 = c4.isEmpty();
		System.out.println(b1);

		Collection<Double> c5 = new ArrayList<Double> ();
		c5.add(45.00);
		c5.add(55.60);
		c5.add(66.40);
		boolean b2 = c5.isEmpty();
		System.out.println("Before Removing " + c5);
		c5.remove(45.00);
		System.out.println("After  Removing " + c5);
		
		Collection<Double> c6 = new ArrayList<Double> ();
		c6.add(45.00);
		c6.add(55.60);
		c6.add(66.40);
		boolean b3 = c6.isEmpty();
		c6.addAll(c5);
		System.out.println("Before Removing " + c6);
		c6.removeAll(c5);
		System.out.println("After  Removing " + c6);
		
		boolean b4= c6.contains(100);
		System.out.println(b4);
		
		boolean b5 = c6.containsAll(c5);
		System.out.println(b5);
		
	}

}
