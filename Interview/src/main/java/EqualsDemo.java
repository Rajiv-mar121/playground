
public class EqualsDemo {
	String name;
	int sal;
	
	EqualsDemo(String name,int sal)
	{
		this.name=name;
		this.sal=sal;
	}
	public static void main(String[] args) {
		EqualsDemo o1=new EqualsDemo("Rajiv",50);
		EqualsDemo o2=new EqualsDemo("Rajiv",50);
		System.out.println(o1==o2);
		System.out.println(o1.equals(o2));
		Integer i=50;
		System.out.println("HashCode :"+i.hashCode() +" String : "+"Rajiv".hashCode());
		
		String s="Rajiv";
		String s1=new String("Rajiv");
		String s2=new String("Rajiv");
		System.out.println("test.."+s==s1);
		System.out.println("test.."+s1==s2);
	}

	public boolean equals(Object obj)
	{
		EqualsDemo ed=(EqualsDemo)obj;
		boolean res=false;
		//int res1=this.name.compareTo(ed.name);
		boolean res1=this.name.equals(ed.name);
		res=this.sal==ed.sal;
		if(res1 && res )
		{
			return true;
		}
		return false;
	}
	
	/*public int hashCode()
	{
		return 5;
	}*/
	
}




/*when we override equals(), it is recommended to also override the hashCode() method.
If we don’t do so, equal objects may get different hash-values; and hash based collections,
including HashMap, HashSet, and Hashtable do not work properly (see this for more details).*/

