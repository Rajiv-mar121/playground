
public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		String s2="ja" + "va";
		String s3="va";
		
		System.out.println(s1==s2);
		System.out.println(s1==(s2+s3));
		new StringCheck().tryCheck();
	}
	
	public int tryCheck()
	{
		try{
			System.out.println("s1==s2");
			return 10;
			//System.out.println("s1==s2");
		}catch(Exception e)
		{
			return 20;
		}
		
		finally
		{
			System.out.println("Inside Finally");
			return 30;
			//System.out.println("Inside Finally");
		}
		
	}

}
