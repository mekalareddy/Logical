//Write a java program to check even number (or) entered number is a perfect (or) not.

//Perfect Number ---> Sum of its divisors equal to itself.

package logics;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number:");	//28
		int num = sc.nextInt();
		int i = 1, sum = 0;

		while(i <= num/2)
		{
			if(num%i == 0)
				sum = sum+i;
			i++;
		}

		if(sum == num)
			System.out.println("number is a perfect");
		else
			System.out.println("number is not a perfect");

	}

}