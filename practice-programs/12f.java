import java.util.*;
class NegativeValException extends Exception
{
	public NegativeValException()
	{
		super();
		System.out.println("NegativeValuesException");
	}
}
class OutOfRangeException extends Exception
{
	public OutOfRangeException()
	{
		super();
		System.out.println("OutofRangeException");
	}
}
public class UserDef
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			String s = "";
			int a=0,b=0,c=0;
			try
			{
				s = sc.next();
				if (sc.hasNextInt())
					a = sc.nextInt();
				else
					throw new NumberFormatException("NumberFormatException");
				
				if (sc.hasNextInt())
					b = sc.nextInt();
				else
					throw new NumberFormatException("NumberFormatException");
				
				if (sc.hasNextInt())
					c = sc.nextInt();
				else
					throw new NumberFormatException("NumberFormatException");
				
				if (a < 0) throw new NegativeValException();
				if (a > 100) throw new OutOfRangeException();
				
				if (b < 0) throw new NegativeValException();
				if (b > 100) throw new OutOfRangeException();
				
				if (c < 0) throw new NegativeValException();
				if (c > 100) throw new OutOfRangeException();
				
				
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (NegativeValException e) {
				System.out.println(e.getMessage());
			} catch (OutOfRangeException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("Name: " + s);
			System.out.println("Marks of subject 1: " + a);
			System.out.println("Marks of subject 2: " + b);
			System.out.println("Marks of subject 3: " + c);
		}
		
		sc.close();

			}
		}
