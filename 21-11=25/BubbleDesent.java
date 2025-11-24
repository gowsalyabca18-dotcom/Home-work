class BubbleDesent
{
		public static void main (String[] args)
	{
		int ar[]={5,1,4,2,8};
		BubbleDesent bd=new BubbleDesent();
		bd.bub(ar);
		System.out.println("After Bubble sorting of the Array: ");
		for(int i=ar.length-1;i>=0;i++)
		{
			System.out.print(ar[i]+",");
		}
	}
	public void bub(int ar[])
	{
		for(int i=0; i<ar.length-1;i++)
		{
			for(int j=0;j<(ar.length-1)-i;j++)
			{
			if(ar[j]>ar[j+1])
			{
				int temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
			}
			}
		}
	}
}