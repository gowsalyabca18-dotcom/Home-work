class ArrayMainArms
{
	public static void main(String[] args)
	{
		int num=1634;
		ArrayArms aa=new ArrayArms();
		int res=aa.armsFind(num,0,0);
		if(res==num)
		{
			System.out.println("Arms");
		}
		else
		{
			System.out.println("Not a Arms");
		}
	}
}
