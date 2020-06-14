import TwoWheeler.*;
import FourWheeler.*;
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
		System.out.println("\n");
		Logan l = new Logan();
		System.out.println("Model Name: "+l.getModelName());
		System.out.println("Registration Number: "+l.getRegistrationNumber());
		System.out.println("Owner Name: "+l.getOwnerName());
		System.out.println("Speed: "+l.speed()+"kmph");
		l.gps();
		System.out.println("\n");
		Ford f = new Ford();
		System.out.println("Model Name: "+f.getModelName());
		System.out.println("Registration Number: "+f.getRegistrationNumber());
		System.out.println("Owner Name: "+f.getOwnerName());
		System.out.println("Speed: "+f.speed()+"kmph");
		System.out.println("Temperature: "+f.tempControl()+"degrees");
	}
}
