class WhileLoop
{
	public static void main(String[] args)
	{
		System.out.println("Using While Loop:");
		int i=1;
		while(i<=15)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("Using for Loop:");
		for (int j=1; j<=15;j++)
		{
			System.out.println(j);
		}
		System.out.println("Using do While Loop:");
		int k=1;
		do
		{
			System.out.println(k);
			k++;
		}while(k<=15);
		
	}
}