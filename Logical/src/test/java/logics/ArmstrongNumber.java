//Write a java program to check entered number is armstrong (or) not

//Armstrong Number : Sum of power of number of individual digits of numbers in a number.

package logics;

import java.util.Scanner;

public class ArmstrongNumber {

	static int pow(int n, int p) {
		int PW = 1;
		while(p>0) {
			PW = PW*n;
			p--;
		}
		return PW;
	}

	static int getCount(int n) {
		int count = 0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();

		int c = getCount(num);
		int t = num;

		int sum = 0;
		while(t>0) {
			int r = t%10;
			sum = sum + pow(r, c);
			t = t/10;
		}

		if(sum == num)
			System.out.println(num + " is a armstrong number");
		else
			System.out.println(num + " is not a armstrong number");
	}

}
