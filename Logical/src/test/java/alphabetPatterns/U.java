package alphabetPatterns;

public class U {

	public static void main(String[] args) {

		int n=5;

		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=n/2; j++)
			{
				if(j==0 || j==n/2 || i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}