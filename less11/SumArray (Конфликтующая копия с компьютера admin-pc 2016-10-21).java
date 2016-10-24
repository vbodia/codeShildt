class SumArray
{
	private int sum;

	//metod sumArray() sinhronizirovan

	synchronized int sumArray(int nums[])
	{
		sum = 0;

		for(int i=0; i<nums.length; i++)
		{
			sum += nums[i];
			System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
			try
			{
				Thread.sleep(10); // razreshit' pereklyuchenie zadach
			}
			catch(InterruptedException exc)
			{
				System.out.println("Main thread interrupted.");
			}
		}
		return sum;
	}
}