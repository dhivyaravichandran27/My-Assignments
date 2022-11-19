package week2.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		String str = "welcome to chennai";
		char c ='e';
		int count = 0;
		//convert strings to char
		char[] Array1 = str.toCharArray();
		int len = Array1.length;
		for(int i=0;i<len;i++)
		{
			if(c==Array1[i])
			{
				count++;
			}
		}
		System.out.println("Character " + c + " is displayed " + count +" times");
	}

}
