package week1.day2Assignments;

public class Fibonocci {

	public static void main(String[] args) {
		/*
		 * Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0) Print
		 * first number Iterate from 1 to the 11 Add first and second number assign to
		 * sum Assign second number to the first number Assign sum to the second number
		 * Print sum
		 */
		int firstNum = 0, secNum = 1, sum = 0;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=1; i<11; i++)
		{
			sum = firstNum + secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;}	
	}
}
