
public class ParseIntDemo {

	
	public static void main(String[] args) {
		int val=0;
		int res=0;
		ParseIntDemo parse=new ParseIntDemo();
		String number="4569";
		int len=number.length();
		int time=1000;
		for(int i=0;i<len;i++)
		{
			val=parse.convert(number.charAt(i));
			res=res+val*time;
			time=time/10;
		}
		
		System.out.println("ParseInt = "+res);
	}

	public int convert(char c)
	{
		int zero='0';
		int i=c;
		int num=i-zero;
		System.out.println(num);
		return num;
	}
	
}
