class ElectricityArray
{
	public static void main(String[] args)
	{
		double consume[]={320.5,289.8,310.2,280.6,299.9};
		System.out.println("Electricity units consumption of five months:");
		for(int i=0; i<consume.length;i++)
		{
			System.out.println("Monthly units:"+consume[i]);
		}
	}
}