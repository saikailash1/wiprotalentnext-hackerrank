package TwoWheeler;
import com.automobile.*;
public class Hero extends Vehicle
{
	public String getModelName()
	{
		String mn = "Hero Chakra";
		return mn;
	}
	
	public String getRegistrationNumber()
	{
		String rn = "TN-04-6733";
		return rn;
	}
	
	public String getOwnerName()
	{
		String on = "John Travolta";
		return on;
	}
	
	public int getSpeed()
	{
		return 60;
	}
	
	public void radio()
	{
		System.out.println("Radio: This facility allows you to control the radio service.");
	}
	
}
