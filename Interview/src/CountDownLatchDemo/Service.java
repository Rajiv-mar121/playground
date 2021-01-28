package CountDownLatchDemo;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Service implements Runnable {

	private final String name;
	private final int timeToStart;
	private final CountDownLatch latch;

	// Read more:
	// http://javarevisited.blogspot.com/2012/07/countdownlatch-example-in-java.html#ixzz4d5K6tv5f

	public Service(String name, int timeToStart, CountDownLatch latch) {
		this.name = name;
		this.timeToStart = timeToStart;
		this.latch = latch;
	}

	public void run() {
		try {
			Thread.sleep(timeToStart);
		} catch (InterruptedException ex) {
			Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
		}

		System.out.println(name + " is Up");
		latch.countDown(); // reduce count of CountDownLatch by 1

	}

}
