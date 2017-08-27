public class Inner_classes
{
	void f(){
		System.out.println("Base_class.f()");
	}
	public class Inner
	{
		public Inner_classes outer()
		{
			return Inner_classes.this;
		}
	}
	public Inner inner(){return new Inner();}
	
	public static void main(String[] args)
	{
		Inner_classes ic = new Inner_classes();
		Inner_classes.Inner ici = ic.inner();
		ici.outer().f();
	}
}