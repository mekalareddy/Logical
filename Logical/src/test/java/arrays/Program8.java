//Write a java program to display the missing elements in a array without comparison.

package arrays;

import java.util.Scanner;

public class Program8 {

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

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Elememts : ");
		int ar[] = readArray();
		System.out.println("Entered Elements : ");
		display(ar);

		int res[] = new int[ar.length];

		for(int i=0; i<res.length; i++) {
			res[ar[i]]++;
		}

		System.out.println("Missing Elements : ");

		for(int i=0; i<res.length; i++) {
			if(res[i] == 0) {
				System.out.println(i);
			}
		}
	}
}
