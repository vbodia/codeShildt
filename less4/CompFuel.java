class Vehicle
{
	int passengers;
	int fuelcup;
	int mpg;
	int range()
	{
		return mpg*fuelcup;
	}

	double fuelneeded(int miles)
	{
		return (double) miles/mpg; 
	}
}


class CompFuel
{
	public static void main(String args[])
	{
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();
		double gallons;
		int dist = 252;

		minivan.passengers = 7;
		minivan.fuelcup = 14;
		minivan.mpg = 21;

		sportcar.passengers = 2;
		sportcar.fuelcup = 14;
		sportcar.mpg = 12;

		gallons = minivan.fuelneeded(dist);
		System.out.println("To go " + dist + "miles minivan needed " + gallons + " gallons of fuel.");
		gallons = sportcar.fuelneeded(dist);
		System.out.println("To go " + dist + "miles sportcar needed " + gallons + " gallons of fuel. ");
	}
}