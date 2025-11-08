import java.util.Scanner;
class FindMax
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		FindMax f=new FindMax();
		int result=f.find(a,b);
		System.out.println("The largest number is: "+result);
	}
	public int find(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;	
		}
	}
}