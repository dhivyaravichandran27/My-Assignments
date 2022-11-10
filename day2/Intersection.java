package week1.day2;

public class Intersection {

	public static void main(String[] args) {
		int[] values1= {20, 40, 60, 30, 55};
		int[] values2= {55, 20, 46, 10, 40};
		int len1 =values1.length;
		int len2 =values2.length;
		for(int i=0;i<len1;i++)
		{
			for(int j=0;j<len2;j++)
			{
			if(values1[i]==values2[j])
				{if(i<len1-1)
			{System.out.print(values1[i]+",");}
				else
				System.out.print(values1[i]);	
				}
		}
	}
}
}
