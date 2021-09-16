
public class GCDDemo {

	static int gcd(int a, int b)
    {
        // Everything divides 0 
        if (a == 0 || b == 0)
           return 0;
      
        // base case
        if (a == b)
            return a;
      
        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
     
    // Driver method
    public static void main(String[] args) 
    {
        int a = 15, b = 2;
        int aray[]={2,3,4,5,6};
        for(int i=0;i<aray.length;i++)
        {
        	System.out.println("Value of i ="+aray[i]);
        	for (int j=i+1;j<aray.length;j++)
        	{
        		System.out.println("Value of j ="+aray[j]);
        		if(!(i==j)){
        			System.out.println("inside Value of j ="+aray[j]);
        		int mul=aray[i]*aray[j];
        		int gcd=gcd(mul, b);
        		if(gcd==1)
        		{
        			System.out.println("inside Value both numbers ="+aray[i] +" and "+aray[j]);
        		}
        		}
        	}
        }
        int gcd=gcd(a, b);
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
    }
	
	
}
