//Write a java program to count the no of occurrence of each element in the array.

package arrays;

import java.util.Scanner;

public class Program10 {

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

	static int[] delDup(int ar[]) {
		for(int i=0; i<ar.length-1; i++) {
			int count = 1;
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i] == ar[j]) {
					count++;
					ar = delete(ar, j);
					j--;
				}
			}
			System.out.println(ar[i] + " occured " + count + " times ");
		}
		return ar;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Elememts : ");
		int ar[] = readArray();
		System.out.println("Entered Elements : ");
		display(ar);
		
		delDup(ar);
		
	}
}
