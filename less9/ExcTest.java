class ExcTest
{
	public static void genException()
	{
		int nums[] = new int[5];
		System.out.println("Before exception is generate.");

		nums[6] = 10;

		System.out.println("this won't to displayed.");
	}
}