import java.util.*;
public class ArrayIndexException
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in an array: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements: ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		try
		{
			System.out.println("Enter the index of the array element you want to access: ");
			int c = sc.nextInt();
			System.out.println(arr[c]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		sc.close();
	}
}
