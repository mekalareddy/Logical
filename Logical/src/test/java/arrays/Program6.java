//Write a java program to swap first half array elements with second half

package arrays;

import java.util.Scanner;

public class Program6 {

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

		System.out.println("Enter Array Elememts : ");
		int a[] = readArray();
		System.out.println("Entered Elements");
		display(a);

		for(int i=0; i<a.length/2; i++) {
			int t = a[i];
			a[i] = a[a.length/2 + i];
			a[a.length/2 + i] = t;
		}
		display(a);
	}

}
