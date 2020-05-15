//Write a program to check entered year is leap year (or) not.

package logics;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		
		int year = sc.nextInt();
		leap_check(year);
		
	}

	public static void leap_check(int y)
	{
		
		if((y%4 == 0 && y%100 != 0) || y%400 == 0)
			System.out.println("It's a Leap Year!");
		else
			System.out.println("Not a Leap Year");

	}

}