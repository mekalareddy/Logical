//Write a java program to find column wise biggest element.

package twoDimensionalArrays;

public class Program4 {

	public static void main(String[] args) {

		Matrix m = new Matrix();

		System.out.println("Enter matrix elements");
		int a[][] = m.readMatrix();
		System.out.println("Entered elements of matrix : ");
		m.displayMatrix(a);

		for(int i=0; i<a[0].length; i++) {
			int cbig = a[0][i];
			for(int j=1; j<a.length; j++) {
				if(cbig < a[j][i])
					cbig = a[j][i];
			}
			System.out.println(i+1 +" column biggest element : " + cbig);
		}

	}

}
