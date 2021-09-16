package ProducerConsumer;

public class Producer implements Runnable{
	
	PCallMethod am;
	Thread t;
	
	Producer(PCallMethod am)
	{
		this.am=am;
		t=new Thread(this,"Producer");
		System.out.println("Getting thread status ::" +t.getName());
		t.start();
	}
	
	public void run()
	{
		int i=0;
		while(true)
		{
			am.transfer(i++);
			if(i==20)
				System.exit(0);
		}
	}

}
