package week1.day1;

public class NegativeToPositive {
	public static void main(String[] args) {
		/*
		*Problem statement: Convert a negative number to positive number
		 * Pseudocode: 
		 * 1. Initialize an integer with a negative number like,
		 * int number = -40;
		 * 2. Check if the number is a negative number 
		 * Hint : any number that is lesser than zero is a negative number 
		 * 3. If so, convert the number to a positive number
		 * 4. Print the converted positive number
		 */
		int a = 100;
		if(a<0)
		{
			a=a*(-1);
			System.out.println(a);
		}
		else
		{
		System.out.println(a);
	}
		
}
}