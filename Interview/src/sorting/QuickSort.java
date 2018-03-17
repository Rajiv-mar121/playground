package sorting;

public class QuickSort {
	
	public int partition(int array[],int low,int high)
	{
		int i=low-1;
	//	System.out.println("i value "+i);
		int pivot=array[high];
		
		for(int j=low;j<high;j++)
		{
			if(array[j]<=pivot){
			i++;
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			}
		}
		
		int temp1=array[i+1];
		array[i+1]=array[high];
		array[high]=temp1;
		
		return i+1;
	}

	public void sort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int point=partition(arr,low,high);	
			System.out.println("Point value "+point);
			display(arr);
			sort(arr,low,point-1);
			sort(arr,point+1,high);
		}
	
	}
	
	public static void display(int a[])
	{
		for(int a1:a)
		{
			System.out.print(a1 +" --> ");
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		int a[]={8,7,5,3,9,10,1};
		int len=(a.length)-1;
		QuickSort obj=new QuickSort();
		obj.display(a);
		obj.sort(a,0,len);
		obj.display(a);
	}

}

//https://www.youtube.com/watch?v=3DV8GO9g7B4&t=1160s
