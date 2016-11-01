class TrafficLightSimulator implements Runnable
{
	private Thread thrd;  //potok dlya imitacii svetofora
	private TrafficLightColor tlc;  // tekushiy cvet svetofora 
	boolean stop = false;  // ostanovka imitacii esli istinno
	boolean changed = false; // Pereklyuchenie svetofora, esli istinno

	TrafficLightSimulator(TrafficLightColor init)
	{
		tlc = init;
		thrd = new Thread(this);
		thrd.start();
	}

	TrafficLightSimulator()
	{
		tlc = TrafficLightColor.RED;
	}

	// zapusk imitacii avtomatizirovannogo svetofora 

	public void run()
	{
		while(!stop)
		{
			try
			{
				switch(tlc)
				{
					case GREEN:
						Thread.sleep(10000); //zeleniy 10 sec
						break;
					
					case YELLOW:
						Thread.sleep(2000); //joltiy 2 sec
						break;

					case RED:
						Thread.sleep(12000); //krasniy 12 sec
						break;

				}
			}
			catch(InterruptedException exc)
			{
				System.out.println(exc);
			}
			changeColor();
		}
	}

	synchronized void changeColor()
	{
		switch(tlc)
		{
			case RED:
				tlc = TrafficLightColor.GREEN;
				break;

			case YELLOW:
				tlc = TrafficLightColor.RED;
				break;

			case GREEN:
				tlc = TrafficLightColor.YELLOW;
		}
		changed = true;
		notify(); //uvedomit' o pereklyuchenii svetofora
	} 

	synchronized void waitForChange()
	{
		try
		{
			while(!changed)
				wait(); // ojidat' pereklyuchenie svetofora
			changed = false;
		}
		catch(InterruptedException exc)
		{
			System.out.println(exc);
		}
	}

	//vozvrat tekushego cveta
	TrafficLightColor getColor()
	{
		return tlc;
	}

	//prekrashenie imitacii svetofora
	void cancel()
	{
		stop = true;
	}
}