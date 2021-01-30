package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMap {

	// filter, map, collect , count , Sorted , Comparator Sorting , Min , Max
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li= new ArrayList<Integer>();
		li.add(25);li.add(15);li.add(35);li.add(45);
		System.out.println(li);
		
		List<Integer> lessThan30 =li.stream().filter(item->item<30).collect(Collectors.toList());
		System.out.println(lessThan30);
		
		List<Integer> Added5ToListItem =li.stream().map(item->item+5).collect(Collectors.toList());
		System.out.println(Added5ToListItem);
		long count= li.stream().filter(item->item <30).count();
		System.out.println(count);
		
		List<Integer> sortedList = li.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		List<Integer> DefaultSorting = li.stream().sorted((obj1,obj2)-> obj1.compareTo(obj2)).collect(Collectors.toList());
		System.out.println(DefaultSorting);
		
		// Comparable Interface 
		List<Integer> ReverseSorting1 = li.stream().sorted((obj1,obj2)-> -obj1.compareTo(obj2)).collect(Collectors.toList());
		System.out.println(ReverseSorting1);
		
		List<Integer> ReverseSorting2 = li.stream().sorted((obj1,obj2)-> obj2.compareTo(obj1)).collect(Collectors.toList());
		System.out.println(ReverseSorting2);
		
		// Comparator Interface 
		Comparator<Integer> comp = (obj1,obj2)-> (obj1<obj2)?-1:(obj1>obj2)?1:0;
		Comparator<Integer> compReverse = (obj1,obj2)-> (obj1<obj2)?1:(obj1>obj2)?-1:0;
		List<Integer> ComparatorSorting1 = li.stream().sorted(comp).collect(Collectors.toList());
		System.out.println(ComparatorSorting1);
		
		List<Integer> ComparatorSorting2 = li.stream().sorted(compReverse).collect(Collectors.toList());
		System.out.println(ComparatorSorting2);
		
		// List String 
		List<String> list= new ArrayList<String>();
		list.add("AAA");list.add("A");list.add("AAAA");list.add("AAAAAA");list.add("BBAAAAAA");
		list.add("ZBBAAAAAA");
		Comparator<String> compString=(s1,s2)->(s1.length()<s2.length())?-1:(s1.length()>s2.length())?1:0;
		List<String> list1 = list.stream().sorted(compString).collect(Collectors.toList());
		System.out.println(list1);
		
		int getMin = li.stream().min(comp).get();
		System.out.println(getMin);
		int getMinReverse = li.stream().min(compReverse).get();
		System.out.println(getMinReverse);
		
		
		// Interview Question
		List<String> listString= new ArrayList<String>();
		listString.add("1");listString.add("2");listString.add("3");
		System.out.println(listString);
				
		List<Integer> l1=listString.stream().map(item-> Integer.parseInt(item)).collect(Collectors.toList());
		System.out.println(l1);
	}

}
