//Write a java program to reverse the column elements.

package twoDimensionalArrays;

public class Program7 {

	public static void main(String[] args) {

		Matrix m = new Matrix();

		System.out.println("Enter matrix elements");
		int a[][] = m.readMatrix();
		System.out.println("Entered elements of matrix : ");
		m.displayMatrix(a);

		for(int i=0; i<a.length/2; i++) {
			for(int j=0; j<a[i].length; j++) {
				int t = a[i][j];
				a[i][j] = a[a.length-1-i][j];
				a[a.length-1-i][j] = t;
			}
		}
		System.out.println("After reversing the column elements : ");
		m.displayMatrix(a);
	}

}
