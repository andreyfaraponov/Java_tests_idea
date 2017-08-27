import java.util.ArrayList;

public class test_arraylist
{
	public static void main(String[] args)
	{
		ArrayList<Egg> eggs = new ArrayList<Egg>();
		Egg g1 = new Egg("Первое");
		eggs.add(g1);
		Egg g2 = new Egg("Второе");
		eggs.add(g2);
		for (Egg e : eggs)
		{
			System.out.println(e.name);
		}
		System.out.println(eggs.size());
		System.out.println(eggs.indexOf(g2));
	}
}

class Egg
{
	String name;
	
	public Egg(String name)
	{
		this.name = name;
	}
}