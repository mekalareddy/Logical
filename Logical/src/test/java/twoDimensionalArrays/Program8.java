//Write a java program to rotate the square matrix into 90degrees left.

package twoDimensionalArrays;

public class Program8 {

	public static void main(String[] args) {

		Matrix m = new Matrix();

		System.out.println("Enter matrix elements");
		int a[][] = m.readMatrix();
		System.out.println("Entered elements of matrix : ");
		m.displayMatrix(a);

		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				int t = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = t;
			}
		}
		for(int i=0; i<a.length/2; i++) {
			for(int j=0; j<a[i].length; j++) {
				int t = a[i][j];
				a[i][j] = a[a.length-1-i][j];
				a[a.length-1-i][j] = t;
			}
		}

		System.out.println("After reversing 90degrees left : ");
		m.displayMatrix(a);
	}

}
