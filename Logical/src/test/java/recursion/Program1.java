//Write a java program to print 1 to 10 without using '2'.

package recursion;

public class Program1 {

	static void print(int n) {
		if(n>1)
			print(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		System.out.println("Program Started");
		print(5);
		System.out.println("Program Ended");
	}

}
