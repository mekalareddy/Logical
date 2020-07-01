//Write a java program to count no of words in the sentence

package arrays;

import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String : ");
		String st = sc.nextLine();
		System.out.println("Entered String : "+ st);

		char ch[] = st.toCharArray();
		int count = 1;

		for(int i = 1; i<ch.length; i++) {
			if((ch[i] == ' ' && ch[i-1] != ' ' &&  ch[i-1] != ',' && ch[i-1] != '.') ) {
				count++;
			}
		}

		if(ch[ch.length-1] == ' ') {
			count = count-1;
		}

		System.out.println("No of words in the sentence : " + count);
	}
}
