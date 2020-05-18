package patterns;

public class Pattern1 {

	public static void main(String[] args) {

		int n = 5;

		for(int i=0; i<n; i++)	//No of lines
		{
			for(int j=0; j<=i; j++)	//No of elements in each line
			{
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
