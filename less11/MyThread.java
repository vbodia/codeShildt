class MyThread implements Runnable
{
	Thread thrd; // v permennoy thrd hranitsa ssilka na potok

	MyThread(String name)
	{
		thrd = new Thread(this, name); //potok imenuetsa pri ego sozdanii
		thrd.start(); // nachalo ispolneniya
	}

	public void run()
	{
		System.out.println(thrd.getName() + " starting."); //nachalo ispolneniya ptokov
		try
		{
			for(int count=0; count < 10; count++)
			{
				Thread.sleep(400);
				System.out.println("In " + thrd.getName() + ", count is " + count);
			}
		}
		catch(InterruptedException exc)
		{
			System.out.println(thrd.getName() + "interrupted.");
		}
		System.out.println(thrd.getName() + " terminating.");
	}
}