import java.util.Scanner;
class Celsius
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for Celsius:");
		double c=sc.nextDouble();
		Celsius ce=new Celsius();
		double result=ce.calc(c);
		System.out.println("Fahrenheit:"+result);
	}
	public double calc(double c)
	{
		double f=(c*9)/5+32;
		return f;
	}
} 