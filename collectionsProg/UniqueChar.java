package collectionsProg;

import java.util.Set;
import java.util.TreeSet;

public class UniqueChar {

	public static void main(String[] args) 
	{
		String s1 = "Rithanya";
		String s = s1.toLowerCase();
		char[] c = s.toCharArray();
		Set<Character> charSet = new TreeSet<Character>();
		for(Character name1 : c) {
			charSet.add(name1);
		}
		System.out.println(charSet);
	}
}
