
public class Gcd {

	static int gcd(int a, int b) {
		// Everything divides 0
		if (a == 0 || b == 0)
			return 0;

		// base case
		if (a == b)
			return a;

		// a is greater
		if (a > b)
			return gcd(a - b, b);
		return gcd(a, b - a);
	}

	// Driver method
	public static void main(String[] args) {
		int k = 2;
		int aray[] = { 2, 3, 4, 5, 6 };
		for (int i = 0; i < aray.length; i++) {
			for (int j = i + 1; j < aray.length; j++) {
				int mul = aray[i] * aray[j];
				int gcd = gcd(mul, k);
				if (gcd == 1) {
					System.out.println("Product of two numbers :" + mul + " =" + aray[i] + "*" + aray[j]);
				}
			}
		}
	}
}
