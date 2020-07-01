//Write a java program to find the biggest sum of two continuous numbers in the array.

package arrays;

import java.util.Scanner;

public class Program4 {

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
		
		System.out.println("Enter Array Elements");
		int a[] = readArray();
		System.out.println("Entered Elements");
		display(a);

		int bsum = a[0] + a[1];
		int k = 0;

		for(int i=1; i < a.length-1; i++) {
			if(bsum < a[i] + a[i+1]) {
				bsum = a[i] + a[i+1];
				k=i;
			}
		}

		System.out.println("sum = "+bsum);
		System.out.println(a[k] + " and " + a[k+1]);
	}

}
