package ie.tudublin;

<<<<<<< HEAD
public class Dog extends animal
=======
public class Dog extends Animal
>>>>>>> d11198558a399a55c0b988a22843b56fb9712a7c
{
	

	// A constructor. Same name as the file. 
	// No return value
	// Member of the Dog class
	public Dog()
	{
		this.name = "rescue puppy";
	}
	
	// A constructor that takes name
	public Dog(String name)
	{
		this();
		this.name = name;
	}

	// A method
	public void speak()
	{
		System.out.println("Woof. I am " + name);
	}
}