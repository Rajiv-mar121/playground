package datastructure;

public class StackDemo {

	int array[]=new int[6];
	static int top =-1;
	
	public static void main(String[] args) {
		StackDemo sd=new StackDemo();
		sd.push(10);
		sd.push(15);
		sd.push(50);
		sd.push(5);
		sd.push(2);
		sd.Display();
		sd.pop();
		sd.pop();
		sd.pop();
		sd.Display();
		
	}

	public void push(int newVal)
	{
			if(top == array.length-1)
			{
				System.out.println("...Stack is Full no insertion possible...");
			}
			else{
				array[++top]=newVal;
				
			}
	}
	public void pop()    // LIFO (Last In First Out )
	{
		if(top == -1)
		{
			System.out.println("...Stack is empty...");
		}
		
		array[top--]=0;
		
	}
	
	public void Display()
	{
		for(int val:array)
		{
			System.out.print(val +"-->");
		}
		
		System.out.println("\n===============");
	}
	
}
