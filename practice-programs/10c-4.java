import TwoWheeler.*;
public class Test
{
	public static void main(String args[])
	{
		Hero h = new Hero();
		System.out.println("Model Name: "+h.getModelName());
		System.out.println("Registration Number: "+h.getRegistrationNumber());
		System.out.println("Owner Name: "+h.getOwnerName());
		System.out.println("Speed: "+h.getSpeed()+"kmph");
		h.radio();
		System.out.println("\n");
		Honda ho = new Honda();
		System.out.println("Model Name: "+ho.getModelName());
		System.out.println("Registration Number: "+ho.getRegistrationNumber());
		System.out.println("Owner Name: "+ho.getOwnerName());
		System.out.println("Speed: "+ho.getSpeed()+"kmph");
		ho.cdplayer();
	}
}
