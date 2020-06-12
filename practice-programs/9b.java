import java.util.*;
abstract class Compartment
{
	abstract void notice();
}

class FirstClass extends Compartment
{
	public void notice()
	{
		System.out.println("First Class Compartment");
	}
}

class Ladies extends Compartment
{
	public void notice()
	{
		System.out.println("Ladies Compartment");
	}
}

class General extends Compartment
{
	public void notice()
	{
		System.out.println("General Compartment");
	}
}

class Luggage extends Compartment
{
	public void notice()
	{
		System.out.println("Luggage Compartment");
	}
}
public class TestCompartment
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		FirstClass fc = new FirstClass();
		Ladies ld = new Ladies();
		General g = new General();
		Luggage lg = new Luggage();
		for(int i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i]==1)
			{
				fc.notice();
			}
			else if(arr[i]==2)
			{
				ld.notice();
			}
			else if(arr[i]==3)
			{
				g.notice();
			}
			else if(arr[i]==4)
			{
				lg.notice();
			}
			else
			{
				continue;
			}
		}
		sc.close();
	}
}
