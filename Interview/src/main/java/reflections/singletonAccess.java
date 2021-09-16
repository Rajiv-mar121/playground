package reflections;

import java.lang.reflect.Constructor;

public class singletonAccess {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		SingletonDemo ob=SingletonDemo.getInstance();
		SingletonDemo ob1=SingletonDemo.getInstance();
		System.out.println("Singleton Achieved : "+ (ob==ob1));
		new singletonAccess().breakSingleton();

	}
	
	public void breakSingleton() throws Exception
	{
		SingletonDemo ob=SingletonDemo.getInstance();
		SingletonDemo obj=null;
		Constructor[] constructors = SingletonDemo.class.getDeclaredConstructors();
		for(Constructor cons:constructors)
		{
			cons.setAccessible(true);
			obj=(SingletonDemo)cons.newInstance();
			obj.method();
			break;
		}
		
		System.out.println("Singleton Broken  : "+ (ob==obj));
	}

}
