package patterns;

public class Pattern12 {
	
	public static void main(String[] args) {
		
		int n=6;
		
		for(int i=0; i<n; i++)
		{
			char ch='a';
			for(int j=0; j<=i; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		
	}
	
}
