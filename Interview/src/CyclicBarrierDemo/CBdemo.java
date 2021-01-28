package CyclicBarrierDemo;

import java.util.concurrent.*;

public class CBdemo {

	public static void main(String[] args) throws Exception{
		CyclicBarrier cb=new CyclicBarrier(3, new Runnable()
				{
				public void run()
				{
					System.out.println("All parties are arrived at barrier, lets play..");
				}
				}
				);
		
		
		Thread player1=new Thread(new Game(cb),"player1");
		Thread player2=new Thread(new Game(cb),"player2");
		Thread player3=new Thread(new Game(cb),"player3");
		player1.start();
		player2.start();
		player3.start();
		

	}

}
