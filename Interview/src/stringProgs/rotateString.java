package stringProgs;

public class rotateString {

	public static void main(String[] args) {
		new rotateString().rotate();
		System.out.println("Rajiv".hashCode());
		System.out.println("Rajiv".hashCode());
	}

	public void rotate()
	{
		String s="RAJIV";
		char c[]=s.toCharArray();
		int len=c.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				System.out.print(c[j]);
			}
			
			if(i>0)
			{
				/*for(int k=i;k>0;k--)
				{
					System.out.print( " if :"+c[k-1]);
				}*/
				
				for(int k=0;k<i;k++)
				{
					System.out.print( " if :"+c[k]);
				}
			}
			System.out.println(" Last: "+c[i]);
			
		}
	}
}
