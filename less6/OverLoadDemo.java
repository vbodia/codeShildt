class OverLoad
{
	void ovlDemo()
	{
		System.out.println("No parameters ");
	}

	void ovlDemo(int a)
	{
		System.out.println("One parameters " + a);
	}

	int ovlDemo(int a, int b)
	{
		System.out.println("Two parameters " + a + " " +b);
		return a+b;
	}

	double ovlDemo(double a, double b)
	{
		System.out.println("Two double parameters " + a +" "+ b);
		return a+b;
	}
}

class OverLoadDemo
{
	public static void main(String args[])
	{
		OverLoad ob = new OverLoad();
		int resI;
		double resD;

		ob.ovlDemo();
		System.out.println();
		ob.ovlDemo(2);
		System.out.println();
		resI = ob.ovlDemo(4,6);
		System.out.print("Result of ob.ovlDemo(4,6):" + resI);
		resD = ob.ovlDemo(1.1,2.32);
		System.out.println("Result of ob.ovlDemo(1.1,2.32)" + resD);
	}
}