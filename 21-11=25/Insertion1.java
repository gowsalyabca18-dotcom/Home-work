class Insertion1
{
	public static void main(String[] args)
	{
		int ar[]={5,10,15,20};
		int element=25;
		System.out.println("-----Beore Insertion-------");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+",");
		}
		System.out.println();
		Insertion is=new Insertion();
		int res[]=is.insert(ar,ar.length,element);
		System.out.println("------After  Insertion-------");
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+",");
		}
	}
	public int[] insert(int arr[],int i,int element)
	{
		int brr[]=new int[arr.length+1];
		 i=arr.length;
		brr[i]=element;
		return brr;
	}
}