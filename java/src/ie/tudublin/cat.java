package ie.tudublin;

public class cat extends animal {
    String name;
	
	public void setName(String name)
	{
		this.name = name;
	}

	// A constructor. Same name as the file. 
	// No return value
	// Member of the Dog class
	public cat()
	{
		this.name = "rescue kitty";
	}
	
	// A constructor that takes name
	public cat(String name)
	{
		this.name = name;
	}

	// A method
	public void speak()
	{
		System.out.println("Meow. I am " + name);
	}
}
