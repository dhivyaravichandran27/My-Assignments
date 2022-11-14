package week2.challenge;

public class JavaChallenge1 {

	public static void main(String[] args) {
		String s1 = "Hello World";
	    String[] w1=s1.split(" ");
	    int len1= w1.length;
	     int length1 = w1[len1-1].length();
	   System.out.println("The last word is " +w1[len1-1]+" with length "+length1);
	   
	   String s2 = "   fly me   to   the moon  ";
	    String[] w2=s2.split(" ");
	    int len2= w2.length;
	     int length2 = w2[len2-1].length();
	   System.out.println("The last word is " +w2[len2-1]+" with length "+length2);
	   
	   String s3 = "luffy is still joyboy ";
	    String[] w3=s3.split(" ");
	    int len3= w3.length;
	     int length3 = w3[len3-1].length();
	   System.out.println("The last word is " +w3[len3-1]+" with length "+length3);
	   
	   
	}

}
