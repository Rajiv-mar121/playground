package ThreadPack;

public class OddEvenPrint extends Thread{
	volatile int i=0;
	
	OddEvenPrint() throws Exception
	{
		Thread t1=new Thread(this,"t1");
		Thread t2=new Thread(this,"t2");
		t1.start();
		t2.start();
	}

	public void run()
	{
		try{
		System.out.println("Inside run"+Thread.currentThread());
		
		for(int i=0;i<15;i++){
		print();
		Thread.sleep(1000);
		}
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void print()
	{
		System.out.println("Inside run "+Thread.currentThread()+" "+i);
		i++;
	}
	
	public static void main(String[] args) throws Exception{
		new OddEvenPrint();
	}

}
