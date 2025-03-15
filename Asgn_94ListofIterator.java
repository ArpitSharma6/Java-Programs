package Batch51JavaPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Asgn_94ListofIterator {

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
		System.out.println("Forward Iteration");
		
		ListIterator<String> i3 =l1.listIterator();
			//next
			//Previous 
			//hasNext
		//	hasprevious
		//updating the value 
		
		while(i3.hasNext())
		{
			System.out.println(i3.next());
		}
		System.out.println("Backward Iteration ");
		 while (i3.hasPrevious())
		 {
			 System.out.println(i3.previous());
		 }
		
		
		
	}

}
