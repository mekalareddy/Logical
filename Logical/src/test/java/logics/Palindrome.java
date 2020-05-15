//Write a program to find a number is a Palindrome

package logics;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int num = sc.nextInt();
		int rev = rev_num(num);
		
		if(num==rev)
			System.out.println(num + " is a palindrome");
		else
			System.out.println(num + " is not a palindrome");
		
	}

	public static int rev_num(int n)
	{
		int rev = 0;
		while(n>0)
		{
			int r = n%10;		//n%10 ---> To get last 1 digit.
			rev = rev*10+r;		//n%100 ---> To get last 2 digits.
			n=n/10;				//n%1000 ---> To get last 3 digits.
		}
		return rev;
	}
	
}