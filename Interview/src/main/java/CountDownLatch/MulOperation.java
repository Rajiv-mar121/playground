package CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class MulOperation implements Runnable{
	String name;
	CountDownLatch latch;
	volatile int MulVal;
	
	MulOperation(String name,CountDownLatch latch)
	{
		this.name=name;
		this.latch=latch;
	}
	
	public void run()
	{
		try{
			System.out.println("Thread Executiong..."+Thread.currentThread().getName());
			Thread.sleep(500);
			MulVal=78*52;
			latch.countDown();
			
		}
		catch(Exception e){}
	}

}
