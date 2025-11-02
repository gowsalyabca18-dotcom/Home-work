import java.util.Scanner;
class MultyScanArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row: ");
		int row=sc.nextInt();
		System.out.print("Enter the column: ");
		int col=sc.nextInt();
		int ar[][]=new int[row][col];
		for(int i=0; i<ar.length; i++)
		{
		for(int j=0; j<ar[i].length; j++)
		{
			System.out.print("Enter the index value"+i+", "+j+":");
			ar[i][j]=sc.nextInt();
		}
			System.out.println();
		}
		for(int i=0;i<ar.length; i++)
		{
			for(int j=0; j<ar[i].length; j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}