//Abstract Class
abstract class GeneralBank
{
	abstract int getSavingInterestRate();
	abstract double getFixedInterestRate();
}

//Extended from Abstract Class
class ICICIBank extends GeneralBank
{
	public int getSavingInterestRate()
	{
		return 4;
	}
	public double getFixedInterestRate()
	{
		return 8.5;
	}
	
}

//Extended from Abstract Class
class KotMBank extends GeneralBank
{
	public int getSavingInterestRate()
	{
		return 6;
	}
	public double getFixedInterestRate()
	{
		return 9;
	}
	
}

//Main function
public class Base {
	public static void main(String args[])//main function
	{
		ICICIBank ic = new ICICIBank();
		KotMBank km = new KotMBank();
		GeneralBank gi = new ICICIBank();
		GeneralBank gk = new KotMBank();
		System.out.println(ic.getSavingInterestRate());
		System.out.println(ic.getFixedInterestRate());
		System.out.println(km.getSavingInterestRate());
		System.out.println(km.getFixedInterestRate());
		System.out.println(gi.getSavingInterestRate());
		System.out.println(gi.getFixedInterestRate());
		System.out.println(gk.getSavingInterestRate());
		System.out.println(gk.getFixedInterestRate());
	}

}
