//Write a java program to find the sum of odd numbers & even numbers from the 'n' number of elements. 

package arrays;

import java.util.Scanner;

public class Program1 {

	static int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values to enter");
		int n = sc.nextInt();
		int ele[] = new int[n];
		System.out.println("Enter "+ n +" Elements");

		for(int i = 0; i<ele.length; i++)
		{
			ele[i] = sc.nextInt();
		}
		return ele;
	}

	static void display(int a[]) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]+",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] ar;
		ar = readArray();
		System.out.println("Entered Array");
		display(ar);
		int esum = 0;
		int osum = 0;

		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2 == 0)
				esum+=ar[i];
			else
				osum=osum+ar[i];
		}

		System.out.println("Sum of even no : " + esum);
		System.out.println("Sum of odd no : " + osum);
	}
}
