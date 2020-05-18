package patterns;

public class Pattern5 {

	public static void main(String[] args) {

		int n=7;
		int spc = n/2;
		int str = 1;

		for(int i=0; i<n; i++)
		{
			for(int j=0; j<spc; j++)
			{
				System.out.print(" ");
			}

			for(int j=0; j<str; j++)
			{
				if(j==0||j==str-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			if(i<n/2)	
			{
				spc--;
				str=str+2;
			}
			else
			{
				spc++;
				str=str-2;
			}
			System.out.println();
		}

	}

}
