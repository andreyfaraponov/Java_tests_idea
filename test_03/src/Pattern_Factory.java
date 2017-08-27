public class Pattern_Factory
{
	public static void main(String[] args)
	{
		Factories.serviceConsumer(new ImplementFactory1());
		Factories.serviceConsumer(new ImplementFactory2());
	}
}

interface   Service{
	void    method1();
	void    method2();
}

interface   ServiceFactory{
	Service getService();
}

class Implementation1 implements Service{
	Implementation1(){}
	public void method1(){
		System.out.println("Impl1 method1()");
	}
	public void method2(){
		System.out.println("Impl1 method2()");
	}
}

class ImplementFactory1 implements ServiceFactory{
	@Override
	public Service getService()
	{
		return new Implementation1();
	}
}

class Implementation2 implements Service{
	Implementation2(){}
	public void method1(){
		System.out.println("Impl2 method1()");
	}
	public void method2(){
		System.out.println("Impl2 method2()");
	}
}

class ImplementFactory2 implements ServiceFactory{
	@Override
	public Service getService()
	{
		return new Implementation2();
	}
}

class Factories{
	public static void serviceConsumer(ServiceFactory fact){
		Service s = fact.getService();
		s.method1();
		s.method2();
	}
}