package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
		String companyName = "google";
		
        char[] charArray = companyName.toCharArray();
        System.out.println(charArray);
        Set<Character>unique=new HashSet<Character>();
        for(int i=0;i<charArray.length;i++)
        {
        	unique.add(charArray[i]);
        }
        
        System.out.println("Unique characters in string" + unique);
	}

}
