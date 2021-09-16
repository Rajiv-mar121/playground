package concurrentHashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class HashMapRead {
	String name;
	int age;
	HashMapRead(){}
	HashMapRead(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap();
		m.put("Rajiv",1); m.put("Dhunno",2);
		m.put("Dhrubo",3); m.put("Sanjay",4);
		m.put("Sanjay",null);
		
		System.out.println(m.get("Rajiv"));
		System.out.println(m.get("Sanjay"));
		System.out.println(m.get("Sanjay2"));
		System.out.println(m.containsKey("Sanjay2"));
		new HashMapRead().newMapObject();
		
	}

	public void newMapObject()
	{
		HashMapRead obj1=new HashMapRead("Rajiv",28);
		HashMapRead obj2=new HashMapRead("Dhrubo",40);
		HashMapRead obj3=new HashMapRead("Dhunno",26);
		HashMapRead obj4=new HashMapRead("Dhunno",26);
		System.out.println("Equals Operation :" + obj3.equals(obj4));
		
		Map<HashMapRead,Integer> map=new HashMap();
		map.put(obj1,1); map.put(obj2,2);map.put(obj3,3);map.put(obj4,4);
		
		System.out.println(map.get(obj1));
		
		removeDuplicate(map);
		removeDuplicateKeySet(map);
	}
	
	public void removeDuplicate(Map map)
	{
		Set<Map.Entry<HashMapRead,Integer>> s=map.entrySet();
		Iterator<Map.Entry<HashMapRead,Integer>> it=s.iterator();
		
		
		while(it.hasNext())
		{
			Map.Entry<HashMapRead,Integer> element=it.next();
			System.out.println("getting Value from Key "+it +" ::"+element.getKey());
			System.out.println("getting Value from Key "+it +" ::"+element.getValue());
			//it.next();
		}
	}
	
	public void removeDuplicateKeySet(Map map)
	{
		Set<HashMapRead> s=map.keySet();
		//Object hr[]=s.toArray();
		HashMapRead hr[]=new HashMapRead[s.size()];
		s.toArray(hr);
		for(HashMapRead h:s)
		{
			System.out.println("key :"+h);
		}
		
	/*	Iterator<HashMapRead> it=s.iterator();
		while(it.hasNext())
		{
			HashMapRead obj1=it.next();
		}*/
		
		for(int i=0;i<hr.length;i++)
		{
			HashMapRead obj=hr[i];
			for(int j=i+1;j<hr.length;j++)
			{
				if(obj.equals(hr[j]))
				{
					System.out.println(" Remove this one "+obj);
					System.out.println("  " +map.get(obj));
					System.out.println(map.remove(obj));
				}
			}
		}
		
	}
	
	public String toString()
	{
		return this.name + "=="+this.age;
	}
	
	public boolean equals(HashMapRead h)
	{
		System.out.println(" HashMap called ");
		boolean val=(this.name==h.name && this.age==h.age)?true:false;
		return val;
	}
	
	public boolean equals(Object obj)
	{
		System.out.println(" Object called ");
		HashMapRead h=(HashMapRead)obj;
		boolean val=(this.name==h.name && this.age==h.age)?true:false;
		return val;
	}
}
