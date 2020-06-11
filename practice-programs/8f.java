import java.util.*;
public class Triple
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int n = a.length();
		int m = b.length();
		String result = "";
		if(n<m)
		{
			result = a+b+a;
		}
		else
		{
			result = b+a+b;
		}
		System.out.println(result);
		sc.close();
	}
}
