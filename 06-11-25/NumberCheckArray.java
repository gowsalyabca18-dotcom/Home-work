class NumberCheckArray
{
	public static void main(String[] args)
	{
		int ar[]={12,18,-2,-36,45,-21,1};
		NumberCheckArray nc=new NumberCheckArray();
		nc.check(ar);
	}
	public void check(int arr[])
		{
			System.out.println("Positive Numbers");
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>0)
				{
					System.out.println(arr[i]);
				}
			}
			System.out.println("Negative Numbers");
			for(int i=0; i<arr.length;i++)
			{	
				if(arr[i]<0)
				{
					System.out.println(arr[i]);
				}
			}
		}
}