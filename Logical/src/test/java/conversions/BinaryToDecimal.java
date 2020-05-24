package conversions;

import java.util.Scanner;

public class BinaryToDecimal {

	public static int Pow(int n,int p) {

		int pw = 1;

		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Binary Number : ");

		int bin = sc.nextInt();

		int dec = 0;

		int count = 0;

		while(bin>0)
		{
			int r = bin%10;
			dec = dec+r*Pow(2,count);
			count++;
			bin=bin/10;
		}
		System.out.println("Decimal Number is : " + dec);
	}

}
