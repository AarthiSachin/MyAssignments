package week1.day2Assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] a = {1,2,3,4,7,6,8};
		// Sort the array	
		Arrays.sort(a);		
		// loop through the array (start i from arr[0] till the length of the array)
		for (int i=0; i<a.length; i++)
		{
			int num = i+1;
			if(num!=a[i])
			{
			System.out.println(num);
			break;
			}
		}
	}
}
