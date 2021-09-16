package CountDownLatchDemo;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * Java program to demonstrate How to use CountDownLatch in Java. CountDownLatch is
 * useful if you want to start main processing thread once its dependency is completed
 * as illustrated in this CountDownLatch Example
 * 
 *http://javarevisited.blogspot.in/2012/07/countdownlatch-example-in-java.html
 * 
 * @author Rajiv
 */
public class CountDownLatchExample {

	public static void main(String[] args) {
		final CountDownLatch latch=new CountDownLatch(3);
		Thread cacheService=new Thread(new Service("Cacheservice",1000,latch));
		Thread alertService=new Thread(new Service("AlertService",1000,latch));
		Thread validationService=new Thread(new Service("ValidationService",1000,latch));
		
		cacheService.start(); //separate thread will initialize CacheService
	    alertService.start(); //another thread for AlertService initialization
	    validationService.start();
	    
	 // application should not start processing any thread until all service is up
	       // and ready to do there job.
	       // Countdown latch is idle choice here, main thread will start with count 3
	       // and wait until count reaches zero. each thread once up and read will do
	       // a count down. this will ensure that main thread is not started processing
	       // until all services is up.
	      
	       //count is 3 since we have 3 Threads (Services)


	    
	    try{
            latch.await();  //main thread is waiting on CountDownLatch to finish
            System.out.println("All services are up, Application is starting now...!!");
       }catch(InterruptedException ie){
           ie.printStackTrace();
       }


	}

}
