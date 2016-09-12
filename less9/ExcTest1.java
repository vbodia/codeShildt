class ExcTest1
{
	static void genException()
	{
		int nums[] = new int[5];

		System.out.println("Before exception is generated.");

		nums[7] = 10;

		System.out.println("This won't to displayed.");
	}
}
