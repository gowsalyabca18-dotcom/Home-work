class ArrayArms
{
	int armsFind(int num,int sum,int rem)
	{
		if(num<=0)
		{
			return sum;
		}
		rem=num%10;
		sum=sum+(rem*rem*rem);
		return armsFind(num/10,sum,rem);
	}
}