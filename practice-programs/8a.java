import java.util.*;
public class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuffer buf = new StringBuffer(s);
	    buf.reverse();
	    String fub = buf.toString();
	    if(s.equals(fub))
	    {
	    	System.out.println("The given string is a palindrome");
	    }
	    else
	    {
	    	System.out.println("The given string is not a palindrome");
	    }
	    sc.close();
	}
}
