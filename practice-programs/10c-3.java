package TwoWheeler;
import com.automobile.Vehicle;
public class Honda extends Vehicle
{
	public String getModelName()
	{
		return "Honda Shine";
	}
	
	public String getRegistrationNumber()
	{
		return "TN-13-4587";
	}
	
	public String getOwnerName()
	{
		return "Joel Schumacher";
	}
	
	public int getSpeed()
	{
		return 58;
	}
	
	public void cdplayer()
	{
		System.out.println("CD Player: This facility allows you to control the CD Player device in the car.");
	}
	
}
