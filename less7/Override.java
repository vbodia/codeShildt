class A
{
	int i;
	int j;

	A(int a, int b)
	{
		i = a;
		j = b;
	}

	void show()
	{
		System.out.println("i " + i + " " + "j " +j);
	}
}

class B extends A
{
	private int k;
	B(int a, int b, int c)
	{
		super(a,b);
		k = c;
	}

	void show(String msg)
	{
		System.out.println(msg + k);
	}
} 

class Override
{
	public static void main(String args[])
	{
		B ob1 = new B(1,2,3);
		ob1.show("This is k: ");
		ob1.show();
	}
}