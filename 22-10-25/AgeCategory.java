import java.util.Scanner;
class AgeCategory
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age<=13)
		{
			System.out.println("Child");
		}
		else if(age<=19)
		{
		System.out.println("Teenage");
		}
		else if(age<=59)
		{
			System.out.println("Adult");
		}
		else
		{
			System.out.println("Senoir");
		}
	}
}