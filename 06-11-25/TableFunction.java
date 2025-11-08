import java.util.Scanner;
class TableFunction
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Multiplication Table number");
		int table=sc.nextInt();
		TableFunction mt=new TableFunction();
		mt.multiple(table);
	}
	public void multiple (int table)
	{
		System.out.println(table+" times Table:");
		for(int i=1; i<=16;i++)
		{
			int result=table*i;
			System.out.println(table+"x"+i+"="+result);
		}
	}
}