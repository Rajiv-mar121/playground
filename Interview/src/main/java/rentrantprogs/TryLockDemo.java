package rentrantprogs;

import java.util.concurrent.locks.ReentrantLock;

public class TryLockDemo extends Thread{
	
	static ReentrantLock l=new ReentrantLock();
	String name;
	TryLockDemo(String name)
	{
		super(name);
	}

	public void run()
	{
		if(l.tryLock())
		{
			try {
				for(int i=0;i<6;i++)
				{
					System.out.println(" Lock found .. "+Thread.currentThread());
					Thread.sleep(2000);
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			l.unlock();
		}
		else
		{
			System.out.println(" Lock Not Found hence executing alternate code : "+Thread.currentThread());
		}
	}
	public static void main(String[] args) {
		TryLockDemo t1=new TryLockDemo("First Thread");
		TryLockDemo t2=new TryLockDemo("Second Thread");
		t1.start();
		t2.start();

	}

}
