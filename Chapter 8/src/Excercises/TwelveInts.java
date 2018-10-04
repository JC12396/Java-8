package Excercises;

public class TwelveInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] string = {"This ", "is ", "a ", "string ", "array"};
		
		int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		
		System.out.println("Print numbers first to last.");
	
		for (int i = 0; i < numArray.length; i++)
		{
			System.out.println(numArray[i]);
			total1 = total1 + numArray[i];
		}
		System.out.println("Print numbers last to first.");
		for (int j = 11; j >= 0; j--) 
		{
			System.out.println(numArray[j]);
			total2 = total2 + numArray[j];
		}
		
		
		total3 = total2 + total1;
		
		System.out.println("The total 1 is: " + total1);
		System.out.println("The total 2 is: " + total2);
		System.out.println("The total 3 is: " + total3);
	
		for (int z = 0; z < string.length; z++)
		{
			System.out.print(string[z]);
		}
		
		
	}

}
