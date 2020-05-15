//Write a program to display the prime numbers b/w 1 to 100.

package logics;

import java.util.Scanner;

public class PrimeNumbers {
	
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
		System.out.println("Enter Range:");
		int ran = sc.nextInt();
		int count = 0;
		
		for(int num=1; num<=ran; num++)
		{
			boolean res = isPrime(num);
			if(res)
			{
				System.out.println(num);
				count++;
			}
		}
		
		System.out.println("no of prime numbers b/w 1 to "+ran+" is :"+count);		
	}
	
}