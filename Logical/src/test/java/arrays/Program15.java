//Write a java program to count the missing of each character in the given string.

package arrays;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String : ");
		String st = sc.nextLine();
		System.out.println("Entered String : "+ st);

		char ch[] = st.toCharArray();
		int rs[] = new int[129];

		for(int i = 0; i<ch.length; i++) {
			rs[ch[i]]++;
		}
		
		System.out.println("missing of each character in the given string : ");

		for(int i = 1; i<rs.length; i++) {			
			if(rs[i]==0) {
				System.out.println((char)i + " ---> " + rs[i]);
			}
		}

	}

}
