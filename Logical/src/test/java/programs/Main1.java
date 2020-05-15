//Write a java program to display Sanju, if the number is divisible by 3. 
//Else display Geeta, if the number is divisible by 5. 
//Hence display "Sanju weds Geeta", if the number is divisible by both 3 & 5 b/w "1 to 100".

package programs;

public class Main1 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++)
		{
			if(i%3 == 0 && i%5 == 0)
				System.out.println("Sanju weds Geeta");
			else if(i%3 == 0)
				System.out.println("Sanju");
			else if(i%5 == 0)
				System.out.println("Geeta");
		}		
		
	}

}