import java.util.Scanner;
class SimpleInterest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principle amount:");
		double p=sc.nextInt();
		System.out.println("Enter the days(in month):");
		double n=sc.nextInt();
		System.out.println("Enter the Rate of Interest:");
		double r=sc.nextInt();
		SimpleInterest si=new SimpleInterest();
		double result=si.calc(p,n,r);
		System.out.println("Simple Interest:"+result);
	}
	public double calc(double p,double n,double r)
	{
		double si=(p*r*n)/100;
		return si;
	}
}