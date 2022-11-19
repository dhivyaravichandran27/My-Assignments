package week2.day2;

import java.util.Arrays;

public class IsAnagram {

	public static void main(String[] args) {
		//Declare a String 
		String text1 = "stops";
	    String text2 = "potss"; 
	    int len1 = text1.length();
	    int len2 = text2.length();
	    if(len1==len2)
	    {
	    //convert strings to char
	    	char[] charArray1 = text1.toCharArray();
	    	char[] charArray2 = text2.toCharArray();
	    //sort the array
	    	Arrays.sort(charArray1);
	    	Arrays.sort(charArray2);
	    if(Arrays.equals(charArray1,charArray2))
	    {
	    	System.out.println("Both string is Anagram");
	    }
	    else
	    {
	    	System.out.println("Both string is not Anagram");
	    }
	    }
	    else {
	    	System.out.println("string not Anagram");
	}

}
}
