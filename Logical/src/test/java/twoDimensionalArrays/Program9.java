//Write a java program to rotate the square matrix into 90degrees right.

package twoDimensionalArrays;

public class Program9 {

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
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length/2; j++) {
				int t = a[i][j];
				a[i][j] = a[i][a[i].length-1-j];
				a[i][a[i].length-1-j] = t;
			}
		}

		System.out.println("After reversing 90degrees right : ");
		m.displayMatrix(a);
	}


}
