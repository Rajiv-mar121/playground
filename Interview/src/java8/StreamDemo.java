package java8;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;


public class StreamDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("Rajiv"); list.add("B");list.add("Rajiv");list.add("kumar");
		long count=list.stream().filter(string -> !string.isEmpty()).count();
		System.out.println(count);
		
		
		List<Integer> listInteger=new ArrayList();
		listInteger.add(10);listInteger.add(20);listInteger.add(30);listInteger.add(40);
		IntSummaryStatistics stats=listInteger.stream().mapToInt((x)->x).summaryStatistics();
		System.out.println(stats);
		System.out.println(stats.getMin());
	}
}
