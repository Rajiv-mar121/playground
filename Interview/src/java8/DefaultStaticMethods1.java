package java8;
public class DefaultStaticMethods1 {

	
	public static void main (String args[]) {
		
		Car1 veh = new Car1();
	
		veh.print1();
		
		System.out.println("I am fine");
	}
	
	
}
 
interface name{
	
	default void getName()
	{
		System.out.println("..Rajiv..");
	}
	
	public static void getAddress()
	{
		System.out.println("..Static Value ..");
	}
}




class Car1 implements name {
	
	public void print1() {
		name.super.getName();
		name.getAddress();
	}
	

	
}