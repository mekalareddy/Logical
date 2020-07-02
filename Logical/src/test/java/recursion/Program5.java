//Write a java program to find nth fibonacci number.

package recursion;

public class Program5 {

	static int fib(int n) {
		if(n == 1)
			return 0;
		if(n == 2)
			return 1;
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		System.out.println("Program Started");
		int f = fib(6);
		System.out.println(f);
		System.out.println("Program Ended");
	}

}
