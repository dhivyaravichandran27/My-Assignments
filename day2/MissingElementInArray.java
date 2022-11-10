package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] values = {1,2,4,5,6};
		int len =values.length;
		Arrays.sort(values);
		for(int i=0;i<len;i++)
		{
			int x=i+1;			
					
			if(x!=values[i])
			{
				System.out.println(x);
				break;
			}
	
		}

	}

}
