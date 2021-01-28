
public class ThreadDemo extends Thread{

	/**
	 * @param args
	 */
	volatile  static int num =10;

	
	
	static Thread t1= new Thread("T1")
				{
						public void run()
						{
							System.out.println("I am Thread 1 :" + (num+10)); 
						}
				};
				
	static Thread t2= new Thread("T2")
	{
			public void run()
			{
				try {
					
					t1.join();
					t2.sleep(5*1000);
					t2.interrupt();
					System.out.println("I am Thread 2 :" + (num+20));
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	};
				
	static Thread t3= new Thread("T3")
	{
			public void run()
			{
				try {
					t2.join();				// It will for thread 2 to complete
					System.out.println("I am Thread 3 :"+ (num+30));
				//	t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	};
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Rajiv");
		t1.start();
	//	t1.interrupt();
		t2.start();
		t3.start();
		t3.join();
		
		System.out.println("Main Thread Existing = " +num);
		/*new Thread("T1")
		{
				public void run()
				{
					System.out.println("I am Thread 1");
				}
		}.start();*/
	}
}
