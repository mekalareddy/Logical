package patterns;

public class Pattern3 {

	public static void main(String[] args) {

		int n = 5;

		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-1-i; j++)
			{
				System.out.print(" ");
			}

			for(int j=0; j<2*i+1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

//***** (or) *****

//public class Pattern3 {
//
//	public static void main(String[] args) {
//
//		int n = 5;
//		int spc = n-1;
//		int str = 1;
//
//		for(int i=0; i<n; i++)
//		{
//			for(int j=0; j<spc; j++)
//			{
//				System.out.print(" ");
//			}
//
//			for(int j=0; j<str; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			str = str+2;
//			spc = spc-1;
//		}
//
//	}
//
//}