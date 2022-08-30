package collectionsProg;

//import java.util.ArrayList;
//import java.util.List;

public class DuplicateAndUnique {

	public static void main(String[] args) 
	{
		int[] data = {4,3,6,8,29,3,1,2,4,7,8};
		for (int i = 0; i < data.length; i++) 
		{
			for (int j = i+1; j < data.length; j++) 
			{
				if(data[i]==data[j])
				{
					System.out.println("The duplicate values are : "+data[j]);
				}
			}
		}
	}
}
