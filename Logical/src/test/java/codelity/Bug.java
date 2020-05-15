package codelity;

public class Bug
{
	public static void main(String[] args) 
	{
		int ans = 0;
		int[] A = {1,2,2,2,2,1,2};
		for (int i = 0; i < A.length; i++) 
		{
			if (ans > A[i]) 
			{
				ans = A[i];
			}           
		}
		System.out.println("Smallest element  is " + ans);
	}
}