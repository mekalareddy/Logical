//Write a java program to reverse the sentence

package arrays;

import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String : ");
		String st = sc.nextLine();
		System.out.println("Entered String : "+ st);

		char ch[] = st.toCharArray();

		st = " ";

		for(int i = ch.length-1; i >= 0; i--) {
			int k=i;
			while(i >= 0 && ch[i] != ' ' && ch[i] != '.' && ch[i] != ',') {
				i--;
			}

			int j = i+1;
			while(j<=k) {
				st=st+ch[j];
				j++;
			}

			if(i>=0) {
				st=st+ch[i];
			}
		}	
		System.out.println("Reversed sentence is :" + st);
	}
}
