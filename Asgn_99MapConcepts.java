package Batch51JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class Asgn_99MapConcepts {

	public static void main(String[] args) 
	{
		Map<Integer,String> m1= new HashMap<Integer,String>()
;		m1.put(12345, "Arpit");
		m1.put(67890,"Sharma");
		m1.put(11112, "Abhi");
		
		System.out.println(m1);

		Map<Integer,String> m2= new HashMap<Integer,String>()
;		m2.put(12315, "Arpita");
		m2.put(67850,"Sharma");
		m2.put(11182, "Abhiji");
		
		System.out.println(m2);
		
		m2.putAll(m1);
		System.out.println(m1);
		
		//m1.remove(11112);
		//System.out.println(m2);
		
		m2.replace(67850, "isthebest");
		System.out.println(m2);

		m2.replace(11182, "Abhiji", "Sharmaji");
		System.out.println(m2);
		
		
	}

}
