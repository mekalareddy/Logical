//Write a java program to interchange the first & last character of every word in the sentence.

package arrays;

import java.util.Scanner;

public class Program23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Sentence : ");
		String st = sc.nextLine();
		System.out.println("Entered Sentence : "+ st);

		char ch[] = st.toCharArray();
		int k = 0;

		for(int i=0; i<ch.length; i++) {
			if(i==0 || ch[i] != ' ' && ch[i-1] == ' ') {
				k=i;
			}
			if((i<ch.length-1 && ch[i] != ' ' && ch[i+1] == ' ') || i == ch.length-1) {
				char c = ch[i];
				ch[i] = ch[k];
				ch[k] = c;
			}
		}

		st = new String(ch);
		System.out.println("Interchanged Sentence : "+ st);
	}

}
