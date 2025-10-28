import java.util.Scanner;
class ElectricityBill
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of units consumed:");
		int units=sc.nextInt();
		int billamount=0;
		if(units<=100)
		{
			billamount=units*5;
			System.out.println("Electricity Bill amount:Rs."+billamount);
		}
		else if(units<=200)
		{
			billamount=units*7;
			System.out.println("Electricity Bill amount:Rs."+billamount);
		}
		else 
		{
			billamount=units*10;
			System.out.println("Electricity Bill amount:Rs."+billamount);
		}
	}
}