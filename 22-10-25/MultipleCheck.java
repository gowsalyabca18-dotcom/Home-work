import java.util.Scanner;
class MultipleCheck
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		if(num%3==0 && num%7==0)
		{
		System.out.println(num+"is a multiple of 3 and 7");	
		}
		else if(num%3==0)
		{
		System.out.println(num+"is a multiple of 3");	
		}
		else if(num%7==0)
		{
		System.out.println(num+"is a multiple of 7");	
		}
		else
		{
			System.out.println(num+"is NOT a multiple of 3 and 7");
		}
	}
}