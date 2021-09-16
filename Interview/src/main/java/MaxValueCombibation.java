
public class MaxValueCombibation {
	// 6054854654   54, 546, 548, 60
	private int arrayReal[]={54, 446, 948, 60};
	private  int array[]=new int[arrayReal.length];;    
	private int pos=-2;
	private int newAray[]=new int[arrayReal.length];
	int index=0;
	int previous=-1;
	int numberReturened=1;
	int updateAtPos=-1;
	public static void main(String[] args) {
		MaxValueCombibation obj=new MaxValueCombibation();
		obj.copyArray();
		obj.display();
		obj.valueCalculation();
	}
	public void copyArray()
	{
		int i=0;
		for(int number:arrayReal)
		{
			array[i++]=number;
		}
	}
	public void display()
	{
		for(int a:array)
		{
			System.out.print(a +" --> ");
		}
		System.out.println(" ");
	}
	public void valueCalculation()
	{
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			int numberi=array[i];
			//calculate firstDigit
			int fistDigi=firstNumber(numberi);
			System.out.println("fistDigi :"+fistDigi);
			for(int j=i+1;j<len;j++)
			{
				// {54, 543, 645, 60};  54, 446, 948, 60
				int numberj=array[j];
				int fistDigj=firstNumber(numberj);
				System.out.println("fistDigj :"+fistDigj);
			//	pos=(fistDigi == fistDigj)?-1:((fistDigi > fistDigj)?i:j )    ;
				
				numberReturened=(fistDigi == fistDigj)?-1:((fistDigi > fistDigj)?fistDigi:fistDigj )    ;
				
				System.out.println("numberReturened :"+numberReturened);
				if(numberReturened!=-1){
					pos=(numberReturened==fistDigi?i:j);
				}
				else{
					pos=-1; 
					}
				System.out.println(" pos :"+pos +" ::"+i);
			//	System.out.println(" Array Val :"+array[pos]);
				//need to check with previous pos    54, 446, 948, 60
				if(pos!=-1)
				{
					System.out.println( "previous "+ previous  +": numberReturened ="+numberReturened);
					if(numberReturened > previous)
					{
						newAray[i]=array[pos];
					//	array[pos]=0;
						updateAtPos=pos;
						display();
						previous=numberReturened;
					}
				//	previous=numberReturened;
				}
				
			}
			array[updateAtPos]=0;
			/*if(pos!=-1)
			{
				System.out.println( "previous "+ previous  +":"+numberReturened);
				if(numberReturened > previous)
					newAray[i]=array[pos];
				
				previous=numberReturened;
			}*/
			
			previous=-1;
			System.out.println("================Loop completed =================:"+i);
		/*if(i==2)	
			break;*/
			
		}
		for(int a:newAray)
		{
			System.out.println(a);
		}
		
		for(int a:arrayReal)
		{
			System.out.println("RealArray value :" +a);
		}
		
		for(int a:array)
		{
			System.out.println("array value :" +a);
		}
	}
	
	
private int  firstNumber(int num)
	{
		int count=numberCount(num);
	//	System.out.println("count = "+count);
		
		int firstDig=0;
		switch(count)
		{
		case 1:firstDig=num;
				break;
		case 2: firstDig=num/10;
				break;
				
		case 3: firstDig=num/100;
				break;
		
		default: break;
		}
	//	System.out.println("firstDig = "+firstDig);
		return firstDig;
	}

	int numberCount(int num)
	{

		int count=0;
		int numbercount=num;
		while(numbercount !=0)
		{
			count++;
			numbercount=numbercount/10;
		}
	 return count;
	}

}
