class Pattern3
{
	public static void main(String[] args)
	{
		for(int i=1; i<5; i++)
		{
			for(int k=3; k-i>=0; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=((2*i)-1); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=3; i>=1; i--)
		{
			for(int k=3; k-i>=0; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=((2*i)-1); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}