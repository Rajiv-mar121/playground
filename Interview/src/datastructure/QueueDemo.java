package datastructure;

public class QueueDemo {

	int queue[]=new int[6];
	static int front=0;
	static int rear=-1;
	
	public static void main(String[] args) {
		QueueDemo qd=new QueueDemo();
		qd.enQueue(2);
		qd.enQueue(4);
		qd.enQueue(6);
		qd.enQueue(8);
		qd.display();
		qd.displayQueue();
		qd.deQueue();
	//	qd.deQueue();
	//	qd.shiftElements();
	/*	qd.deQueue();
		qd.deQueue();
		qd.deQueue();*/
		
		qd.displayQueue();
		qd.display();
		
	}

	public void enQueue(int newVal)
	{
		if (rear==queue.length)
		{
			System.out.println("Queue is overflow");
			return;
		}
		queue[++rear]=newVal;
	}
	
	public void deQueue()
	{
		if (front>rear)
		{
			System.out.println("Queue is underflow rear :"+rear +" front:"+front);
			return;
		}
		queue[front++]=0;
		
	}
	
	public void display()
	{
		for(int val:queue)
		{
			System.out.print(val +" -->");
		}
		System.out.println("\n===NoRmaL======");
	}
	
	public void displayQueue()
	{
		for(int r=rear;r>=front;r--)
		{
			System.out.print(queue[r] +" -->");
		}
		System.out.println("\n=========");
	}
	
	public void shiftElements()
	{
		int t=front;
		
		for(int i=0;i<queue.length-1;i++)
		{
			//	System.out.println("Value of front :"+t);
				int tmp=queue[t];
				queue[t-1]=tmp;
				t=t+1;
		}
	}
}
