//Write a java program to reverse the row elements.

package twoDimensionalArrays;

public class Program6 {

	public static void main(String[] args) {

		Matrix m = new Matrix();

		System.out.println("Enter matrix elements");
		int a[][] = m.readMatrix();
		System.out.println("Entered elements of matrix : ");
		m.displayMatrix(a);

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length/2; j++) {
				int t = a[i][j];
				a[i][j] = a[i][a[i].length-1-j];
				a[i][a[i].length-1-j] = t;
			}
		}
		System.out.println("After reversing the row elements : ");
		m.displayMatrix(a);
	}

}
