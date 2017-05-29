package concurrentHashmap;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap map=new ConcurrentHashMap<String,String>();
		map.put("Rajiv", "Kumar");
		map.put("Dhrubo", "US");
		
		Set <String>s1=map.keySet();
		for(String key:s1)
		{
			System.out.println(map.get(key));
		}
		
		
	}
	public void test1()
	{
		ConcurrentHashMap<String, Integer> c1=new ConcurrentHashMap<String, Integer>(200,025f,10);
		ConcurrentHashMap<String, Integer> c2=new ConcurrentHashMap<String, Integer>(200,025f,10);
	}
}


/*1
ConcurrentHashMap m = new ConcurrentHashMap(200 , 0.75f, 10);
Initial capacity is 200, it means CHM make sure it has space for adding 200 key-value pairs after creation.

Load factor is 0.75, it means when average number of elements per map exceeds 150 (intital capacity * load factor = 200 * 0.75 = 150) at that time map size will be increased and existing items in map are rehashed to put in new larger size map.
For more details on Load Factor: Load factor in Map

Concurrency level is 10, it means at any given point of time Segment array size will be 10 or greater than 10, so that 10 threads can able to parallely write to a map.
============================================

If concurrenyLevel is 10 then Segment array size will be 16. 

Segment array size = 2 to the power x, where result should be >= concurrenyLevel(in our case it is 10)
Segment array size = 2 to the power x >= 10

Segment array size = 2 ^ 1 = 2   >= 10 (False)
Segment array size = 2 ^ 2 = 4   >= 10 (False)
Segment array size = 2 ^ 3 = 8   >= 10 (False)
Segment array size = 2 ^ 4 = 16 >= 10 (True) 

Segment array size is 16.





*/