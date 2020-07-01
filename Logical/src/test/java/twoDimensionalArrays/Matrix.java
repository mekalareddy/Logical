//Write a java program to add to matrix

package twoDimensionalArrays;

import java.util.Scanner;

public class Matrix {

	int[][] readMatrix(){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of rows : ");
		int m = sc.nextInt();
		System.out.println("Enter no of columns : ");
		int n = sc.nextInt();

		int ar[][] = new int[m][n];
		System.out.println("Enter " + m*n + " Elements : ");

		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		return ar;
	}
	void displayMatrix(int ar[][]) {
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.println(ar[i][j]+" ");
			}
			System.out.println();
		}

	}

	int[][] addMatrix(int[][] a, int[][] b){
		if(a.length == b.length && a[0].length == b[0].length) {
			for(int i=0; i<b.length; i++) {
				for(int j=0; j<b[i].length; j++) {
					a[i][j] = a[i][j] + b[i][j];
				}
			}
			return a;
		}
		return null;
	}
	
	int[][] transposeMatrix(int a[][]){
		for(int i=0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				int t = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = t;
			}
		}
		return a;
	}

}
