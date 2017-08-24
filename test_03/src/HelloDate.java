import java.util.*;

public class HelloDate
{
	public static void main(String[] args)
	{
		Date dt = new Date();
		dt.setTime(1);
		int i = -1;
		System.out.println("Привет, сегодня ");
		System.out.println(dt);
		while (++i < args.length)
			System.out.println(args[i]);
		Zet a = new Zet();
		Tet b = new Tet();
		System.out.println(a.equals(b));
		float k = 1e-10f;
		System.out.println(k);
	}
}

class Zet
{
	private int a;
	public Zet()
	{
		a = 10;
	}
	public boolean equals(Zet z)
	{
		return (a == z.a);
	}
}

class Tet extends Zet
{
	//some test
}