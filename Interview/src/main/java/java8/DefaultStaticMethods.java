package java8;

public class DefaultStaticMethods {

	
	public static void main (String args[]) {
		
		Vehicle veh = new Car();
	
		veh.print();
		
		System.out.println("I am fine");
	}
	
	
}


interface Vehicle {
	
	default void print() {
		System.out.println("Vehicle");
	}
	
	static void blowHorn() {
		System.out.println("Blow horn");
	}
}

interface FourWheeler {
	
	default void print() {
		System.out.println("Four Wheeler");
	}
}


class Car implements Vehicle {
	
	Vehicle v = new Car();
	
	public void print1() {
		Vehicle v1;
		Vehicle.super.print();
//		FourWheeler.super.print();
		Vehicle.blowHorn();
		System.out.println("I am Car !!");
//		m2();
	}
	
	public void m2() {

		v.print();
	}
	
}