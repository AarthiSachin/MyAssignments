package collectionsProg;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) 
	{
		int[] data = {3,2,11,4,10,6,7,2,3,3,6,7};
		Set<Integer> s = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) 
		{
			s.add(data[i]);
			
		}
		List<Integer> l = new ArrayList<Integer>(s);
		System.out.println(l.get(l.size()-2));

	}

}
