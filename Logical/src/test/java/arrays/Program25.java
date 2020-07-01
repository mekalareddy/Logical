//Write a java program to find which word containing more vowels in the sentence

package arrays;

import java.util.Scanner;

public class Program25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the sentence : ");
		String st = sc.nextLine();
		System.out.println("Entered Sentence : "+ st);

		char ch[] = st.toCharArray();
		int vc = 0;
		String vw = " ";

		for(int i=0; i<ch.length; i++) {
			int c = 0;
			String w = " ";
			while(i<ch.length && ch[i] != ' ') {
				if(ch[i] == 'a' || ch[i] == 'A' || ch[i] == 'e' || ch[i] == 'E' || ch[i] == 'i' || ch[i] == 'I' || ch[i] == 'o' || ch[i] == 'O' || ch[i] == 'u' || ch[i] == 'U') {
					c++;
				}
				w = w+ch[i];
				i++;
			}
			if(vc<c) {
				vc = c;
				vw = w;
			}
		}

		System.out.println("Word '"+ vw + " ' contains more vowels and count is : " + vc);

	}

}
