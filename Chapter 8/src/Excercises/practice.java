package Excercises;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
	
	
	public static void main(String[] args){
	
		int total = 0;
		
	
		int[] A = all();
		int[] E = allF(A);
		int[] D = allR(A);
		int[] C = sum(A, total);
		int[] B = avg(A, total);

		
		
		Scanner input = new Scanner(System.in);
		
		
		
		
		
		
	}
	public static int[] all(){
		Scanner input = new Scanner(System.in);
		
		int[] A = new int[5];
        for (int i = 0; i < A.length; i++)
		{
			System.out.println("Enter a number >> ");
			A[i] = input.nextInt();

		}
        return A;
    }
	public static int[] sum(int A[], int total){
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < A.length; i++)
		{
			total = total + A[i];

		}
		System.out.println("The total is " + total + "\n");
		
		
		return A;
        

    }
	public static int[] allR(int A[]){
		
		Scanner input = new Scanner(System.in);
		for (int j = 19; j >= 0; j--)
		{
			
			System.out.println("Reverse " + A[j] + "\n");
		}
        return A;
    }
	public static int[] allF(int A[]){
		
		Scanner input = new Scanner(System.in);
		for (int j = 0; j < A.length; j++)
		{
			
			System.out.println("Regular " + A[j] + "\n");
		}
        return A;
    }
	public static int[] avg(int A[], int total){
		
		double avg;
		
		Scanner input = new Scanner(System.in);
        
		avg = total / A.length;
		
		System.out.println("The average is " + avg);
		
        return A;
    }
}
