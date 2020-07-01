//Write a java program to reverse the words in a sentence

package arrays;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String : ");
		String st = sc.nextLine();
		System.out.println("Entered String : "+ st);

		char ch[] = st.toCharArray();

		st = " ";

		for(int i = 0; i<=ch.length; i++) {

			int k=i;
			while(i<ch.length && ch[i]!=' ' && ch[i]!='.' && ch[i] != ',') {
				i++;
			}

			int j = i-1;
			while(j>=k) {
				st=st+ch[j];
				j--;
			}

			if(i<ch.length) {
				st=st+ch[i];
			}
		}	
		System.out.println("Reversed string is :" + st);
	}
}
