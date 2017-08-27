import jdk.nashorn.internal.codegen.CompilerConstants;

public class Closure_inner_interface
{
	public static void main(String[] args)
	{
		Cle1 c1 = new Cle1();
		Cle2 c2 = new Cle2();
		MyIncrem.f(c2);
		Caller cl1 = new Caller(c1);
		Caller cl2 = new Caller(c2.getCallbackReference());
		cl1.go();
		cl1.go();
		cl2.go();
		cl2.go();
	}
}

interface Increm{
	void increment();
}

class Cle1 implements Increm{
	private int i = 0;
	public void increment(){
		i++;
		System.out.println(i);
	}
}

class MyIncrem{
	public void increment(){
		System.out.println("Another opration");
	}
	public static void f(MyIncrem in){in.increment();}
}

class Cle2 extends MyIncrem
{
	private int i = 0;
	public void increment()
	{
		super.increment();
		i++;
		System.out.println(i);
	}
	private class Closure implements Increm{
		public void increment(){
			Cle2.this.increment();
		}
	}
	Increm getCallbackReference()
	{
		return new Closure();
	}
}

class Caller{
	private Increm cbref;
	Caller(Increm ref){cbref = ref;}
	void go(){cbref.increment();}
}