package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;



/**
 * @author Rajiv
 *
 */
public class FunctionalInterfaces {

	/**
	 * @param args
	 */
	public static void main (String args[]) {
		
		BiConsumer<String, String> bi = (x, y)-> {System.out.println(x + " and " + y);};
		
		bi.accept("abc", "xyz");
		
		List<Integer> li = new ArrayList();
		li.add(1);
		Predicate<List<Integer>> predict = (list)-> li.isEmpty();
		if (predict.test(li)) {
			System.out.println("Paassed");
		}
		///////////////////////////
		List<Integer> list = new ArrayList();
		List<Double> list1 = new ArrayList(); list1.add(12.3); list1.add(12.3);list1.add(14.3);
		Function<List<Integer>,Integer> fun=FunctionalInterfaces::addist;
		
		Function<List<Double>,String> fun1=FunctionalInterfaces::addist1;
		list.add(45);list.add(65);list.add(55);list.add(50);
		System.out.println("Fun Apply Class :"+fun.apply(list).getClass());
		System.out.println("Fun class "+fun.getClass());
		
				int res=fun.apply(list);
		System.out.println("Sum "+res);
		
		String res1=fun1.apply(list1);
		System.out.println("Sum in string "+res1);
	}
	
	static Integer addist(List<Integer> list)
	{
		return list.stream().mapToInt(Integer::intValue).sum();
	}
	
	static String addist1(List<Double> list)
	{
		return String.valueOf((list.stream().mapToDouble(Double::doubleValue).sum()));
	}
}
