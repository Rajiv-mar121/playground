package callableDemo;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Long> {
	int num;
	
	Factorial(int num)
	{
		this.num=num;
	}
	public Long call() throws Exception
	{
		return factorial();
	}

	
	public long factorial() throws Exception
	{
		Thread.sleep(2000);
		return (long) 123;
	}
}
