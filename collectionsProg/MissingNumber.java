package collectionsProg;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) 
	{
		int[] data = {11,3,2,1,4,12,6,5,9,7,10};
		Set<Integer> m = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) 
		{
			m.add(data[i]);
		}	
		List<Integer> l = new ArrayList<Integer>(m);
		for (int i = 1; i <= l.size(); i++)                      
		{
			if(i!=l.get(i-1))							
			{
				System.out.println(i);
				break;
			}
		}
		}
}
