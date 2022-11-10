package week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
	int[] values = {20, 10, 50, 60, 30};
	int noOfData = values.length;
	Arrays.sort(values);
	int i= noOfData-2;
	{
		System.out.println("second largest number is "+values[i]);
	}

	}

}
