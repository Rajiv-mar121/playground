package java8;
//Functional Interfaces
// MethodRefence works with no argument method
interface One
{
	int say(int x);
	default void p1(){};
	static void p2(){};
}
public class MethodRef {
	int x = 10, y = 20;
/*	public static void m1(int x)
	{
		System.out.println(" Method static Ref");
	}
*/
	public  int m2(int x)
	{
		System.out.println(" Method  Ref --> Not Static " + (x + y));
		return (x+y);
	}
/*	public  void m3()
	{
		System.out.println(" Method  Ref --> m3 Not Static");
	}*/
	public static void main(String[] args) {
		System.out.println("Called");
	//	One one=MethodRef::m1;
		
		One two=(new MethodRef())::m2;
	//	One three=(new MethodRef())::m3;
	//	one.say(45);
		int x=two.say(52);
		System.out.println("Val:" +x);
	//	three.say();
	}

}
