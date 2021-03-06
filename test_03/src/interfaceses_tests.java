import java.util.Arrays;

public class interfaceses_tests
{
	public static void process(Processor p, Object s)
	{
		System.out.println("Используем процессор " + p);
		System.out.println(p.process(s));
	}
	public static String s = "If she weighs the same as a duck, she's made of wood";
	
	public static void main(String[] args)
	{
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
		Upcase up = new Upcase();
	}
}

class Processor
{
	public String name(){ return getClass().getSimpleName();}
	Object process(Object input){
		return input;
	}
}

class Upcase extends Processor{
	String process(Object input){
		return ((String)input).toUpperCase();
	}
}

class Downcase extends Processor{
	String process(Object input){
		return((String)input).toLowerCase();
	}
}

class Splitter extends Processor{
	String processor(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}