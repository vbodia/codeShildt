class Vehicle
{
	int passengers;
	int fuelcup;
	int mpg;
	int range()
	{
		return fuelcup*mpg;
	}
}
class RetMath   
{
	public static void main(String[] args) 
	{
	Vehicle minivan = new Vehicle();
	Vehicle sportcar = new Vehicle();
	
	int range1, range2;
	
	minivan.passengers = 7;
	minivan.fuelcup = 16;
	minivan.mpg = 21;
	
	sportcar.passengers = 2;
	sportcar.fuelcup = 14;
	sportcar.mpg = 12;

	
	
	System.out.println("Minivan can carry " + minivan.passengers + " with range of " + minivan.range() + " Miles");
	System.out.println("Sportcar can carry " + sportcar.passengers + " with range of " + sportcar.range() + " Miles");
	}
}