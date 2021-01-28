package CollectionsPack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map map=new HashMap<String,String>();
		map.put("Raj", "Eric");
		map.put("Sanj", "Eric");
		map.put("Dhunno", "CGI");
		map.put("Govind", "Del");
		
		System.out.println(map);
		
		Set<String> s=map.keySet();
		for(String str : s)
		{
			if(map.get(str).equals("CGI"))
			{
				System.out.println(" Key Found..."+ str +"="+map.get(str));
			}
		}
		
		Iterator<String> it=s.iterator();
		while(it.hasNext())
		{
			String key=it.next();
			System.out.println(key);
		}
		
		// EntrySet Impl
		Set<Map.Entry<String, String>> s2 =map.entrySet();
		System.out.println("EntrySet= "+s2);
		Iterator itr=s2.iterator();
		  for (Map.Entry<String, String> me : s2) {
		      System.out.print(me.getKey() + ": ");
		      System.out.println(me.getValue());
		    }
/*		while(itr.hasNext())
		{
			String keyVal=(String)itr.next();
			System.out.println("Iterate "+keyVal);
		}
		*/
	}

}
