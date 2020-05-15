//format specifiers :- "printf"
//%x ---> for hexa decimal
//%d ---> for decimal
//%o ---> for octa
//%c ---> for conversion into ASCII

//note : \n is for new line.

package logics;

public class FormatSpecifiers {
	
	public static void main(String[] args) {
		
		int n = 489;
		
		System.out.printf("%x\n", n);
		System.out.printf("%d\n", n);
		System.out.printf("%o\n", n);
		System.out.printf("%c\n", n);

	}

}