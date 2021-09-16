
public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String s1=" R a j    i   v ";
		String s2=new String();
		int len=s1.length()-1;
		for(int i=0;i<=len;i++)
		{
			if(s1.charAt(i)!=' ')
			{
				System.out.print(s1.charAt(i));  // 1st Way 
				s2+=s1.charAt(i);			// 2nd way assign all characters in new string
			}
		}
		System.out.println();
		System.out.println(s2);
	}

}
