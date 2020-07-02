//Write a java program to print from n to 1.

package recursion;

public class Program2 {

	static void print(int n) {
		System.out.println(n);
		if(n>1)
			print(n-1);
	}

	public static void main(String[] args) {
		System.out.println("Program Started");
		print(5);
		System.out.println("Program Ended");
	}

}
