package patterns;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String");

		String name = sc.nextLine();

		int n = name.length();

		int count = 0;

		for(int i=0; true; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(name.charAt(count)+" ");
				count++;
				if(count==n)
					return;
			}
			System.out.println();
		}
	}

}
