package Batch51JavaPrograms;

public class Asgn_75AverageArray {

	public static void main(String[] args)
	{
		double [] rollnumber = new double [4];
		rollnumber [0]=85;
		rollnumber [1]=55;
		rollnumber [2]=25;
		rollnumber [3]=15;
		double sum =0;
		double average=0;
		
		for (int i= 0 ; i<rollnumber.length; i++) // for (int i= 0 ; i<=rollnumber.length-1; i++)
		{
			sum=sum+rollnumber[i];
		}
		/* i=0, sum=0+85, sum 85;
		 * i=1, sum=85+55, sum 140;
		 * i=2, sum=140+25, sum 165;
		 * i=3, sum= 165+15, sum 180;
		 *
		 */
		
		
		System.out.println(sum);
		average=sum/rollnumber.length;
		System.out.print(average);
		
	}

}
