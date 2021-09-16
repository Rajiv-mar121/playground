import java.util.ArrayList;
import java.util.Iterator;


public class StringReverse {
	String s;
	static int array[]={1,10,12};
	StringReverse(String s)
	{
		this.s=s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Rajiv";
		int len=str.length();
		for (int i=len-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		ArrayList al=new ArrayList ();
		al.add("Rajiv");
		al.add(12);
		System.out.println(al);
		
		for(Object o:al)
		{
			System.out.println(o);
		}
		
		ArrayList<String> al2=new ArrayList<String> ();
		al2.add("Rajiv");
		al2.add("Dhunno");
		Iterator it=al2.iterator();
		while(it.hasNext())
		{
			Object o1=it.next();
			System.out.println("Iterator print : "+o1);
		}
		for(Object obj:al2)
		{
			System.out.println("String type:"+obj);
		}
		
		ArrayList al3=new ArrayList ();
		al3.add(new StringReverse("Rajiv"));
		al3.add(new StringReverse("Dogs"));
		System.out.println(al3);
		
		for(Object obj1:al3)
		{
			System.out.println("Reverse:"+obj1);
			StringReverse sobj=(StringReverse)obj1;
			System.out.println("Ex:"+sobj.s);
		}
		
/*		for(StringReverse obj1:al3)
		{
			System.out.println("Reverse:"+obj1);
			StringReverse sobj=obj1;
			System.out.println("No down cast:"+sobj.s);
		}*/
		
		for (int i=0;i<al3.size();i++)
		{
			Object k1=al3.get(i);
			StringReverse k2=(StringReverse)k1;
			StringReverse k3=(StringReverse)al3.get(i);
		//	StringReverse k4=k1;
		}
		
		for (int i=0;i<al3.size();i++)
		{
			
			StringReverse k3=(StringReverse)al3.get(i);
		}
		System.out.println("array "+array);
		
		for (int i=0;i<al3.size();i++)
		{
			Object k1=al3.get(i);
			
			StringReverse k2=(StringReverse)al3.get(i);
		}
	}

}
