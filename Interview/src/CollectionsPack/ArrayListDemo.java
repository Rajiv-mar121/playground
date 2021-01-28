package CollectionsPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	/**
	 * @param args
	 */
	private final ArrayList<String> al1;
	ArrayListDemo()
	{
		al1=new ArrayList<String>();
		al1.add("Rajiv");
		al1.add("Kumar ");
		al1.add("Dogs ");
		
	}
//	al1=new ArrayList<Integer>();
	public static void main(String[] args) {
		ArrayList al=new ArrayList<Integer>();
		al.add(89);
		al.add(45);
		al.add(85);
		al.add(79);
		al.add(02);
		System.out.println(al);
		Collections.sort(al);
	//	List li=Collections.sort(al);
		System.out.println(al);
		listModification(al);
		ArrayListDemo obj=new ArrayListDemo();
		//obj.m1();
	}

	
	static void  listModification(List li)
	{
		li.add(111);
		System.out.println(li);
	}
	
	
	
	protected List listAccess()
	{
		al1.add("Bunnu");
		return Collections.unmodifiableList(al1);    // Inorder to avoid modification by 3rd class
	//	return al1;
	}
	void m1()
	{
		synchronized (this) {
			m1();
		}
	}
	
	protected void display()
	{
		System.out.println( "Display Initiated: "+al1);
	}
	
	
}
