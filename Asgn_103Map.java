package Batch51JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class Asgn_103Map {

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
		
	//	for (Integer I1 :m1.keySet())
		//{
		//	System.out.println(I1);
	//	}
		
		
	}
	}

