import java.util.*;
public class Division
{
	public static int division(int a,int b) throws ArithmeticException
	{
			int d = a/b;
			return d;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = division(a,b);
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
