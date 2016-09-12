class Vehicle
{
	int passengers;
	int fuelcup;
	int mpg;
}
class TwoVehicle
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
	range1 = minivan.fuelcup*minivan.mpg;
	range2 = sportcar.fuelcup*sportcar.mpg;
	System.out.println("Minivan can carry " + minivan.passengers + " whith a range of " + range1);	
	System.out.println("Sportcar can carry " + sportcar.passengers + " whith a range of " + range2);	
	}
}