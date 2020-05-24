package conversions;

import java.util.Scanner;

public class DecimalToAny {

	public static String Convert(int n, int b) {
		String st = " ";

		while(n>0)
		{
			int r = n%b;
			if(r<10)
				st = r+st;
			else
				st = (char)(r+55)+st;	//Casting
			n = n/b;
		}
		return st;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Decimal number : ");

		int n = sc.nextInt();

		System.out.println("Hexa Decimal is : " + Convert(n,16));
		System.out.println("Octa Decimal is : " + Convert(n,8));
		System.out.println("Binary Equalent is : " + Convert(n,2));
		System.out.println("5 Base Equalent is : " + Convert(n,5));

	}

}
