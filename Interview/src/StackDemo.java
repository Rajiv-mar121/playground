import java.io.BufferedReader;
import java.io.InputStreamReader;


public class StackDemo {

	/**
	 * @param args
	 */
	Object array[]=new Integer[5];
	static int top = -1;
	public static void main(String[] args) throws Exception{
		StackDemo sd =new StackDemo();
	
		
		while(true)
		{
			System.out.println("===========Please Enter your choice========== ");
			System.out.println("=========== 0. Push     1. pop    2. Display   3.Exit   ========== ");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String str=br.readLine();
			int num=Integer.parseInt(str);
			System.out.println("You Entered :" + num);
			
			switch(num)
			{
			case 0: System.out.println(" Push Initiated : Please Enter Elements ");
					sd.push();
					break;
			case 1: System.out.println(" Pop Initiated :  ");
					sd.pop();
					break;
					
			case 2: sd.display();
					break;
					
			case 3: System.exit(0);
			
			default : System.out.println("Number invalid Please Re-Enter ");
			
			}
			
		}
	}
	
	void push() throws Exception
	{
		if (top == (array.length-1))
		{
			System.out.println(" Stack is full ");
			return;
		}
		System.out.println("===========Please Enter Element========== ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int num=Integer.parseInt(str);
		array[++top] = num;
		
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty.. Nothing to delete ");
			return;
		}
		array[top--]=null;
	}
	
	void display()
	{
		/*for(int element: array)
		System.out.println("Array Elements :: "+element);*/
		
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.println("Array Elements :: "+array[i]);
		}
	}

}
