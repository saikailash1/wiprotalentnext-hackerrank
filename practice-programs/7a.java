import java.util.*;

//Main class
public class Fruit
{
	public void eat(String name,String taste)
	{
		System.out.println(name +" tastes "+taste);
	}
	public static void main(String args[])
	{
      Scanner sc = new Scanner(System.in);
	  String name = sc.next();
	  String taste = sc.next();
	  Apple a = new Apple();
	  Orange o = new Orange();
	  Fruit f  = new Fruit();
	  f.eat(name, taste);
	  if(name=="Apple"&&taste=="Unique")
	  {
		  a.eat(name,taste);  
	  }
	  else {
		  o.eat(name,taste);  
	  }
	}
}

class Apple extends Fruit
{
	public void eat(String name,String taste)
	{
		System.out.println(name +" tastes "+taste);
	}
}

class Orange extends Fruit
{
	public void eat(String name,String taste)
	{
		System.out.println(name +" tastes "+taste);
	}	
}
