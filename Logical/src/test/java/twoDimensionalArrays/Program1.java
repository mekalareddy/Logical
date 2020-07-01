//Write a java program to add elements to matrix.

package twoDimensionalArrays;

public class Program1 {

	public static void main(String[] args) {

		Matrix m = new Matrix();

		System.out.println("Enter 1st matrix elements");
		int a[][] = m.readMatrix();
		System.out.println("Enter 2nd matrix elements");
		int b[][] = m.readMatrix();

		System.out.println("Entered elements of matrix1 : ");
		m.displayMatrix(a);
		System.out.println("Entered elements of matrix2 : ");
		m.displayMatrix(b);

		int res[][] = m.addMatrix(a, b);
		if(res != null) {
			System.out.println("Added matrix elements : ");
			m.displayMatrix(res);
			return;
		}

		System.out.println("Not possible to add.");

	}

}
