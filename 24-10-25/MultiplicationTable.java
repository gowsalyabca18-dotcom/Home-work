class MultiplicationTable
{
	public static void main(String[] args)
	{
		int n=5;
		int l=10;
		System.out.println("using while loop:");
		int i=1;
		while (i<=l)
		{
			int a=n*i;
			System.out.println(a);
			i++;
		}
		System.out.println("using for loop:");
		for(int j=1; j<=l; j++)
		{
			int b=n*j;
			System.out.println(b);
		}
		System.out.println("using do while loop:");
			int k=1;
			do
			{
				int c=n*k;
				System.out.println(c);
				k++;
			}while(k<=l);
	}
}