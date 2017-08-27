enum Note
{
	MIDDLE_C,
	C_SHARP,
	B_FLAT
}

interface musicPlay
{
	public void play(Note i);
}

public class Music
{
	public static void main(String[] args)
	{
		Instrument[] orchestra = {
				new Wind(),
				new Stringed(),
				new Brass(),
				new Wind(),
				new WoodWind()
		};
		tuneAll(orchestra);
	}
	public static void tune(musicPlay i)
	{
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] all)
	{
		for (Instrument i: all)
		{
			tune(i);
		}
	}
}

class Instrument implements musicPlay
{
	public void play(Note n)
	{
		System.out.println("Instrument.play()");
	}
	String what()
	{
		return ("Instrument");
	}
	void adjust()
	{
		System.out.println("Adjusting Instrument");
	}
}

class Wind extends Instrument implements musicPlay
{
	public void play(Note n)
	{
		System.out.println("Wind.play() " + n);
	}
	String what()
	{
		return ("Wind");
	}
	void adjust()
	{
		System.out.println("Adjusting Wind");
	}
}

class Stringed extends Instrument implements musicPlay
{
	public void play(Note n)
	{
		System.out.println("Stringed.play() " + n);
	}
	String what()
	{
		return ("Stringed");
	}
	void adjust()
	{
		System.out.println("Adjusting Stringed");
	}
}

class Brass extends Instrument implements musicPlay
{
	public void play(Note n)
	{
		System.out.println("Brass.play() " + n);
	}
	String what()
	{
		return ("Brass");
	}
	void adjust()
	{
		System.out.println("Adjusting Brass");
	}
}

class WoodWind extends Wind
{
	public void play(Note n)
	{
		System.out.println("WoodWind.play() " + n);
	}
	String what()
	{
		return ("WoodWind");
	}
}