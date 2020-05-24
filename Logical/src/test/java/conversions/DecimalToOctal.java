package conversions;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {

		String oc = " ";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Decimal Number : ");

		int n = sc.nextInt();

		while(n>0)
		{
			int r = n%8;
			oc = r+oc;
			n = n/8;
		}
		System.out.println("Octal Number is : " + oc);
	}

}
