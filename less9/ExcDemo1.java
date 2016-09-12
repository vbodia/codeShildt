class ExcDemo1
{
	public static void main(String args[])
	{
		int nums[] = new int[5];

		try
		{
			System.out.println("Before exception is generated.");

			nums[3] = 10;

			System.out.println("This won't to displayed.");
		}
		catch(ArrayIndexOutOfBoundsException exc)
		{
			System.out.println("Index out-of-bounds.");
		}
		System.out.println("After catch statement.");
	}
}