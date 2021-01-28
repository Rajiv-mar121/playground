
class A
{
	
	public void m1() // throws Exception
	{
		System.out.println("In A");
	}

}

class B extends A{
	
	public void m1() throws RuntimeException     // RuntimeException can be thrown at any time.
	
	// All exception has to handled in parent compulsory else compilation error.
	{
		System.out.println("In B");
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		new B().m1();
	}

}
