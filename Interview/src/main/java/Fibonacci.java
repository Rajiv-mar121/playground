
public class Fibonacci {

	public static void main(String[] args) {
		
	//	normalFib();
		for(int count=0;count<4;count++)
		{
		int res=recursiveCall(count);
		System.out.println(res);}
	}

	public static void normalFib()
	{
		int F1=0;
		int F2=1;
		int sum=0;
		System.out.println(F1);
		System.out.println(F2);
		for(int i=0;i<8;i++)
		{
			sum=F1+F2;
			System.out.println(sum);
			F1=F2;
			F2=sum;
		}
	}
	
	public static int recursiveCall(int n)
	{
		if (n==0) return 0;
		if(n==1) return 1;
		return (recursiveCall(n-1)+recursiveCall(n-2));
	}
}
