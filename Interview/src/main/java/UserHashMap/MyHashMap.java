package UserHashMap;

public class MyHashMap<K, V> {

	private Entry[] table;
	private int capacity =4;;

	static class Entry<K, V>
	{
		K key;
		V value;
		Entry<K,V> next;
		
		public Entry(K key, V val, Entry<K,V> next)
		{
			this.key=key;
			this.value=val;
			this.next=next;
			
		}
		
		
	}
	
	public MyHashMap()
	{
		table=new Entry[capacity];
	}
	
	
	public void put(K newKey,V data)
	{
		if(newKey==null)
			return;
		int hash=hash(newKey);
		Entry<K,V> newEntry=new Entry(newKey,data,null);  // Creating new Object
		
		if(table[hash]==null)
		{
			table[hash]=newEntry;
		}
		else
		{
			// Now we need to trace that array linked list;
			Entry<K,V> currObj=table[hash];  // Object returned
			Entry<K,V> prev=null;
			while(currObj!=null)
			{
				if(currObj.key.equals(newKey))
				{
					if(prev==null)					// Nodes replacing at 1st position;
					{
						newEntry.next=currObj.next;   // newEntry.next=refering to another node;
						table[hash]=newEntry;
						return;
					}
					else{							// Nodes replacing in between 
		                   newEntry.next=currObj.next;
		                   prev.next=newEntry;
		                   return;
		               }
				}
				prev=currObj;
	            currObj = currObj.next;   // Traversing to last node on bucket index
			}
			prev.next=newEntry;
		}
	}
	
	int hash(K key)
	{
		System.out.println("bucket= "+Math.abs(key.hashCode()) % capacity);
		return Math.abs(key.hashCode()) % capacity;     // For determining bucket index;
	}
	
	
	public V get(K key)
	{
		int hash=hash(key);
		Entry<K,V> Obj=table[hash];
		if(Obj==null)
			return null;
		else
		{
			while(Obj != null)
			{
				if(Obj.key.equals(key))
				{
					return Obj.value;
				}
				Obj=Obj.next;
			}
			return null;
		}
	}
	
	
	public void display()
	{
		for(int i=0;i< capacity;i++)
		{
			Entry<K,V> Obj=table[i];
			while(Obj != null)
			{
				System.out.print(Obj.key + "="+Obj.value  +" --> ");
				Obj=Obj.next;
			}
			System.out.println();
		}
	}
	
	public boolean remove(K deleteKey)
	{
		int hash=hash(deleteKey);
		if(table[hash]==null){
			return false;
		}
		else{
		Entry<K,V> currObj=table[hash];
		Entry<K,V> prevObj=null;
		while(currObj!=null)
		{
			if(currObj.key.equals(deleteKey))
			{
				if(prevObj==null)   // deleting 1st Node
				{
					table[hash]=null;
					return true;
				}
				else{
					prevObj.next=currObj.next;
					return true;
				}
			}
		}
		prevObj.next=currObj.next;
		currObj=currObj.next;
		}
		return false;
	}
}
