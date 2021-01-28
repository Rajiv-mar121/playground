import java.util.ArrayList;

public class ArrayListDemo extends ArrayList<String>{

	public static void main(String[] args) {
		/*ArrayList<String> li=new ArrayList<String>();
		li.add("kumar");*/
		
		ArrayListDemo lis=new ArrayListDemo();
		lis.add("Rajiv");
		lis.add("Kumar");
		lis.add("Dhunno");
		System.out.println(lis);
		System.out.println(lis.get(2));
		
	}

	public boolean add(String a)
	{
		//super(a);
		System.out.println("Time Printed "+System.currentTimeMillis());
		return super.add(a);
	}
}
