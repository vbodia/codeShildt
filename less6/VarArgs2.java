class VarArgs2
{
	static void vaTest(String msg, int ... v)
	{
		System.out.println(msg + v.length);
		System.out.println("Contents: ");

		for(int i=0; i<v.length; i++)
			System.out.println("args" + i + ": " + v[i]);
		System.out.println();
	}

	public static void main(String args[])
	{
		vaTest("One vararg: ", 10);
		vaTest("Three vararg: ", 1,2,3);
		vaTest("No vararg: ");
	}
}