package stringProgs;

//Java program to print all permutations of a
//given string.
public class Permutation
{
	public static void main(String[] args)
	{
		String str = "BAT";
		int n = str.length();
		Permutation permutation = new Permutation();
		permutation.permute(str, 0, n-1);
	}

	/**
	* permutation function
	* @param str string to calculate permutation for
	* @param start starting index
	* @param end end index
	*/
	private void permute(String str, int start, int end)   // 0 , 2 || 1,2 ||2,2
	{
		if (start == end)
			System.out.println(str);
		else
		{
			for (int i = start; i <= end; i++)
			{
				str = swap(str,start,i);
				permute(str, start+1, end);
				//str = swap(str,start,i);
			}
		}
	}

	/**
	* Swap Characters at position
	* @param a string value
	* @param i position 1
	* @param j position 2
	* @return swapped string
	*/
	public String swap(String a, int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}

//This code is contributed by Mihir Joshi
