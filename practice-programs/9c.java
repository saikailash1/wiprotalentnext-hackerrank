import java.util.Scanner;
abstract class Instrument
{
	abstract void play();
}

class Piano extends Instrument
{
	public void play()
	{
		System.out.println("Piano is playing tan tan tan tan");
	}
}	

class Flute extends Instrument
{
	public void play()
	{
		System.out.println("Flute is playing toot toot toot toot");
	}
}

class Guitar extends Instrument
{
	public void play()
	{
		System.out.println("Guitar is playing tin tin tin");
	}
}

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		Piano p = new Piano();
		Flute f = new Flute();
		Guitar g = new Guitar();
		for(int i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i]==1)
			{
				p.play();
				System.out.println("is p an Instance of Piano?");
				System.out.println(p instanceof Piano);
			}
			else if(arr[i]==2)
			{
				f.play();
				System.out.println("is f an instance of Flute?");
				System.out.println(f instanceof Flute);
			}
			else if(arr[i]==3)
			{
				g.play();
				System.out.println("is g an instance of Guitar?");
				System.out.println(g instanceof Guitar);
			}
			else
			{
				continue;
			}
		}
		sc.close();
	}
}
