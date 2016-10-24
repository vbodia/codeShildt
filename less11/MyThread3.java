class MyThread3 implements Runnable 
{
	Thread thrd;
	static SumArray sa = new SumArray();
	int a[];
	int answer;

	//postroit' noviy potok

	MyThread3(String name, int nums[])
	{
		thrd = new Thread(this,name);
		a = nums;
		thrd.start(); //nachat' potok
	}

	//nachat' ispolnenie novogo potoka

	public void run()
	{
		int sum;

		System.out.println(thrd.getName() + " starting.");

		//zdes' dizvani metodi sumArray() dlya ob'ekta sa sinhronizirovani

		synchronized(sa)
		{
			answer = sa.sumArray(a);
		}

		System.out.println("Sum for " + thrd.getName() + " is " + answer);
		System.out.println(thrd.getName() + " terminating.");
	}
}