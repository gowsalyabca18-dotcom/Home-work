class Armstrong
{
	public static void main(String[] args)
	{
		int a=370;
		int b=a;
		int c=a%10; //c=0
		int d=a/10; //d=37
		int e=d%10; //e=7
		int f=d/10; //f=3
		int g=(f*f*f)+(e*e*e)+(c*c*c);
		boolean h=(g==b);
		
		System.out.println(h);
	}
}