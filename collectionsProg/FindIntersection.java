package collectionsProg;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[] = {3,2,11,4,6,7};
		int b[] = {1,2,8,4,9,7};
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> m = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) 
		{
			l.add(a[i]);
		}
		for (int j = 0; j < a.length; j++) 
		{
			m.add(b[j]);
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				if(l.get(i)==m.get(j))
				{
					System.out.println(l.get(i));
				}
			}
		}
	}
}
