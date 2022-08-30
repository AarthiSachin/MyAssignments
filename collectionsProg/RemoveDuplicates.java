package collectionsProg;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1 = "PayPal";
		String s = s1.toLowerCase();
		char[] ch = s.toCharArray();
		Set<Character> chSet = new HashSet<Character>();
		Set<Character> dupChSet = new HashSet<Character>();
		for (Character character : ch) 
		{
			if(!chSet.add(character))
			{
				dupChSet.add(character);
			}
			
		}
		System.out.println(chSet);
		System.out.println(dupChSet);
	}
}
