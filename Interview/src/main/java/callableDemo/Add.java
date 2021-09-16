package callableDemo;

import java.util.Random;
import java.util.concurrent.Callable;

public class Add implements Callable<Double>{

	int number;
	Add(int number)
	{
		this.number=number;
	}
	@Override
	public Double call() throws Exception {
		
		return additionLogic(number);
	}

	public double additionLogic(int number)
	{
		Random rand=new Random();
		int newVal=rand.nextInt(1000);
	//	double newVal=rand.nextDouble((1000.0);;
		double random=Math.random();
		return number+newVal;
	}
	
}
