package patterns;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {

		String st = "GOVA";

		int n = st.length();

		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(st.charAt(j)+" ");
			}
			System.out.println();
		}
	}

}

//***** (or) *****

//public class Pattern17 {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter String");
//
//		String name = sc.next();
//
//		int n = name.length();
//
//		for(int i=0; i<n; i++)
//		{
//			for(int j=0; j<=i; j++)
//			{
//				System.out.print(name.charAt(j)+" ");
//			}
//			System.out.println();
//		}
//	}
//
//}