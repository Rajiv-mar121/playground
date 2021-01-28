package dynamicProgram;

public class CoinChange {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3};
		int len=arr.length;
		System.out.println(count(arr,len,4));
	}

	
	
	// coin size  aray
	
	public static int count(int aray[], int size,int coin)
	{
		if(coin == 0) return 1;
		if(coin < 0) return 0;
		
		if(size<=0 && coin >=1)  return 0;
		
		
		return count(aray,size-1,coin)+count(aray,size,coin-aray[size-1]);
		
	}
}
