package conversions;

import java.util.Scanner;

public class DecimalToHexaDecimal {

	public static void main(String[] args) {

		String hex = " ";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Decimal Number : ");

		int n = sc.nextInt();

		while(n>0)
		{
			int r = n%16;
			if(r<10)
				hex = r+hex;
			else
				hex=(char)(r+55)+hex;	//Casting
			n = n/16;
		}
		System.out.println("HexaDecimal Number is : " + hex);
	}
}
