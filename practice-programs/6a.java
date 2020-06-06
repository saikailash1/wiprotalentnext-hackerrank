import java.util.*;

//Parent Class
class Animal
{
	public void eat()
	{
		System.out.println("Animal is eating..");
	}
	
	public void sleep()
	{
		System.out.println("Animal is sleeping..");
	}
}

//Child Class
public class Bird extends Animal
{
	public void eat()
	{
		System.out.println("Bird is eating..");
	}
	public void sleep()
	{
		System.out.println("Bird is sleeping..");
	}
	public void fly()
	{
		System.out.println("Bird is flying..");
	}
	
	//main method
	public static void main(String args[])
	{
		Animal a = new Animal();
		Bird b = new Bird();
		a.eat();
		a.sleep();
		System.out.println("//////////////////////////");
		b.eat();
		b.sleep();
		b.fly();		
	}
}
