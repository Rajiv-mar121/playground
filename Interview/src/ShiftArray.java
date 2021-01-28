
public class ShiftArray {

	static int array[]={1,2,3,4,5,6,7,8};
	public static void main(String[] args) {
		ShiftArray obj=new ShiftArray();
		obj.rotateArray(array, 3, array.length);
		//obj.display(a);
	}

	
	//output: 3,4,5,6,7,8,1,2
	public void rotateArray(int a[],int pos,int  size)
	{
		if (a==null) return;
		int tempAry[]=new int[pos];
		for(int i=0;i<pos;i++)
		{
			tempAry[i]=a[i];
		}
		
		display(tempAry);
		display(a);
		int point=pos;
		for(int i=0;i<size;i++)
		{
			if(point<size)
			{
				a[i]=a[point];
				a[point]=0;
			}
			point=point+1;
		}
		display(a);
		int tempPos=pos;
		for(int i=0;i<pos;i++)
		{
			a[size-tempPos]=tempAry[i];
			tempPos=tempPos-1;
		}
		display(a);
	}
	
	public void display(int a[])
	{
		for(int val:a)
		{
			System.out.print(val+"-->");
		}
		System.out.println("\n==========");
	}
}
