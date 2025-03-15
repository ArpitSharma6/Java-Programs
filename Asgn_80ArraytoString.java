package Batch51JavaPrograms;

import java.util.Arrays;

public class Asgn_80ArraytoString {

	public static void main(String[] args)
	{
		int [] numbers = {12,10,8,33,4,6,87};
		
		Arrays.sort(numbers);
		System.out.println("The sorting is done "+ Arrays.toString(numbers));

	}

}
