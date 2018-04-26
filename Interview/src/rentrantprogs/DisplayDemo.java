package rentrantprogs;

public class DisplayDemo extends Thread{

	Display d;
	String name;
	String threadName;
	DisplayDemo(Display d, String name,String threadName)
	{
		super(threadName);
		this.d=d;
		this.name=name;
	}
	
	public void run()
	{
			//d.wish(name);
			d.wish1(name);
	}
	public static void main(String[] args) {
		Display d=new Display();
		DisplayDemo t1=new DisplayDemo(d,"Dhoni","FirstThread");
		DisplayDemo t2=new DisplayDemo(d,"YuvRaj","secondThread");
		t1.start();
		t2.start();
		
	}

}
