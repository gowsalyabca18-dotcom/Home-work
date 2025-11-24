class Deletion2
{
	public static void main(String[] args)
	{
		int ar[]={1,2,3,4,5};
		int pos=2;
		System.out.println("****Before Change*****");
		for(int i=0; i<ar.length;i++)
		{
		System.out.print(ar[i]+",");	
		}
		System.out.println();
		Deletion2 d=new Deletion2();
		System.out.println("******After Change******");
		d.delete(ar,pos);
		for(int i=0;i<ar.length-1;i++)
		{
			System.out.print(ar[i]+", ");
		}
	}
	void delete(int ar[],int pos)
	{
		for(int i=pos; i<ar.length-1;i++)
		{
			ar[i]=ar[i+1];
		}
		
	}
}