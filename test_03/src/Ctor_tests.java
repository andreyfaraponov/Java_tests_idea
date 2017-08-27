import javax.sound.sampled.Port;

public class Ctor_tests extends PortableLunch
{
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	public Ctor_tests()
	{
		System.out.println("Sandwich()");
	}
	public static void main(String[] args)
	{
		new Ctor_tests();
	}
}

class Meal
{
	Meal()
	{
		System.out.println("Meal()");
	}
}
class Bread
{
	Bread()
	{
		System.out.println("Bread()");
	}
}
class Cheese
{
	Cheese()
	{
		System.out.println("Cheese()");
	}
}
class Lettuce
{
	Lettuce()
	{
		System.out.println("Lettuce()");
	}
}

class PortableLunch extends Lunch
{
	PortableLunch()
	{
		System.out.println("PortableLunch()");
	}
}

class Lunch extends Meal
{
	Lunch()
	{
		System.out.println("Lunch()");
	}
}
