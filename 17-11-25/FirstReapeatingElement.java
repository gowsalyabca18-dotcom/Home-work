import java.util.Scanner;
class FirstReapeatingElement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array length:");
		int length=sc.nextInt();
		int ar[]=new int[length];
		for(int i=0;i<length;i++)
		{
			System.out.println("Enter the " + i + " index number:");
			 ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}
		System.out.println();
		FirstReapeatingElement f=new FirstReapeatingElement();
		int res=f.find(ar);
		System.out.println(res + "(Because 5 repeats first when Scanning left to right)");
	}
	int find(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					return ar[i];
				}
			}
		}return -1;
	}
}