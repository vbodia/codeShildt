class Suspend
{
	public static void main(String args[])
	{
		MyThread5 ob1 = new MyThread5("My Thread");

		try
		{
			Thread.sleep(1000); // pozvolit' potoku ob nachat' ispolnennie 

			ob1.mysuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);

			ob1.myresume();
			System.out.println("Resuming thread.");
			Thread.sleep(1000);

			ob1.mysuspend();
			System.out.println("Suspending thread.");
			Thread.sleep(1000);

			ob1.myresume();
			System.out.println("Resuming thread.");
			Thread.sleep(1000);

			ob1.mysuspend();
			System.out.println("Stoping thread.");
			ob1.mystop();
		}
		catch(InterruptedException exc)
		{
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}
}