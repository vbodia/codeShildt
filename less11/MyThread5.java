class MyThread5 implements Runnable
{
	Thread thrd;
	volatile boolean suspended;
	volatile boolean stopped;

	MyThread5(String name)
	{
		thrd = new Thread(this, name);
		suspended = false;
		stopped = false;
		thrd.start();
	}

	// tochka vhoda v potok 

	public void run()
	{
		System.out.println(thrd.getName() + " starting.");
		try
		{
			for(int i=1; i<1000; i++)
			{
				System.out.print(i + " ");
				if(i%10 == 0)
				{
					System.out.println();
					Thread.sleep(250);
				}
				// Dlya proverki usloviy priostanovki i ostanovki potoka 
				// ispolzuetsa sleduyushiy sinhronizirovanniy blok.
				synchronized(this)
				{
					while(suspended)
					{
						wait();
					}
					if(stopped)
						break;
				}
			}
		}
		catch(InterruptedException exc)
		{
			System.out.println(thrd.getName() + " interrupted.");
		}
		System.out.println(thrd.getName() + " exiting.");
	}
		
	// ostanovit' potok

	synchronized void mystop()
	{
		stopped = true;
		// sleduyushie operatory obespechivayut polnuyu ostanovku priostanovlennogo potoka
		suspended = false;
		notify();
	}
	
	// priostanovit' potok

	synchronized void mysuspend()
	{
		suspended = true;
	}

	// vozobnovit' potok

	synchronized void myresume()
	{
		suspended = false;
		notify();
	}
	
}