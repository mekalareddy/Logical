//Write a java program to merge two arrays in zigzag manner

package arrays;

import java.util.Scanner;

public class Program3 {

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

		System.out.println("Enter first array elements : ");
		int a[] = readArray();
		System.out.println("Enter second array elements : ");
		int b[] = readArray();

		System.out.println("Entered First Array Elements");
		display(a);
		System.out.println("Entered Second Array Elements");
		display(b);

		int c[] = new int[a.length + b.length];
		int k=0, i =0;

		for( ; i<a.length && i<b.length; i++) {
			c[k] = a[i];
			k++;
			c[k] = b[i];
			k++;
		}

		for( ; i<a.length; i++) {
			c[k] = a[i];
			k++;
		}

		for( ; i<b.length; i++) {
			c[k] = a[i];
			k++;
		}

		System.out.println("After merge two arrays in zigzag manner : ");
		display(c);

	}
}
