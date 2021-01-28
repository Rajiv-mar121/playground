package UsefulProgs;

public class shiftElements {

	static int array[]=new int[6];
	public static void main(String[] args) {
		
		array[0]=3;array[1]=1;array[2]=4;array[3]=5;array[4]=8;
		shiftElements obj=new shiftElements();
		obj.display();
		obj.shift();
		obj.display();
		
	}

	
	
	
	public void display()
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]  +" --> ");
		}
		System.out.println("\n=========");
	}
	
	public void shift()
	{
		int t=4;
		for(int i=0;i<5;i++)
		{
			int tmp=array[t];
		//	System.out.println("Value picked :"+tmp);
			array[t+1]=tmp;
			t=t-1;
		//	System.out.println("Value of t :"+t);
		}
		array[0]=0;
	}
}
