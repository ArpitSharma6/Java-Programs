package Batch51JavaPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Asgn_105MapIterator {

	public static void main(String[] args) {
		
		Map<Integer,String> m1= new HashMap<Integer,String>();
		m1.put(12345, "Arpit");
		m1.put(67890,"Sharma");
		m1.put(11112, "Abhi");

		System.out.println(m1);
		
		for (String s1 :m1.values())
		{
			System.out.println(s1);
		}
		
		for (Integer I1 :m1.keySet())
		{
			System.out.println(I1);
		}
		
		for (Entry<Integer, String> E1 : m1.entrySet())
		{
			System.out.println(E1);	
		}	
		//Using Iterator //
		Set<Entry<Integer,String>> S2 = m1.entrySet();
		
		Iterator<Entry<Integer, String>> s3 = S2.iterator();
		
		while (s3.hasNext())
		{
			System.out.println(s3.next());
		}

	}

}
