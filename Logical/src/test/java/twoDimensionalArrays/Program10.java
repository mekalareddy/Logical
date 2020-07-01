//Write a java program to display the matrix elements in spiral order.

package twoDimensionalArrays;

public class Program10 {

	public static void main(String[] args) {

		Matrix m = new Matrix();

		System.out.println("Enter matrix elements");
		int a[][] = m.readMatrix();
		System.out.println("Entered elements of matrix : ");
		m.displayMatrix(a);
		int n = a.length;
		System.out.println("Matrix size is : " + n);

		System.out.println("Matrix elements in spiral order : ");
		for(int i=0,j=n-1; i<j; i++,j--) {
			for(int k=i; k<j; k++) 
				System.out.println(a[i][k]);
			for(int k=i; k<j; k++) 
				System.out.println(a[k][j]);
			for(int k=j; k>i; k--) 
				System.out.println(a[j][k]);
			for(int k=j; k>i; k--) 
				System.out.println(a[k][i]);
		}
		if(n%2 == 1)
			System.out.println(a[n/2][n/2]);

	}

}
