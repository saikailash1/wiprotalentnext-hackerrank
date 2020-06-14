package FourWheeler;
import com.automobile.*;
public class Logan extends Vehicle
{
	public String getModelName()
	{
		return "Logan Forza";
	}
	
	public String getRegistrationNumber()
	{
		return "TN-33-6666";
	}
	
	public String getOwnerName()
	{
		return "Cayden James";
	}
	
	public int speed()
	{
		return 70;
	}
	
	public void gps()
	{
		System.out.println("Navigation: GPS is available in this car.");
	}
}
