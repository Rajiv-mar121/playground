package lambda;

import java.util.ArrayList;
import java.util.List;

public class lambdaDemo {

	public static void main(String[] args) {

		mylamba lam = () -> System.out.println("Hello World");
		AddLamda addLamda = (int a, int b) -> a + b;   // argument data type is optional here 
		ListInter listInter = (a, b, c) -> {
			if (c.size() > 0) {
				return a * b;
			} else {
				return a+ b;
			}
		};

		Anonymus anonymus = new Anonymus() {
			public void perform() {
				System.out.println("Inside Perform ");
			}
		};
		
		addLamda.add(3, 5);
		anonymus.perform();
		listInter.add(2, 3, new ArrayList());
		lam.foo();
	}

	interface mylamba {
		void foo();
	}

	interface AddLamda {
		int add(int a, int b);
	}

	interface ListInter {
		int add(int a, int b, List li);
	}

	interface Anonymus {
		void perform();
	}
}
