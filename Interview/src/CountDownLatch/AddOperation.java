package CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class AddOperation implements Runnable{
	String name;
	CountDownLatch latch;
	volatile int AddVal;
	
	AddOperation(String name,CountDownLatch latch)
	{
		this.name=name;
		this.latch=latch;
	}
	
	public void run()
	{
		try{
			System.out.println("Thread Executiong..."+Thread.currentThread().getName());
			Thread.sleep(1000);
			AddVal=78+52;
			latch.countDown();
			
		}
		catch(Exception e){}
	}

}
