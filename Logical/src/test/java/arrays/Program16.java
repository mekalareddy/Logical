//Write a java program to interchange continuous vowels in a string.

package arrays;

import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String : ");
		String st = sc.nextLine();
		System.out.println("Entered String : "+ st);

		char ch[] = st.toCharArray();
		int k=-1;

		for(int i=0; i<ch.length; i++) {
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				if(k==-1) {
					k=i;
				}
				else {
					char c = ch[i];
					ch[i] = ch[k];
					ch[k] = c;
					k = -1;
				}
			}
		}
		st = new String(ch);
		System.out.println("After interchanging continuous vowels : " + st);
	}
}
