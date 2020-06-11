import java.util.*;
public class copies
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int n = a.length();
		String fin = "";
		String b = a.substring(0,2);
		for(int i=0;i<n;i++)
		{
			fin = fin+b;
		}
		System.out.println(fin);
		sc.close();
	}
}
