package rentrantprogs;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

//https://www.youtube.com/watch?v=q8kaFJ8-zVo

public class TryLockWithTime extends Thread{
	static ReentrantLock l=new ReentrantLock();
	
	TryLockWithTime(String name)
	{
		super(name);
	}

	public void run()
	{
		do{
			try {
				if(l.tryLock(5000, TimeUnit.MILLISECONDS))
				{
					System.out.println("Lock occupied.."+Thread.currentThread().getName());
					Thread.sleep(30000);
					l.unlock();
					System.out.println("Lock released by.."+Thread.currentThread().getName());
					break;
				}else{
					System.out.println("Lock not found will try again.."+Thread.currentThread().getName());
					
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		while(true);
	}
	
	
	public static void main(String[] args) {
		
		TryLockWithTime t1=new TryLockWithTime("FirstThread");
		TryLockWithTime t2=new TryLockWithTime("SecondThread");
		t1.start();
		t2.start();
	}

}
