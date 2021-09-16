
public class NoRepeatChars {

	static String str="pepper";
	public static void main(String[] args) {
		NoRepeatChars obj=new NoRepeatChars();
		obj.noRepeat(str);
	}

	
	public void noRepeat(String s1)
	{
		String s2=s1;
		int len=s1.length()-1;
		
		for(int i=0;i<=len;i++)
		{
			int count=0;
			for(int j=0;j<=len;j++)
			{
				if(s2.charAt(j)==s1.charAt(i))
				{
					count =count+1;
				}
			}
			
		//	System.out.println("Letter :"+s1.charAt(i)+" Count :"+count);
			
			if(count==1)
			{
				System.out.println("No Repeated Letter :"+s1.charAt(i)+" Count :"+count);
			}
		}
	}
}
