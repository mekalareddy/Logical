package conversions;

import java.util.Scanner;

public class HexaDecimalToDecimal {

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

		System.out.println("Enter HexaDecimal Number : ");

		String num = sc.next();

		int count = 0, sum = 0;

		for(int i=num.length()-1; i>=0; i--)
		{
			char ch = num.charAt(i);

			if(ch>=65 && ch<=90)
				sum = sum+(ch-55)*Pow(16,count);
			else if(ch>=97 && ch<=122)
				sum = sum+(ch-87)*Pow(16,count);
			else
				sum = sum+(ch-48)*Pow(16,count);

			count++;
		}
		System.out.println("Decimal Number is : " + sum);
	}

}
