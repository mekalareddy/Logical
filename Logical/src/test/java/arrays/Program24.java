//Write a java program to calculate the sum of digits in the string.

package arrays;

import java.util.Scanner;

public class Program24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String : ");
		String st = sc.nextLine();
		System.out.println("Entered String : "+ st);

		char ch[] = st.toCharArray();
		int sum = 0;
		
		for(int i=0; i<ch.length; i++) {
			if(i==0 || ch[i] != ' ' && ch[i-1] == ' ') {
				sum=i;
			}
			if(ch[i] >= 48 && ch[i] <= 57) {
				sum = sum + (ch[i]-48);
			}
		}

		System.out.println("Sum of digits in the string : "+ sum);

	}
}
