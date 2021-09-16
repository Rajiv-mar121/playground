package CollectionsPack;

import java.util.HashMap;
import java.util.Set;

public class CustomHashSet<K> {
	private transient HashMap<K,Object> map;
private static final Object PRESENT = new Object();

CustomHashSet()
{
	map=new HashMap();
}


/**
 * The main point to notice in above code is that put (key,value) will return
 *
 *	1.  null , if key is unique and added to the map
 *	2.  Old Value of the key , if key is duplicate
 *http://javahungry.blogspot.com/2013/08/how-sets-are-implemented-internally-in.html
 * @param e
 * @return true/false
 */
public boolean add(K e) {
    return map.put(e, PRESENT)==null;
}

public void display () {
	Set s=map.keySet();
	System.out.println(s);
}

public static void main(String a[]){
	CustomHashSet set=new CustomHashSet();
	set.add(40);
	set.add(41);
	set.add(42);
	set.add(42);
	System.out.println(set.add(42));
	set.display();
}
}
