import java.util.Scanner;
class SortedBinary
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
		SortedBinary sb=new SortedBinary();
		String res=sb.findFirst(ar,target);
		System.out.println("the target number " + target + " apears " + res + "index");
		String res1=sb.findlast(ar,target);
		System.out.println("the target number " + target + " apears " + res1 + "index");
		
	}
	String findFirst(int ar[],int target)
	{
		int start=0;
		int end=ar.length-1;
		int mid=0;
		while(start<=end)
		{
			 mid=(start+end)/2;
			if(ar[mid]==target)
			{
				String st=Integer.toString(mid);
				return st;
			}
		else if(ar[mid]>=target)
		{
			end=mid-1;
		}
		else if(ar[mid]<=target)
		{
			start=mid+1;
		}
		
		}return "Invalid";
	}
	String findlast(int ar[],int target)
	{
		int start=0;
		int end=ar.length-1;
		int mid=0;
		while(start<=end)
		{
			 mid=(start+end)/2;
			if(ar[mid]==target)
			{
				String st=Integer.toString(mid);
				return st;
			}
		else if(ar[mid]>=target)
		{
			end=mid-1;
		}
		else if(ar[mid]<=target)
		{
			start=mid+1;
		}
		}return "Invalid";
	}		
}