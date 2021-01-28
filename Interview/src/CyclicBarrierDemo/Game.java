package CyclicBarrierDemo;

import java.util.concurrent.*;
public class Game implements Runnable{
	
	CyclicBarrier cb;
	String name;
	Game(CyclicBarrier cb)
	{
		this.cb=cb;
	//	this.name=name;
	}

	public void run()
	{
		try{
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
			cb.await();
			System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
		}
		catch(Exception e){}
	}
}
