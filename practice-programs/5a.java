import java.util.*;


class Author
{
	//Declaration
	private String name;
	private String email;
	private char gender;
	
	//Initialization with constructor
	public Author()
	{
		name = "Jonn Jonzz";
		email = "martymanhunter@natmail.gl";
		gender = 'm';
	}
    public void Info()
    {
    	System.out.println(name+" "+email+" "+gender);
    }
}

//main class 
class Book extends Author
{
	private String name;
	private String author;
	private double price;
	private int qtyInStock;
	
	//Constructor
	public Book()
	{
		name = "Hronmeer: Book of Secrets";
		author = "Jonn Jonzz";
		price = 4.99;
		qtyInStock = 12;
	}
	
	//getters
	public String getName()
	{
		return name;
	}
	public String getAuthor()
	{
		return author;
	}
	public double getPrice()
	{
		return price;
	}
	public Integer getQtyInStock()
	{
		return qtyInStock;
	}
	
	//setters
	public void setPrice(double newprice)
	{
		this.price = newprice;
	}
	public void setQtyInStock(int newqtyInStock)
	{
		this.qtyInStock = newqtyInStock;
	}
	
//main method	
  public static void main(String args[])
  {
	  Book bk = new Book();
	  bk.setPrice(5.99);
	  bk.setQtyInStock(85);
	  System.out.println(bk.getName());
	  System.out.println(bk.getPrice());
	  System.out.println(bk.getQtyInStock());
	  Author ar = new Author();
	  ar.Info();
  }
}
