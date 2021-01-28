package stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StreamDemo s1=new StreamDemo();
		//s1.StreamApiTest();
		s1.test();
		System.out.println("In Main after call");
	}

	public void test() 
	{
		try {
			StreamApiTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("In test "+e.getMessage());
			//e.printStackTrace();
		}
	}
	public void StreamApiTest()
	{
		Set<String> set=new HashSet<String>();
		set.add("Rajiv");set.add("Dhunno");set.add("MicroFocus");set.add("Dhrubo");
		
		set.stream().filter(str-> str.startsWith("Dh")||str.startsWith("Mic")).forEach(str->System.out.println(str));;
	//	set.stream().filter(str-> str.startsWith("Dh")).forEach(throws new Exception());;
		
		boolean b=set.stream().filter(str-> str.startsWith("Dh")||str.startsWith("Mic")).collect(Collectors.toList()).contains("Dhrubo");;
		System.out.println(b);
		String reduced2 = set.stream()
		        .reduce((acc, item) -> acc + " " + item)
		        .get();
		System.out.println(reduced2);
		Long vl=set.stream().filter(str-> str.startsWith("Dh")||str.startsWith("Mic")).count();
		System.out.println(vl);
		if(vl==3)
		{
			System.out.println("All 3 found");
		}
		//filter(str-> str.startsWith("Dh")||str.startsWith("Mic"))
		Set<String> so=new HashSet<String>();
		so.add("Rajiv");so.add("Dhunno");so.add("MicroFocus");so.add("Dhrubo");
		so.stream().forEach(str->
		{
			try{
				if(str.equalsIgnoreCase("Dhunno"))
					//throw new ArithmeticException(str);
					throw new Exception("Execute Exception");
				System.out.println(str);
			}
			catch(Exception e){
				System.out.println("Exception Caught -->"+e.getMessage());
				throw new RuntimeException(e.getMessage());
			}
			
				
		});
	}
	//https://www.geeksforgeeks.org/stream-in-java/
}
