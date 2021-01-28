package ProducerConsumer;

public class PCallMethod {
	int n;
	boolean status=false;
	
	synchronized void transfer(int n)
	{
		if(status)
		{
			try{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception While Transfering "+n +"--> "+e);
			}
		}
		this.n=n;
		status=true;
		System.out.println("Trnfer method called :: "+n);
		notify();
	}
	
	
	synchronized void recieve()
	{
		if(!status)
		{
			try{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception While recieving "+n +"--> "+e);
			}
		}
		
	System.out.println(" Recieve method called :"+n);
	status=false;
	notify();
	}
	
	

}
