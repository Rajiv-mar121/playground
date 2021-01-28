package callableDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;;

public class ThrdPoolCallable {

	public static void main(String[] args) throws Exception{

		ExecutorService es= Executors.newFixedThreadPool(5);
		Future future=es.submit(new Add(70));
		
		double res=(double)future.get();
		System.out.println(" Res Val :"+res);
		
		Future f1=es.submit(new Factorial(10));
		System.out.println(f1.isDone());
		if(!f1.isDone())
		{
			boolean mayInterruptIfRunning=true;
			f1.cancel(mayInterruptIfRunning);
			System.out.println( "mayInterruptIfRunning :"+mayInterruptIfRunning);
		}
		
		long l1=(long)f1.get();
		System.out.println(l1);
	}

}
