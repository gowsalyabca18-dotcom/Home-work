class ElementUpdate
{
	public static void main(String[] args)
	{
		int ar[]={11,22,33,44,55};
		
		System.out.println("****Before Change*****");
		for(int i=0; i<ar.length;i++)
		{
		System.out.print(ar[i]+",");	
		}
		System.out.println();
		 ElementUpdate d=new ElementUpdate();
		System.out.println("******After Change******");
		d.delete(ar);
	}
	public void delete(int arr[])
	{
		arr[2]=333;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
	}
}