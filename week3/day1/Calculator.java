package week3.day1;

public class Calculator {
	public void add(int n1,int n2) {
		System.out.println("Addition of two integer="+(n1+n2));
	}
	public void add(int n3,int n4,int n5) {
		System.out.println("Addition of two integer="+(n3+n4+n5));
	}
	public void sub(double n1,double n2) {
		System.out.println("Subtract of 2 double number="+(n1-n2));
	}
	public void sub(int n3,int n4) {
		System.out.println("Subtract of 2 integer="+ (n3-n4));
	}
	public void mul(int n1,double n2) {
		System.out.println("multiplication of 1 int and 1 double =" + (n1*n2));
	}
	public void mul(double n1,double n2) {
		System.out.println("multiplication of 2 double value=" + (n1*n2));
	}
	
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(4, 5);
		cal.add(5, 5, 5);
		cal.sub(10.5, 5.5);
		cal.sub(20, 2);
		cal.mul(2.5, 2.5);
		cal.mul(2, 2.5);
		

	}

}
