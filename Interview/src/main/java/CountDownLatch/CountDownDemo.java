package CountDownLatch;

import java.util.concurrent.*;

public class CountDownDemo {

	
	
	public static void main(String[] args) {
		CountDownLatch latch=new CountDownLatch(2);
		AddOperation add=new AddOperation("Add",latch);
		MulOperation mul=new MulOperation("Multi",latch);
		try {
			
			Thread m1=new Thread(add,"AddThread");
			Thread m2=new Thread(mul,"MultiplyThread");
			m1.start();
			m2.start();
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(" Application Started .....!!");
		System.out.println("Retrieving Val");
		int addvalue=add.AddVal;
		int mulValue=mul.MulVal;
		System.out.println("Retrieving Val..."+addvalue+ "  "+mulValue);
		
	}

}
