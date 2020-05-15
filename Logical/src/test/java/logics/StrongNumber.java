//Write a java program to check even number is strong (or) not?

//Strong Number : Sum of factorial of individual digits is equal to that number.

//---> 145
//---> 1!+4!+5!
//---> 1+24+120
//---> 145

package logics;

import java.util.Scanner;

public class StrongNumber {

	public static int fact(int n)
	{
		int f = 1;
		while(n>0)
		{
			f=f*n;
			n--;
		}
		return f;
	}

	public static boolean isStrong(int n)
	{
		int t = n;
		int sum = 0;
		while(n>0)
		{
			int r = n%10;
			sum = sum + fact(r);
			n=n/10;
		}

		/* if(t==sum)
			return true;
		else
			return false; */

		return t==sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		boolean res = isStrong(num);
		if(res)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");

	}

}