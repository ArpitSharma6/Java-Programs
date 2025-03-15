package Batch51JavaPrograms;
import java.util.Scanner;

public class Asgn_33Circumferenceoftriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the value of length");
		Scanner s1= new Scanner(System.in);
		double length = s1.nextDouble();
		System.out.println("Enter the value of base ");
		double base = s1.nextDouble();
		System.out.println("Enter the value of height");
		double height = s1.nextDouble();
		
		double circumference = length + base + height;
		
		System.out.println(circumference);
		
		
	}

}
