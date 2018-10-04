package Practice;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] nums = new double[5];
		
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < nums.length; i++)
		{
			System.out.println("Enter a number >> ");
			nums[i] = input.nextDouble();
			
			
		}
		System.out.println("The output is: ");
		for (int j = 4; j >= 0; j--)
		{
			System.out.println(nums[j]);
		}
	}

}
