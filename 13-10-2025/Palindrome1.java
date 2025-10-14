class Palindrome1
{
	public static void main(String[] args)
	{
		int a=3443;
		int b=a;
		int c=a%10; //c=3
		int d=a/10; //d=344
		int e=d%10; //e=4
		int f=d/10; //f=34
		int g=f%10; //g=4
		int h=f/10; //h=3
		int reverse=(c*1000)+(e*100)+(g*10)+(h*1);
		boolean z=(reverse==b);
		
		System.out.println(z);
	}
}