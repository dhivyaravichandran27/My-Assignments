package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int series=10;
		for(int i=1;i<=series;i++)
		{
		if(i<series)
			{
			System.out.print(num1+",");
			}
		else
		    {
			System.out.println(num1);
		    }
		    int num3=num1+num2;
			num1=num2;
			num2=num3;
		}

	}

}
