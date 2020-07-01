//Write a java program to check two strings are Anagram (or) not?

//Anagram ---> Characters present in one string & other string are equal except spaces & cases
//Ex : Keep & Peek, Silent Cat & listen act, MotherInLaw & Hitler Woman

package arrays;

import java.util.Scanner;

public class Program21 {

	static String remSpc(String st) {
		char ch[] = st.toCharArray();
		st = " ";
		for(int i=0; i<ch.length; i++) {
			if(ch[i] != ' ') {
				st = st+ch[i];
			}
		}
		return st;
	}

	static String toLower(String st) {
		char ch[] = st.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i] >= 65 && ch[i] <= 90) {
				ch[i] = (char)(ch[i] + 32);
			}
		}
		st = new String(ch);
		return st;
	}

	static String sort(String st) {
		char ch[] = st.toCharArray();
		for(int i=0; i<ch.length-1; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]>ch[j]) {
					char c = ch[i];
					ch[i] = ch[j];
					ch[j] = c;
				}
			}
		}
		st = new String(ch);
		return st;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st String : ");
		String st1 = sc.nextLine();
		System.out.println("Entered 1st String : "+ st1);

		System.out.println("Enter 2nd String : ");
		String st2 = sc.nextLine();
		System.out.println("Entered 2nd String : "+ st2);

		st1 = remSpc(st1);
		st2 = remSpc(st2);

		if(st1.length() != st2.length()) {
			System.out.println("Strings are not Anagram");
			return;
		}

		st1 = toLower(st1);
		st2 = toLower(st2);

		st1 = sort(st1);
		st2 = sort(st2);

		char c1[] = st1.toCharArray();
		char c2[] = st2.toCharArray();

		for(int i=0; i<c1.length; i++) {
			if(c1[i] != c2[i]) {
				System.out.println("Strings are not Anagram");
				return;
			}
		}
		System.out.println("Strings are Anagram");
	}
}
