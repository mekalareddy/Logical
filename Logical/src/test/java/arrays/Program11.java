//Write a java program to display the missing elements in the sorted array.

package arrays;

import java.util.Scanner;

public class Program11 {

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

		System.out.println("Missing Elements : ");
		
		for(int i=0; i<ar.length-1; i++) {
			for(int j = ar[i]+1; j<ar[i+1]; j++) {
				System.out.println(j);
			}
		}

	}

}
