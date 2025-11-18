import java.util.Scanner;
class SortedArray
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
		System.out.println("------Given Array-------");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}
		System.out.println();
		System.out.println("Enter the target number:");
		int target=sc.nextInt();
		SortedArray sr=new SortedArray();
		int res=sr.findcount(ar,target);
		System.out.println("The Target number " + target + " Appears " + res + " times");
	}
	int findcount(int ar[],int target)
	{
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==target)
			{
				count++;
			}
		}return count;
	}
}