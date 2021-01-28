package CollectionsPack;

import java.util.Set;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new TreeSet<String>();
		set.add("Rajiv");
		set.add("Kumar");
		set.add("ZMR");
		
		System.out.println(set +" IsEmpty ="+set.isEmpty());
		set.clear();
		System.out.println(" IsEmpty ="+set.isEmpty());
		
		TreeSet s1=new TreeSet<String>();
		s1.add("Rajiv");
		s1.add("Rajiv");
		s1.add("Kumar");
		s1.add("ZMR");
		System.out.println(s1);
	}

}
