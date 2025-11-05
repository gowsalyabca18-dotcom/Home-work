class OddCountEvenCount
{
	public static void main(String[] args)
	{
		int ar[]={13,6,25,12,7,14,32,1,17};
		int oddsum=0;
		int oddcount=0;
		int evensum=0;
		int evencount=0;
		for(int i=0; i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				evensum=ar[i]+evensum;
				evencount++;
			}
			else
			{
				oddsum=ar[i]+oddsum;
				oddcount++;
			}
		}
			System.out.println("Oddsum:"+oddsum);
			System.out.println("Oddcount:"+oddcount);
			System.out.println("Evensum:"+evensum);
			System.out.println("Evencount:"+evencount);
	}
}