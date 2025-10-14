class Palindrome
{
	public static void main(String[] args)
	{
		int a=242;
		int b=a;
		int c=a%10; //c=2
		int d=a/10; //d=24
		int e=d%10; //e=4
		int f=d/10; //f=2
		int reverse=(100*c)+(10*e)+(1*f);
		boolean z=(a==reverse);
		
		System.out.println(z);
	}
}