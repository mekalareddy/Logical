package codelity;

public class ArrayListLength
{

	public static void main(String[] args)
	{
		int a[]={1,4,-1,3,2};  

		System.out.println("Array List Length: "+ arrayListLength(a)); 
	}

	public static int arrayListLength(int[] arr)
	{
		int cn = 1;
		int i = arr[0];
		while(i!=-1)
		{
			cn++;
			i=arr[i];
		}
		return cn;
	}

}