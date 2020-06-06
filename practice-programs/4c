import java.util.*;
class Patient
{
	String str1="";
	double height=0,weight=0,BMI=0;
	String newLine = System.getProperty("line.separator");
	
	public void name(String str)
	{
		str1 = str;
	}
	
	public void bmi(double wt, double ht)
	{
		height=ht;
		weight=wt;
		BMI=(weight/(height*height))*703;
		System.out.println(BMI);		
	}

}
class Patients
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	double ht = sc.nextDouble();
    	double wt = sc.nextDouble();
    	Patient pt = new Patient();
    	pt.name(str);
    	pt.bmi(wt,ht);
    	sc.close();
    }
}
