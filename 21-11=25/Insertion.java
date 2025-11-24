class Insertion
{
	public static void main(String[] args)
	{
		int ar[]={10,20,30,40,50};
		int pos=2;
		int element=99;
		System.out.println("-----Beore Insertion-------");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+",");
		}
		System.out.println();
		Insertion is=new Insertion();
		int res[]=is.insert(ar,pos,element);
		System.out.println("------After  Insertion-------");
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+",");
		}
	}
	public int[] insert(int arr[],int pos,int element)
	{
		int brr[]=new int[arr.length+1];
		for(int i=0;i<pos;i++)
		{
			brr[i]=arr[i];
		}	
		brr[pos]=element;
		for(int i=pos+1;i<brr.length;i++)
		{
			brr[i]=arr[i-1];
		}
		return brr;
	}
}