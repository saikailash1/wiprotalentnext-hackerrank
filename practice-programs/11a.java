import java.util.*;
interface LibraryUser
{
	void registerAccount(int x);
	void requestBook(String y);
}

class KidUser implements LibraryUser
{
	int age;
	String bookType;
	
	public void registerAccount(int a)
	{
		age = a;
		if(age<=12)
		{
			System.out.println("You have successfully registered under Kids account.");
		}
		else
		{
			System.out.println("Sorry, Age must be less than 12 to register as a kid.");
		}
	}
	
	public void requestBook(String b)
	{
		bookType = b;
		if(bookType=="Kids")
		{
			System.out.println("Book issued successfully, Please return the book within 10 days.");
		}
		else
		{
			System.out.println("OOPS, You are allowed to take only kids books.");
		}
	}
}
class AdultUser implements LibraryUser
{
	int age;
	String bookType;
	
	public void registerAccount(int c)
	{
		age = c;
		if(age>12)
		{
			System.out.println("You have successfully registered under an Adult account.");
		}
		else
		{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult.");
		}
	}
	
	public void requestBook(String d)
	{
		bookType = d;
		if(bookType=="Fiction")
		{
			System.out.println("Book issued successfully, Please return the book within 7 days.");
		}
		else
		{
			System.out.println("OOPS, You are allowed to take only fiction books.");
		}
	}
}

public class LibraryInterfaceDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int c = sc.nextInt();
		String b = sc.next();
		String d = sc.next();
		KidUser ku = new KidUser();
		AdultUser au = new AdultUser();
		ku.registerAccount(a);
		ku.requestBook(b);
		au.registerAccount(a);
		au.requestBook(b);
		sc.close();
	}
}
