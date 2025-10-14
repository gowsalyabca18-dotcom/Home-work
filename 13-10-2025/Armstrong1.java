class Armstrong1
{
	public static void main(String[] args)
	{
		int a=8208;
		int b=a;
		int c=a%10; //c=8
		int d=a/10; //d=820
		int e=d%10; //e=0
		int f=d/10; //f=82
		int g=f%10; //g=2
		int h=f/10; //h=8
		int sum=(h*h*h*h)+(g*g*g*g)+(e*e*e*e)+(c*c*c*c);
		boolean z=(sum==b);
		
		System.out.println(z);
	}
}