package Batch51JavaPrograms;
import java.util.Scanner;

public class Asgn_31Circumfrenceofcircle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the value of radius");
		Scanner s1 =new Scanner(System.in);
		double radius = s1.nextDouble();
		double circumference = 2*3.14*radius;
		
		System.out.println(circumference);
		s1.close();
		
	}

}
