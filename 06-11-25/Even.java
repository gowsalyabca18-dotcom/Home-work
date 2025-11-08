import java.util.Scanner;
class Even
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Even e=new Even();
		e.check(n);		
	}
	public void check(int n)
	{
		if( n%2==0)
		{
			System.out.println(n+" is Even");
		}
		else
		{
			System.out.println(n+" is odd");
		}
	}
}