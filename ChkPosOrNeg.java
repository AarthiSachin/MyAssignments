package week1.day1;

public class ChkPosOrNeg {
	public static void main(String[] args) {
		
		//Problem statement: Check if the number is positive or negative
		/*Pseudocode 
		 * 1. Initialize a number, say, int number= 35; 
		 * 2. If a number is positive, print "The number is positive"
		 * If a number is negative, print "The number is negative" 
		 * If it nether negative nor positive, print as
		 * "The number is neither positive nor negative"
		 */
		int num = -25;
		if(num<0) {System.out.println("The Number is negative");}
		else if(num>0 ) {System.out.println("The Number is positive");}
		else {System.out.println(" The number is neither positive nor negative");}
	}
}
