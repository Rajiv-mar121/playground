package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparatorDemo {
	 String name;
	 int age;
	 int salary;
	static ArrayList al;
	ComparatorDemo(String name, int age,int salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	ComparatorDemo(){}

	public static void main(String[] args) {
		ComparatorDemo obj1=new ComparatorDemo("Rajiv",28,775000);
		ComparatorDemo obj2=new ComparatorDemo("Dhunno",25,550000);
		ComparatorDemo obj3=new ComparatorDemo("Sanjay",38,1800000);
		ComparatorDemo obj4=new ComparatorDemo("Govind",02,189151);
		al=new ArrayList<ComparatorDemo>();
		 
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);al.add(obj4);
		System.out.println(al);
		ComparatorDemo c=new ComparatorDemo();
		
		Iterator it=al.iterator(); 
		while(it.hasNext()){  
			ComparatorDemo st=(ComparatorDemo)it.next();  
		System.out.println(st.name+" "+st.age+" "+st.salary);  
		
		}
		
		System.out.println("=================");
		Collections.sort(al,c.new AgeComparator());
		
		Iterator itr=al.iterator(); 
		while(itr.hasNext()){  
			ComparatorDemo st=(ComparatorDemo)itr.next();  
		System.out.println(st.name+" "+st.age+" "+st.salary);  
		} 
		
		Collections.sort(al,c.new NameComparator());
	}

	
	class AgeComparator implements Comparator
	{
		public int compare(Object obj1,Object obj2)
		{
			ComparatorDemo o1=(ComparatorDemo)obj1;
			ComparatorDemo o2=(ComparatorDemo)obj2;
		//	int a=((o1.age>o2.age) ? 1: -1);
			int val=((o1.age == o2.age)?0:((o1.age>o2.age) ? 1: -1));
			return val;
		}
	}
	
	
	class NameComparator implements Comparator<ComparatorDemo>
	{
		public int compare(ComparatorDemo obj1 ,ComparatorDemo obj2)
		{
		//	int res=((obj1.salary==obj2.salary)?0:((obj1.salary > obj2.salary)?1:-1));
			
		int res=obj1.name.compareTo(obj2.name);
			return res;
		}
	}
}
