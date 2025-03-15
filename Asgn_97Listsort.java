package Batch51JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Asgn_97Listsort {

	public static void main(String[] args) {

		List<String> l1 =new ArrayList<String>();
		l1.add("Abhi");
		l1.add("Arpit");
		l1.add("Sharma");
		l1.add("Hero");
		l1.add("Don");
		
		l1.add(1, "Chiki");// adding new on indexing 1//
		System.out.println(l1);
		
		List<String> l2 =new ArrayList<String>();
		l2.add("John");
		l2.add("hero");
		l2.add("super");
		l2.addAll(l1);
		//l2.addAll(1, l1);
		
		System.out.println("Before Sorting" + l2);
		Collections.sort(l1);
		System.out.println("After sorting" +l1);
		
		
		//Properties of list and set
		//follow indexing 
		// follow order of insertion.
		// follow multiple null
		//folloe duplicates
		//acepts hetrogenous 
		//acepts dynamic 
		//accepts iterator 
		//accepts literator 
		// iterator is applicable to entire collection//	
		
	}

}
