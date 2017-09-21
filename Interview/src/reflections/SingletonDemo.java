package reflections;

public class SingletonDemo {
	
	static SingletonDemo Object= null;
	
	private SingletonDemo()
	{}
	
	public static synchronized SingletonDemo getInstance()
	{
		if(Object==null){
			Object=new SingletonDemo(); 
		return Object;}
		
		else
			return Object;
		
	}
	
	public void method()
	{
		System.out.println("Accessing Singleton Method ");
	}
}
