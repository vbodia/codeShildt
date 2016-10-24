class MyThread2 implements Runnable
{
	Thread thrd;
	static SumArray sa = new SumArray();
	int a[];
	int answer;

	//postroit' noviy potok

	MyThread2(String name, int nums[])
	{
		thrd = new Thread(this, name);
		a = nums;
		thrd.start();
	}

	//nachat' ispolnenie novogo potoka 

	public void run()
	{
		int sum;
		System.out.println(thrd.getName() + " starting ");
		answer = sa.sumArray(a);
		System.out.println("Sum for " + thrd.getName() + " is " + answer);
		System.out.println(thrd.getName() + " terminating.");
	}
} 