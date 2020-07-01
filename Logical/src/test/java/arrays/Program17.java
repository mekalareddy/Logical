//Write a java program to count no of vowels, consonants, digits & special symbols in a string. 

package arrays;

import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String : ");
		String st = sc.nextLine();
		System.out.println("Entered String : "+ st);

		char ch[] = st.toCharArray();

		int vowels = 0; 
		int consonants = 0;
		int digits = 0;
		int specialSymbols = 0;

		for(int i=0; i<st.length(); i++) {
			if((ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122)) {
				if(ch[i] == 'a' || ch[i] == 'A' || ch[i] == 'e' || ch[i] == 'E' || ch[i] == 'i' || ch[i] == 'I' || ch[i] == 'o' || ch[i] == 'O' || ch[i] == 'u' || ch[i] == 'U') {
					vowels++;
				}
				else {
					consonants++;
				}
			}
			else {
				if(ch[i] >= 48 && ch[i] <= 57) {
					digits++;
				}
				else {
					specialSymbols++;
				}
			}
		}

		System.out.println("vowels : "+ vowels);
		System.out.println("consonants : "+ consonants);
		System.out.println("digits : "+ digits);
		System.out.println("specialSymbols : "+ specialSymbols);

	}
}
