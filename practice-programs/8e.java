import java.util.Scanner;
public class Rest
{
	//function
	public static String retrest(String a, int n)
	{
		String rest = a.substring(1,n-1);
		return rest;
	}
	
	//main function
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int n = a.length();
		String fin = retrest(a,n);
		System.out.println(fin);
		sc.close();
	}
}
