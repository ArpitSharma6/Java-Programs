package Batch51JavaPrograms;
import java.util.Scanner;

public class Asgn_35CircumferenceofSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of Side ");
		Scanner s1= new Scanner(System.in);
		double side = s1.nextDouble();
		double circumference = 4*side;
		System.out.println(circumference);
		s1.close();
	}

}
