package ProducerConsumer;

public class Consumer implements Runnable{
	
	PCallMethod am;
	Thread t;
	
	Consumer(PCallMethod am)
	{
		this.am=am;
		t=new Thread(this,"Consumer");
		System.out.println(" Getting Thread Name"+t.getName());
		t.start();
	}
	
	public void run()
	{
		while(true)
		{
			am.recieve();
			
		}
	}

}
