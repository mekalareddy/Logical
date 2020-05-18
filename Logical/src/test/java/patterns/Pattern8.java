package patterns;

public class Pattern8 {

	public static void main(String[] args) {

		int n=5;
		int spc = n/2;
		int str = 1;

		for(int i=0; i<n; i++)
		{
			for(int j=0; j<spc; j++)
			{
				System.out.print(" ");
			}

			int k=1;
			for(int j=0; j<str; j++)
			{
				System.out.print(k);
				if(j<str/2)
					k++;
				else
					k--;
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
