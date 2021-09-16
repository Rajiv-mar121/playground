import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class findNum {

	public static void main(String[] args) {
		// 1456 , 123 , 2, 123 ,1231
		//search 123 
	//	int a[]={43218,123,1456};
	//	int a[]={1456,345671,43218,123};// 123 ,1231};
		int a[]={3456712};
		String s=findNum.findQualifiedNumbers(a);
		System.out.println(s);
	}
	
	static String findQualifiedNumbers(int[] numberArray) {
		
		int length=numberArray.length;
		char search[]={'1','2','3'};
		boolean status=false;
		String result="";
		String finalres="";
		int count=0;
		List<Integer> li=new ArrayList();
		HashMap<Character,String> map=new HashMap<Character,String>();
		
		for(int i=0;i<numberArray.length;i++)
        {
			String s1= String.valueOf(numberArray[i]);
		//	System.out.println("s1 value :" +s1);
			for(int k=0;k<s1.length();k++)
			{
				for(int j=0;j<search.length;j++)
				{
				//	System.out.println(" poke :" );
					System.out.println(" poke1 :"+search[j]+ "%%"+s1.charAt(k) );
					if(search[j]==s1.charAt(k))  
					{
						map.put(search[j], "found"); 
					}  	// 1456 , 123
				
				}
			}
			
			boolean flag=false;
			
			for(int j=0;j<search.length;j++){
				
				if(map.get(search[j])=="found")
				{
					flag=true;
					count++;
				}
				else{
					flag=false;
				}
			}
			
			System.out.println("count val :"+count);
			if(flag)   // Need to check with number of found equal = search pattern
			{
			//	result=result+s1+",";
				li.add(Integer.valueOf(s1));
				map.clear();
			}
        }
		Collections.sort(li);
	//	System.out.println(li);
		for(Integer val:li)
		{
			String num=String.valueOf(val);
			finalres=finalres+num+",";
		}
		finalres=finalres.substring(0, finalres.length()-1);
	//	System.out.println(" finalres new :"+finalres );
	//	result=result.substring(0, result.length()-1);
		return finalres;
	
	}

}
