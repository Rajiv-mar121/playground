package java8;

import java.util.ArrayList;
import java.util.List;


public class LambdaDemo {

	interface lam{
		void getSchool(int x,String name);
	}
	
	interface key{
		public String keyBunch();
		
		static void test(){
			System.out.println("...Testing ....");
		}
	}
	
	interface key1{
		public String keyBunch(String sal);
	}
	interface num{
		public int getNumber(int num1,int num2);
	}
	
	public static void main(String[] args) {
		lam l1=(x1,name)->{System.out.println("Lamda SAM :"+x1+"::"+name);};
		l1.getSchool(10,"Rajiv");
		
		key k1=()->{return "Rajiv returned";};
		String s1=k1.keyBunch();
		System.out.println(s1);
		key.test();
		
		key1 k2=sal->{return "Rajiv returned";};
		
		num n=(num1,num2)->(num1+num2);
		int val=n.getNumber(78, 82);
		System.out.println(val);

// lambda Iteration		
		
		List<String> list=new ArrayList<String>();
		list.add("466");
		list.add("Wipro");list.add("Rajiv");list.add("yuhuhk");
		
		list.forEach((nqw)-> System.out.println(nqw));
		//list.forEach(value -> System.out.println(value));
		
	}

}
