class Vehicle
{
	int passengers;
	int fuelcup;
	int mpg;
	void range()
	{
		System.out.println("Range is " + fuelcup*mpg);
	}
}
class AddMath    
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
	
	System.out.println("Minivan can carry " + minivan.passengers + ". ");
	minivan.range();	
	System.out.println("Sportcar can carry " + sportcar.passengers + ". ");
	sportcar.range();	
	}
}