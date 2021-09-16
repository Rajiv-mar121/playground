package sorting;

public class SelectionSort {

	static int a[]={8,7,5,3,9,10,1};
	public static void main(String[] args) {
		
		int len=a.length;
		System.out.println("Befor Sort :");
		display();
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		display();
	}

	public static void display()
	{
		for(int a1:a)
		{
			System.out.print(a1 +" --> ");
		}
		System.out.println(" ");
	}
}
