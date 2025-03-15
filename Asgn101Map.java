package Batch51JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class Asgn101Map {

	public static void main(String[] args) 
	{
		Map<Integer,String> m1= new HashMap<Integer,String>();
		m1.put(12345, "Arpit");
		m1.put(67890,"Sharma");
		m1.put(11112, "Abhi");
		m1.putIfAbsent(548756,"Hero");
		Map<Integer,String> m2= new HashMap<Integer,String>();
		m2.put(12345, "Arpit");
		m2.put(67890,"Sharma");
		m2.put(11112, "Abhi");
		
		System.out.println(m1);
	 
		boolean b1 = m1.containsKey(12345);
		System.out.println(b1);
		
		boolean b2 = m1.containsValue("Abhi");
		System.out.println(b2);
	
		//Compares 2 maps for equality //
		
		boolean b3 = m1.equals(m2);
		System.out.println(b3);
		
		String s1= m1.get(11112);
					System.out.println(s1);	

	}

}
