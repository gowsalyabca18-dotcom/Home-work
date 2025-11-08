import java.util.Scanner;
class Square
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Square s=new Square();
		int result=s.value(n);
		System.out.println(n+"Square value ="+result);
	}
	public int value(int n)
	{
		int sum=n*n;
		return sum;
	}
}