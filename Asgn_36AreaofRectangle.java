package Batch51JavaPrograms;
import java.util.Scanner;

public class Asgn_36AreaofRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of length");
		Scanner s1 = new Scanner(System.in);
		double length = s1.nextDouble();
		System.out.println("Enter the value of Breadth");
		double breadth = s1.nextDouble();
		double area = length * breadth ;
		System.out.println("The area of rectangle is: " + area);
		s1.close();
	}

}
