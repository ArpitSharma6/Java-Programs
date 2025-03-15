package Batch51JavaPrograms;

import java.util.Arrays;

public class Asgn_78copyArray {

	public static void main(String[] args) 
	{
		int array1 []= new int [4];
		 array1 [0]=15;
		 array1 [1]=95;
		 array1 [2]=55;
		 array1 [3]=15;
		 
		 int array2 []= new int [array1.length];
		 
		 for(int i=0; i<array1.length;i++)
			 
		 {
			 array2[i]=array1[i];
			 
		 }
		 System.out.println(Arrays.toString(array1));
		 System.out.println(Arrays.toString(array2));
	}

}
