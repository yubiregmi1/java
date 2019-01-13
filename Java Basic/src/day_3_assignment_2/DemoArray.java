package day_3_assignment_2;

public class DemoArray {
	
	public static void main(String args[])
	{
		int firstArrayMatrix[][] = {{1,1,1},{1,1,1}};
		int secondArrayMatrix[][] = {{2,2,2},{2,2,2}};
		
		int result[][] = new int[firstArrayMatrix.length][firstArrayMatrix[0].length];
		
		//display 2 matrices
		System.out.println("Matrix 1");
		//System.out.println("Matrix 1 rows: "+ firstArrayMatrix.length);
		//System.out.println("Matrix 1 columns: "+firstArrayMatrix[0].length);
		
		for (int i = 0; i<firstArrayMatrix.length;i++)
		{
			for (int j = 0; j<firstArrayMatrix[i].length;j++)
			{
				//System.out.print("i="+i); System.out.print("j="+j);
				System.out.print(" "+firstArrayMatrix[i][j]+" ");
				result[i][j]=firstArrayMatrix[i][j]+secondArrayMatrix[i][j];
			}
			
			System.out.println();
			
		}
		
		
		System.out.println();
		System.out.println("Matrix 2");
		for (int i = 0; i<secondArrayMatrix.length;i++)
		{
			for (int j = 0; j<secondArrayMatrix[0].length;j++)
			{
				System.out.print(" "+secondArrayMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Sum of Matrices");
		for (int i = 0; i<secondArrayMatrix.length;i++)
		{
			for (int j = 0; j<secondArrayMatrix[0].length;j++)
			{
				System.out.print(" "+result[i][j]+" ");
			}
			System.out.println();
		}
	}


}
