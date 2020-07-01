//Write a java program to find row wise biggest element.

package twoDimensionalArrays;

public class Program3 {

	public static void main(String[] args) {

		Matrix m = new Matrix();

		System.out.println("Enter matrix elements");
		int a[][] = m.readMatrix();
		System.out.println("Entered elements of matrix : ");
		m.displayMatrix(a);

		for(int i=0; i<a.length; i++) {
			int fbig = a[i][0];
			for(int j=1; j<a.length; j++) {
				if(fbig < a[i][j])
					fbig = a[i][j];
			}
			System.out.println(i+1 +" row biggest element : " + fbig);
		}

	}

}
