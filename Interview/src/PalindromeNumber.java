import java.io.BufferedReader;
import java.io.InputStreamReader;


public class PalindromeNumber {

	public static void main(String[] args) throws Exception{
		
	//	int number=12345678;
	//	 String numberr="000123";
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      String line = br.readLine();
		 int number=Integer.parseInt(line);
		 System.out.println("At string start="+number);
		int dig=0;
		System.out.println("At start="+number);
		while(number!=0)
		{
			dig=dig*10;
			dig=dig+(number%10);
			number=number/10;
		}
		
		System.out.println(dig);

	}

}
