//Write a java program to print o/p for i/p as given below
// i/p : aaabcdddeefff
// o/p : 3abc3d2e3f

package arrays;

import java.util.Scanner;

public class Program22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String : ");
		String st = sc.nextLine();
		System.out.println("Entered String : "+ st);

		char ch[] = st.toCharArray();
		st = " ";

		for(int i=0; i<ch.length; i++) {
			int count = 1;
			while(i<ch.length-1 && ch[i] == ch[i+1]) {
				count++;
				i++;
			}
			if(count>1)
				st = st + count;
			st = st + ch[i]; 
		}
		System.out.println("Output printed :" + st);
	}
}
