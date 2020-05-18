package patterns;

public class Pattern11 {
	
	public static void main(String[] args) {
		
		int n=6;
		int count=1;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(count%2+" ");
				count++;
			}
			System.out.println();
		}
		
	}
	
}
