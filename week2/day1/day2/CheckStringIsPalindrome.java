package week2.day2;

public class CheckStringIsPalindrome {

	public static void main(String[] args) {
		String s1 = "madam";
		String s2 = "";

		int len = s1.length();

		for (int i = (len - 1); i >=0; --i) {
		  s2 = s2 + s1.charAt(i);
		}

		if (s1.equals(s2)) {
		  System.out.println(s1 + " is a Palindrome String.");
		}
		else {
		  System.out.println(s1 + " is not a Palindrome String.");
				
	}

}}


