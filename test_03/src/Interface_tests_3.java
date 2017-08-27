import java.nio.*;
import java.util.*;

public class Interface_tests_3 implements Readable
{
	private static Random rand = new Random(47);
	private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowels = "aeiou".toCharArray();
	private int count;
	public Interface_tests_3(int count) {this.count = count;}
	public int read(CharBuffer cd){
		if(count-- == 0)
			return -1;
		cd.append(capitals[rand.nextInt(capitals.length)]);
		for (int i = 0; i < 4; i++)
		{
			cd.append(vowels[rand.nextInt(vowels.length)]);
			cd.append(lowers[rand.nextInt(lowers.length)]);
		}
		cd.append(" ");
		return 10;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(new Interface_tests_3(10));
		while(sc.hasNext())
			System.out.println(sc.next());
	}
}
