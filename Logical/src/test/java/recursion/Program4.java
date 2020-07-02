//Write a java program to find the factorial of a number using Recursion.

package recursion;

public class Program4 {

	static int fact(int n) {
		if(n==0)
			return 1;
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		System.out.println("Program Started");
		int f = fact(5);
		System.out.println(f);
		System.out.println("Program Ended");
	}

}
