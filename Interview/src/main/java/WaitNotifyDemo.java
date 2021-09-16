
public class WaitNotifyDemo extends Thread{

	Thread t1;
	Thread t2;
	private int i=0;
	static WaitNotifyDemo w1;
	
	public void createThread()
	{
		t1=new Thread(w1,"Thread 1");
		System.out.println("Thread created");
		t1.start();
	//	t1.run();
	}
	
	public void run()
	{
		System.out.println("Rajiv::"+t1.getName());
	}
	
	static Thread t3=new Thread("t11"){
		public void run()
		{
			System.out.println("Raj");
		}
	};
	
	public static void main(String[] args) {
//		WaitNotifyDemo obj=new WaitNotifyDemo();
		w1=new WaitNotifyDemo();
		w1.createThread();
		t3.start();
	}

}
