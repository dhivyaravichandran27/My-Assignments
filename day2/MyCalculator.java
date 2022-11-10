package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator arithmetic = new Calculator();
		int sumResult = arithmetic.add(60,40,20);
		int subResult = arithmetic.sub(60,40);
		double mulResult =arithmetic.mul(2.5, 2.5);
		float divResult =arithmetic.divide(6.25F, 2.5F);
		
	System.out.println("Addition="+sumResult);
	System.out.println("Subtraction="+subResult);
	System.out.println("Multiplication="+mulResult);
	System.out.println("Division="+divResult);
		
		
		
		

	}

}
