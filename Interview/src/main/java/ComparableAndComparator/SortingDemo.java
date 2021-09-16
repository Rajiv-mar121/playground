package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingDemo {

	String name;
	int age;
	static ArrayList list=new ArrayList();
	
	SortingDemo(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	SortingDemo(){}
	
	public static void main(String[] args) {
		SortingDemo o1=new SortingDemo("Rajiv",26);
		SortingDemo o2=new SortingDemo("Sanjay",40);
		SortingDemo o3=new SortingDemo("Dhunno",22);
		SortingDemo o4=new SortingDemo("Rocky",13);
		list.add(o1);list.add(o2);list.add(o3);list.add(o4);
		SortingDemo c=new SortingDemo();
		Collections.sort(list);
		Collections.sort(list,new SortingDemo().new AgeComparator());
		Collections.sort(list,c.new AgeComparator());
		
	}
	
	 class AgeComparator implements Comparator
	{
		public int compare(Object o1,Object o2)
		{
			return 0;
		}
	}

}
