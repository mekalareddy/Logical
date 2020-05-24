package conversions;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		String bin = " ";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Decimal Number : ");

		int n = sc.nextInt();

		while(n>0)
		{
			int r = n%2;
			bin = r+bin;
			n = n/2;
		}
		System.out.println("Binary Number is : " + bin);
	}

}
