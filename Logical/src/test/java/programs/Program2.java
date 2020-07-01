//Write a java program to display the entered number in the form of text (or) in the sentence 

package programs;

import java.util.Scanner;

public class Program2 {

	static String one[] = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	static String two[] = {" ", " ", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

	static void nw(int n, String st) {
		if(n>19) {
			System.out.println(two[n/10]+one[n%10]);
		}
		else {
			System.out.println(one[n]);
		}

		if(n!=0) {
			System.out.println(st);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text (or) sentence : ");
		int x = sc.nextInt();
		nw(x/10000000, "crore");
		nw((x/100000)%100, "lakh");
		nw((x/1000)%100, "thousand");
		nw((x/100)%10, "hundred");
		nw(x%100, " ");
	}

}
