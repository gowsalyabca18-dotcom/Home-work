import java.util.Scanner;
class AddNumbers
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number");
		int a=sc.nextInt();
		System.out.println("Enter the second Number");
		int b=sc.nextInt();
		AddNumbers ad=new AddNumbers();
		int result=ad.add(a,b);
		System.out.println("Result "+result);
	}
	public int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
}