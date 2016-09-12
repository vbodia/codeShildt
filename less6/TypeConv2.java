class OverLoad3
{
	void f(byte x)
	{
		System.out.print("Inside f(byte): " + x);
	}

	void f(int x)
	{
		System.out.println("Inside f(int): " + x);
	}

	void f(double x)
	{
		System.out.println("Inside f(double): " + x);
	}
}

class TypeConv2
{
	public static void main(String args[])
	{
		OverLoad3 ob = new OverLoad3();
		int i = 10;
		double d = 10.1;
		byte b = 99;
		short s = 10;
		float f = 11.5f;

		ob.f(i);
		ob.f(d);
		ob.f(b);
		ob.f(s);
		ob.f(f);
	}
}