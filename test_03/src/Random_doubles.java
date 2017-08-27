import java.util.Random;

public class Random_doubles
{
	private static Random rand = new Random(47);
	public double next(){ return rand.nextDouble(); }
	
	public static void main(String[] args)
	{
		Random_doubles rd = new Random_doubles();
		for (int i = 0; i < 7; i++)
			System.out.println(rd.next());
	}
}
