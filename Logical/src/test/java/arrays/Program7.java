//Write a java program to delete specified elements through index.

package arrays;

import java.util.Scanner;

public class Program7 {

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

	static int[] delete(int ar[], int in) {

		if(in<0 || in>=ar.length) {
			System.out.println("index out of bound");
			return ar;
		}

		int res[] = new int[ar.length-1];
		for(int i = 0; i<res.length; i++) {
			if(i<in) {
				res[i] = ar[i];
			}
			else {
				res[i] = ar[i+1];
			}
		}
		return res;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Elememts : ");
		int a[] = readArray();
		System.out.println("Entered Elements : ");
		display(a);
		System.out.println("Enter index to delete specific elememts : ");
		int e = sc.nextInt();
		System.out.println("Entered index : " + e);

		a = delete(a, e);
		System.out.println("After delete : ");
		display(a);

	}

}
