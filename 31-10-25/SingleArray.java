import java.util.Scanner;
class SingleArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of Array:");
		int len=sc.nextInt();
		int ar[]=new int[len];
		for(int i=0; i<ar.length; i++)
		{
			System.out.print("Enter the value of "+ i +"value:");
			ar[i]=sc.nextInt();
		}
		for(int i=0; i<ar.length; i++)
		{
			System.out.println("The "+i+" index value of Array is :"+ ar[i]);
		}
	}
}