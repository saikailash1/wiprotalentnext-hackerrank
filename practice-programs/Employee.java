import java.util.*;

public class Employee extends Person
{
	double annualSalary;
	int yearOfJoin;
	String insuranceNumber;
	
	public Employee()
	{
		annualSalary = 1000000;
		yearOfJoin = 2011;
		insuranceNumber = "8967";		
	}
	
	public void employee()
	{
		System.out.println(annualSalary);
		System.out.println(yearOfJoin);
		System.out.println(insuranceNumber);
	}
}
