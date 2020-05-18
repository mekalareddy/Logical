package patterns;

public class Pattern13 {
	
	public static void main(String[] args) {
		
		int n=6;
		char ch='a';
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		
	}
	
}
