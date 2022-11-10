package week1.day2;

public class ArmstrongNumber {
	public int powerValue(int power)
	{
		 int count = 0;
		while(power>0)
		{
		power=power/10;
		count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int num = 9474;
		int input = num;
		double output =0;
		while(num>0)
		{
			int rem = num%10;
			ArmstrongNumber obj = new ArmstrongNumber();	
			int n = obj.powerValue(input);
			output=output + Math.pow(rem,n);
			num=num/10;
		}
       if(input==output)
       {
    	   System.out.println(input+" is Armstrong number");
       }
       else
       {
    	   System.out.println(input+" is not Armstrong number");
       }
	}

}
