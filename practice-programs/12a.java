import java.util.*;
public class Numbers
{
	public static void main(String agrs[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		try
		{
			int i = Integer.parseInt(s);
			int sq = i*i;
			System.out.println(sq);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Entered input is not a valid format for an integer.");
		}
		sc.close();
	}
}
