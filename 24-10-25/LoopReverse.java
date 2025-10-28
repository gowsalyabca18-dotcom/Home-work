class LoopReverse
{
	public static void main(String[] args)
	{
	 System.out.println("Using while loop:");
	 int i=10;
	 while (i>=1)
	 {
		System.out.println(i);
			i--;
	 }
	 System.out.println("Using for loop:");
	 for(int j=10;j>=1;j--)
	 {
		 System.out.println(j);
	 }
	 System.out.println("Using do while loop:");
	 int k=10;
	 do
	 {
		 System.out.println(k);
		 k--;
	 }while(k>=1);
	}
}