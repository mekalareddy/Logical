package codelity;

public class CountBallons 
{ 

	public static void main(String[] args) 
	{ 
		String txt = "BAOOLLNNOLOLGBAX";		 
		String pat = "BALLOON";		 
		System.out.println(countFreq(pat, txt));		 
	} 

	public static int countFreq(String pat, String txt) 
	{		 
		int M = pat.length();		 
		int N = txt.length();		 
		int res = 0; 

		StringBuilder builder = new StringBuilder(txt);

		for (int i = 0; i <= N-M; i++) 
		{ 		 
			int j;
			for (j = 0; j < M; j++) 
			{ 
				if (txt.charAt(i + j) != pat.charAt(j)) 
				{ 
					builder.deleteCharAt(j);
					break; 
				} 
			} 


			if (j == M) 
			{		

				res++;				 
				j = 0;				 
			}			 
		}		 
		return res;		 
	} 

}