
public class SpiralMatrix {

	int a[][]=new int[4][4];
	int array[][]={ {1,2,3,4},
					{12,13,14,5},
					{11,16,15,6},
					{10,9,8,7}};
	public static void main(String[] args) {
		SpiralMatrix obj=new SpiralMatrix();
		obj.printMatrix(4, 4);
		obj.printSpiralMatrix(4, 4);
		obj.printSpiralMatrix2(4, 4);
	}
 void printMatrix(int row,int col)
 {
	 for(int i=0;i<row;i++)
	 {
		 for(int j=0;j<col;j++)
		 {
			 System.out.print(array[i][j]+"\t");
		 }
		System.out.println();	 
	 }
	 System.out.println();	 		 
 }
 
 void printSpiralMatrix(int row,int col)
 {
	 boolean flag=false;
	 
	 for(int i=0;i<row;i++)
	 {
		if(!flag){
			 for(int j=0;j<col;j++)
			 {
				 System.out.print(array[i][j]+"\t");
			 }
		 }
		 int k=i+1;
		 if(k<row)		
		 {
			 for(int j=col-1;j>=0;j--)
			 {
				 if(k==(row-1)){
					 System.out.print(array[k][j]+"\t");
				 	 }
				 if(j==(col-1) && k<row-1)
					 System.out.print(array[k][j]+"\t");
			 }
		 }
		 flag=true;
		 
	 }
			 
 }
 
 void printSpiralMatrix2(int row,int col)
 {
	 for(int i=row-2;i>0;i--)
	 { 
		 for (int j=0;j<=col-2;j++)
		 {
			 if(i==(row-2) && j==0)
			 {
				 System.out.print(array[i][j]+"\t");
			 }
			 if(i<row-2)
			 {
				 System.out.print(array[i][j]+"\t");
			 }
		 }
		 
	 }
	 
	 for(int i=row-2;i>1;i--)
	 { 
		 for (int j=col-2;j>0;j--)
		 {
			 System.out.print(array[i][j]+"\t");
		 }
		 
	 }
 }
}
