class Deletion3
{
	public static void main(String[] args)
	{
		int ar[]={2,4,6,8,10};
		
		System.out.println("****Before Change*****");
		for(int i=0; i<ar.length;i++)
		{
		System.out.print(ar[i]+",");	
		}
		System.out.println();
		Deletion3 d=new Deletion3();
		System.out.println("******After Change******");
		d.delete(ar);
	}
	public void delete(int arr[])
	{
		arr[2]=99;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
	}
}