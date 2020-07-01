//Write a java program to transpose the square matrix.

package twoDimensionalArrays;

public class Program2 {

	public static void main(String[] args) {

		Matrix m = new Matrix();

		System.out.println("Enter matrix elements");
		int a[][] = m.readMatrix();
		System.out.println("Entered elements of matrix : ");
		m.displayMatrix(a);

		System.out.println("After Transpose");
		a = m.transposeMatrix(a);
		System.out.println("Transpose of square matrix is : ");
		m.displayMatrix(a);
	}

}
