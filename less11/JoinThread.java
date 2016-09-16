class JoinThread
{
	public static void main(String args[])
	{
		System.out.println("Main thread starting.");
		MyThread md1 = new MyThread("Child #1");
		MyThread md2 = new MyThread("Child #2");
		MyThread md3 = new MyThread("Child #3");

		try
		{
			md1.thrd.join();
			System.out.println("Child #1 join");
			md2.thrd.join();
			System.out.println("Child #2 join");
			md3.thrd.join();
			System.out.println("Child #3 join");
		}
		catch(InterruptedException exc)
		{
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread ending");
	}
}