package Excercises;

import java.util.Scanner;

public class DistanceFromAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] nums = new double[20];
		double total = 0;
		double avg= 0;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < nums.length; i++)
		{
			System.out.println("Enter a number >> ");
			nums[i] = input.nextDouble();
			total = total + nums[i];
			avg = total / i;
		}
		
		System.out.println("The total is: " + total);
		System.out.println("The average is: " + avg);
		for (int j = 19; j >= 0; j--)
		{
			
			System.out.println(nums[j]);
		}
	}

}
