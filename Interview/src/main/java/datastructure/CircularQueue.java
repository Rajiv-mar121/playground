package datastructure;

public class CircularQueue {

	int cQueue[]=new int[6];
	static int front=-1;
	static int rear=-1;
	static int displayRear=rear;
	
	public static void main(String[] args) {
		CircularQueue qd=new CircularQueue();
		qd.enQueue(2);
		qd.enQueue(4);
		qd.enQueue(6);
		qd.enQueue(8);
		qd.enQueue(9);
		qd.enQueue(10);
		qd.enQueue(11);
		qd.displayQueue();
		qd.deQueue();
		qd.displayQueue();
		qd.enQueue(11);
		qd.displayQueue();
		qd.deQueue();
		qd.displayQueue();
		qd.enQueue(12);
		qd.displayQueue();
	}

	
	public void enQueue(int newVal)
	{
		if (rear>=cQueue.length-1)
		{
			System.out.println("Queue is overflow");
			return;
		}
		cQueue[++rear]=newVal;
		displayRear=rear;
	}
	
	public void deQueue()
	{
		if(front > cQueue.length-1)
		{
			System.out.println("Circular is underflow..");
		}
		
		cQueue[++front]=0;
		System.out.println("Value of Front : "+front);
		if(rear == cQueue.length-1)
		{
			displayRear=rear;
			rear=-1;
		}
		if(front == cQueue.length-1)
		{
			front=-1;
		}
	}
	
	
	public void displayQueue()
	{
		int size=front;
		if(front == -1){
			size=0;
			}
		for(int r=cQueue.length-1;r>=0;r--)
		{
			System.out.print(cQueue[r] +" -->");
		}
		System.out.println("\n=========");
	}
	
}
