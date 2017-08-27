interface Inner_interf_class_wonder
{
	void    z();
	class Test implements Inner_interf_class_wonder
	{
		public void z()
		{
			System.out.println("Hello!");
		}
		public static void main(String[] args)
		{
			new Test().z();
			NMA a = new NMA();
			NMA.A b = a.new A();
			NMA.A.B c = b.new B();
			c.h();
		}
	}
}

class       NMA{
	private void    f(){
		System.out.println("f()");
	}
	public class A{
		private void g(){
			System.out.println("g()");
		}
		public class B{
			void h(){
				g();
				f();
			}
		}
	}
}