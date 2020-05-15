//Write a program to count how many leap years after christ to till now.

//logic = currentYear/4 - currentYear/100 + currentYear/400;

package logics;

import java.util.Date;

public class LeapYears {

	public static void main(String[] args) {

		Date d = new Date();
		int year = d.getYear();
		int currentYear = year+1900; 	//To get current year add 1900 to the value of year obtained from this date object

		System.out.println("Current Year is : "+currentYear);

		int count = 0;

		for(int i = 0; i<=currentYear; i++)
		{
			if((i%4 == 0 && i%100 != 0) || i%400 == 0)
			{
				System.out.println(i + " is a Leap Year!");
				count++;
			}	
		}

		System.out.println("Total Leap Years after christ to till now is : " + count);
	}

}