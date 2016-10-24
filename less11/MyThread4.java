class MyThread4 implements Runnable 
{
	Thread thrd;
	TickTock ttob;

	//postroit' noviy potok

	MyThread4(String name, TickTock tt)
	{
		thrd = new Thread(this, name);
		ttob = tt;
		thrd.start(); // nachat' potok
	}

	//nachat' ispolnenie novogo potoka 

	public void run()
	{
		if(thrd.getName().compareTo("Tick") == 0)
		{
			for(int i=0; i<5; i++)
				ttob.tick(true);
				ttob.tick(false);
		}
		else
		{
			for(int i=0; i<5; i++)
				ttob.tock(true);
				ttob.tock(false);
		}
	}
} 