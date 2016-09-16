class UseThreads
{
	public static void main(String args[])
	{
		System.out.println("Main thread starting.");

		MyThread mt = new MyThread("Child #1"); // potok nachinaetsa pri ego sozdanii

		for(int i=0; i<50; i++)
		{
			System.out.print(".");
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException exc)
			{
				System.out.println("Main thread interrupted.");
			}
		}
		System.out.println("Main thred ending.");
	}
}