import java.util.Scanner;
public class Halves
{
	//substring function
	public static String substring(String a, int n)
	{
		String half= "";
		if(n%2==0)
		{
			half = a.substring(0, n/2);
		}
		else
		{
			half = null;
		}
		return half;
	}
	
	//main function
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int n = a.length();
		String fin = substring(a,n);
		System.out.println(fin);
		sc.close();
	}
}
