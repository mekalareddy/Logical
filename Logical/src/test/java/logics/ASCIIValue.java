//Write a java program to display the ASCII Value & corresponding character.

package logics;

public class ASCIIValue {
	
	public static void main(String[] args) {
		for(int i=0; i<=128; i++)
		{
			System.out.printf("%d ---> %c\n", i, i);
			//System.out.println(i + "--->" + (char)i);
		}
	}

}
