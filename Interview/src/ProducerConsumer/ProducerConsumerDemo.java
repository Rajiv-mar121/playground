package ProducerConsumer;

public class ProducerConsumerDemo {


	public static void main(String[] args) {
		PCallMethod am=new PCallMethod();
		new Producer(am);
		new Consumer(am);
		System.out.println("Press trl + C to Stop");
	}

}
