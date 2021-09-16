package rentrantprogs;

import java.util.concurrent.locks.ReentrantLock;

public class Display {

	ReentrantLock l=new ReentrantLock();
	public synchronized void wish(String name)
	{
		System.out.println(Thread.currentThread().getName());
		try{
			for(int i=0;i<6;i++)
			{
			System.out.print("Good Morning :");
			Thread.sleep(2000);
			System.out.println(name);
			}
		}catch(InterruptedException e)
		{}
	}
	
	public void wish1(String name)
	{
		l.lock();
		System.out.println(Thread.currentThread().getName());
		try{
			for(int i=0;i<6;i++)
			{
			System.out.print("Good Morning :");
			Thread.sleep(2000);
			System.out.println(name);
			}
		}catch(InterruptedException e)
		{}
		l.unlock();
	}

}

// ReentrantLock gives exterme level of locking. synchronized block code can be replaced by 
//reentrant lock.