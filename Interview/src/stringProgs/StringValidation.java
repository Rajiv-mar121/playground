package stringProgs;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Rajiv
 *
 */
public class StringValidation {
	
	static String req="REQ-NSR:,2009-05-11,12-43-48-EDT:::::ID=MGI_USER,RO=BANJ1,AC=Q,qt=1,NUM=8442112235";
	public static void main(String[] args) {
		new StringValidation().reqParser(req);
		
	}
	
	public void reqParser(String str)
	{
		String arry[]=str.split(":::::");
		String part1[]=arry[0].split(",");
		String part2[]=arry[1].split(",");
		
		// part1 and part2 can be used for response url building
		
		for(String s:arry)
		{
			System.out.println(s);
		}
		
		for(String s:part1)
		{
			System.out.println(s);
		}
		
		for(String s:part2)
		{
			System.out.println(s);
		}
		
		Map<String,String> hashMap=new HashMap<String,String>();
		// Adding all values to collection for easy retrieval
		for(String p1:part1)
		{
			hashMap.put(p1, p1);
		}
		
		for(String p2:part2)
		{
			String keyValuePair[]=p2.split("=");
			System.out.println(keyValuePair[0] + ""+keyValuePair[1]);
			hashMap.put(keyValuePair[0], keyValuePair[1]);
		}
		
		
		System.out.println(hashMap);
	}

}
