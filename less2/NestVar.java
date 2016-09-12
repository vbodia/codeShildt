class NestVar
{
	public static void main(String args[])
	{
		int count;
		for (count = 0; count < 2; count++)
		{
			System.out.println("This is count " + count);
			int count;
			for (count = 0 ; count<2; count++)
				System.out.println("This programm error!");
		}
	}
}