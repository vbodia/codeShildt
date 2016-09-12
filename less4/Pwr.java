class Pwr
{
	double b;
	int e;
	double va1;

	Pwr(double base, int exp)
	{
		b = base;
		e = exp;
		va1 = 1;

		if (exp == 0)
			return;
		for (; exp>0; exp--)
			va1 = va1*base;

	}
	double get_pwr()
	{
		return va1;
	}
}

class DemoPwr
{
	public static void main(String args[])
	{
		Pwr x = new Pwr(4.0, 2);
		Pwr y = new Pwr(2.5, 1);
		Pwr z = new Pwr(5.7, 0);

		System.out.println(x.b + " raised t othe " + x.e +  " power is " x.get_pwr());
		System.out.println(y.b + " raised t othe " + y.e +  " power is " y.get_pwr());
		System.out.println(z.b + " raised t othe " + z.e +  " power is " z.get_pwr());
	}
}