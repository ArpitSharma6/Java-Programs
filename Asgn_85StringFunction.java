package Batch51JavaPrograms;

import java.util.Date;

public class Asgn_85StringFunction {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		Date d2= new Date(d1.getTime() + (1000*60*60*24*2));
		
		String s1= d2.toString();
		//dd-mm-yyyy
		//dd-mmm-yyyy
		
		String Month = s1.substring(4,7);
		System.out.println(Month);
		String date = s1.substring(8,10);
		System.out.println(date);
		String year = s1.substring(s1.length()-4);
		System.out.println(year);
		
		String s2= date.concat("-").concat(Month).concat("-").concat(year);
		String s3= date.concat(Month).concat(year);
		System.out.println(s2);
		System.out.println(s3);
		
		
	}

}
