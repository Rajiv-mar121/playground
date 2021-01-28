package CollectionsPack;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class KeySetDemo {

	Map<String,String> map=new HashMap<String,String>();
	
	public static void main(String[] args) {
		KeySetDemo k1=new KeySetDemo();
		k1.keysetMethod();
		k1.EntrysetMethod();
	}
	
	public void keysetMethod()
	{
		map.put("Raj", "Eric");
		map.put("Sanj", "Eric");
		map.put("Dhunno", "CGI");
		map.put("Govind", "Del");
		
		Set<String> s=map.keySet();
		for(String str : s)
		{
			if(map.get(str).equals("CGI"))
			{
				System.out.println(" Key Found..."+ str +"="+map.get(str));
			}
		}
	}
	
	public void EntrysetMethod()
	{
		map.put("Raj", "Eric");
		map.put("Sanj", "Eric");
		map.put("Dhunno", "CGI");
		map.put("Govind", "Del");
		
		Set<Map.Entry<String, String>> Entryset=map.entrySet();
		
		for(Entry<String, String> entry: Entryset)
		{
			System.out.println("Element --> "+entry);
			System.out.println("Element --> "+entry.getKey() +"--->"+entry.getValue());
		}
		
		System.out.println("Entryset --> "+Entryset);
	}

}
