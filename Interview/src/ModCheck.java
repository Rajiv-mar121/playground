
public class ModCheck {

	public static void main(String[] args) {
		for(int i=0;i<20;i++)
		{
			int res=i%3;
			System.out.println("Res : "+res);
		}
		
		String str="125";
		int val=Integer.parseInt(str);
		System.out.println("ParseInt = "+val);
		
		int arry[]=new int[8];
		int a[][]=new int[3][4];
		int a1[][]=new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0}};
	
            System.out.println("Aray lenght = "+a1.length);
}
}