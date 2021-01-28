package comparatorPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class comparatorDemo {

	String name;
	int age;
	double salary;
	static List list=new ArrayList();
	
	protected comparatorDemo(String name,int age,double salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	comparatorDemo(){}
	
	public static void main(String[] args) {
		
		comparatorDemo obj1=new comparatorDemo("Rajiv",26,45000);
		comparatorDemo obj2=new comparatorDemo("Dhunno",24,85000);
		comparatorDemo obj3=new comparatorDemo("Sanjay",52,40000);
		comparatorDemo obj4=new comparatorDemo("Dhrubo",16,55000);
		list.add(obj1);list.add(obj2);
		list.add(obj3);list.add(obj4);
		System.out.println(" List original values :");
		
		Iterator it= list.iterator();
		while(it.hasNext())
		{
			comparatorDemo element=(comparatorDemo)it.next();
			System.out.println("Name :"+element.name +" Age :"+element.age +" Salary :"+element.salary );
		}
		List li=new ArrayList(); li.add(422);li.add(42);li.add(23);
		Collections.sort(li);
	//	Collections.sort(list);
		System.out.println("====Li Values======"+li );
		
	//	Collections.sort(list, new comparatorDemo.AgeComparator());
	//	Collections.sort(list, new comparatorDemo.SalaryComparator());
		Collections.sort(list, new comparatorDemo.NameComparator());
		
		System.out.println("====After Sorting ======" );
		Iterator itr= list.iterator();
		while(itr.hasNext())
		{
			comparatorDemo element=(comparatorDemo)itr.next();
			System.out.println("Name :"+element.name +" Age :"+element.age +" Salary :"+element.salary );
		}
	}
	
	static class AgeComparator implements Comparator
	{
		public int compare(Object o1,Object o2)
		{
			comparatorDemo ob1=(comparatorDemo)o1;
			comparatorDemo ob2=(comparatorDemo)o2;
			int i =ob1.age>ob2.age?1:(ob1.age==ob2.age?0:-1);
			return i;
		}
	}
	
	static class SalaryComparator implements Comparator<comparatorDemo>
	{
		public int compare(comparatorDemo o1,comparatorDemo o2)
		{
			int i =o1.salary>o2.salary?1:(o1.salary==o2.salary?0:-1);
			return i;
		}
	}
	
	static class NameComparator implements Comparator<comparatorDemo>
	{
		public int compare(comparatorDemo o1,comparatorDemo o2)
		{
			int i = o1.name.compareTo(o2.name);
			return i;
		}
	}

}
