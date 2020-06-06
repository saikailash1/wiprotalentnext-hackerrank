import java.util.*;

//main class
public class TestEmployee
{
	public static void main(String args[])
	{
		Person p = new Person();
		Employee e = new Employee();
		p.name();//parent class method
        System.out.println("/////////////////////");
		e.employee();//child class method
        System.out.println("/////////////////////");
		e.name();//parent method inherited by child
	}
}
