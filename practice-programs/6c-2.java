import java.util.*;

public class Teacher extends Person
{
	int salary = 45000;
	String subject = "Physical Education";
	public void info()
	{
		System.out.println(name+" "+age+" "+qualification+" "+salary+" "+subject);
	}
}

class collegeStudent extends Student
{
	int year = 3;
	String Major = "Communications";
	public void info()
	{
		System.out.println(name+" "+age+" "+School+" "+year+" "+Major);
	}
	//main method
	public static void main(String args[])
	{
		Teacher t = new Teacher();
		collegeStudent s = new collegeStudent();
		t.info();//parent method
		System.out.println("///////////////////////");
		s.info();//child method - Inherited
	}
}
