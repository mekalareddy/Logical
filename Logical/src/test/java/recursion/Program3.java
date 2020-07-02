//Write a java program to check string is palindrome (or) not without using loop.

package recursion;

public class Program3 {

	static boolean isPali(String st, int f, int l) {
		if(f<1) {
			if(st.charAt(f) == st.charAt(l))
				return isPali(st, f+1, l-1);
			else
				return false;
		}
		else return true;
	}

	public static void main(String[] args) {
		String st = "MadaM";
		boolean res = isPali(st, 0, st.length()-1);
		if(res)
			System.out.println("Is Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
