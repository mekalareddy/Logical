//Write a program to check entered number is Prime/not? ---> Only 2 factors

package logics;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int n)
	{
		int i=2;
		
		while(i<=n/2)
		{
			if(n%i == 0)
			{
				break;
			}
			i++;
		}
		
		if(i>n/2)
			return true;
		else
			return false;
		
		//return i>n/2;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		boolean res = isPrime(num);
		
		if(res)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
		
	}

}