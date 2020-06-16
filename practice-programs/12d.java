import java.util.*;
public class CmdLine
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(args[0]);
		int[] arr = new int[n];
		try
		{
			for(int i=0;i<n;i++)
			{
				arr[i] = Integer.parseInt(args[++i]);
			}
			System.out.println("Enter the index of the array element you want to access: ");
			int c = sc.nextInt();
			System.out.println(arr[c]);
		}
		catch(NumberFormatException e)
		{
			System.out.println("java.lang.NumberFormatException");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		sc.close();
	}
}
