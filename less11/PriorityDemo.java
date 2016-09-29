class PriorityDemo
{
	public static void main(String args[])
	{
		Priority mt1 = new Priority("Higth priority");
		Priority mt2 = new Priority("Low priority");

		//zadat' priotiteti
		//potok mt1 poluchit bolee visokiy prioritet chem mt2 

		mt1.thrd.setPriority(Thread.NORM_PRIORITY +2);
		mt2.thrd.setPriority(Thread.NORM_PRIORITY -2);

		// zapustit' potok na ispolnenie 

		mt1.thrd.start();
		mt2.thrd.start();

		try
		{
			mt1.thrd.join();
			mt2.thrd.join();
		}
		catch(InterruptedException exc)
		{
			System.out.println("Main thread interrupted.");
		}

		System.out.println("\nHigth priority thread counted to " + mt1.count);
		System.out.println("\nLow priority thread counted to " + mt2.count);
	}
}