package interfacetest;


public class InterfaceTest {

	public interface A {
		void myMethod();
	}
	
	static class B {
		public void myMethod()
		{
			System.out.println("My method from B");
		}
	}
	
	static class C extends B implements A
	{
		
		
	}

	public static void main(String[] args)
	{
		A a = new C();
		a.myMethod();
	}
/*		public InterfaceTest() {
		// TODO Auto-generated constructor stub
	}
*/
}
