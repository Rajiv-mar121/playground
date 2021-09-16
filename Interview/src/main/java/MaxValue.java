
public class MaxValue extends aaaa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={54, 543, 545, 60};
		int newAray[]=new int[array.length];
		int len=array.length;
		int index=0;
		for(int i=0;i<len-1;i++)
		{
			
		//	int count=0;
			
			int numi=array[i];
			int count=countChk(numi);
			int FstNumberi=firstNumber(numi);
			/*while(numbercount !=0)
			{
				count++;
				numbercount=numbercount/10;
			}*/
			
			for(int j=i+1;j<len;j++)
			{
				int numj=array[j];
				int FstNumberj=firstNumber(numj);
				System.out.println(" i ="+FstNumberi  +" : j="+FstNumberj);
				int pos=(FstNumberi==FstNumberj)?-1:(FstNumberi>FstNumberj)?i:j;
				
				if(pos!=-1)
				{
					newAray[i]=pos;
					//index++;
				}
				if(pos==-1)
				{
					
				}
				//numj=numi/10;
			}
			numi=numi/10;
		}
System.out.println("NewArray value ="+newAray);
	for(int a:newAray)
	{
		System.out.println(array[a]);
	}
	}
	
	static int  firstNumber(int num)
	{
		int count=0;
		int numbercount=num;
		while(numbercount !=0)
		{
			count++;
			numbercount=numbercount/10;
		}
		
		System.out.println("count val = "+count  +"Number recvd :"+num);
		
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
		System.out.println("firstDig = "+firstDig);
		return firstDig;
	}
	
	
	static int countChk(int num)
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

	//protected class aaaa{}
}
class aaaa{}
