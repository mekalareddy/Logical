//Write a java program to reverse the diagonal elements.

package twoDimensionalArrays;

public class Program5 {

	public static void main(String[] args) {

		Matrix m = new Matrix();

		System.out.println("Enter matrix elements");
		int a[][] = m.readMatrix();
		System.out.println("Entered elements of matrix : ");
		m.displayMatrix(a);
		int n = a.length;
		System.out.println("Matrix size is : " + n);

		for(int i=0; i<n/2; i++) {
			for(int j=0; j<n; j++) {
				if(i == j) {
					int t = a[i][j];
					a[i][j] = a[n-1-i][n-1-j];
					a[n-1-i][n-1-j] = t;
				}
				if(i+j == n-1) {
					int t = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = t;
				}
			}
		}
		System.out.println("After reversing the diagonal elements : ");
		m.displayMatrix(a);
	}
}
