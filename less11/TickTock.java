class TickTock
{
	String state; // soderjit svedeniya o sostoyanii chasov 

	synchronized void tick(boolean running)
	{
		if(!running)
		{
			state = "ticked";
			notify(); // uvedomit' ojidayushie potoki
			return;
		}
		
		try
		{
		System.out.print("Tick ");
		Thread.sleep(1000);

		state = "ticked"; // ustanovit' tekushee sostoyanie posle takta tick
		notify(); // metod tick() uvedomlyaet metod tock()

			while(!state.equals("tocked"))
				wait(); // metod tick() ojidaet zaversheniya metoda tock().
			
		}
		catch(InterruptedException exc)
		{
			System.out.println("Thread interrupted.");
		}
	} 

	synchronized void tock(boolean running)
	{
		if(!running)
		{
			state = "tocked"; 
			notify(); // uvedomit' ojidayushie potoki 
			return;
		}
		
		 

		try
		{
		System.out.print("Tock ");
		Thread.sleep(1000);
		
		state = "tocked"; // ustanovit' tekushee sostoyanie posle takta tak
		notify(); // metod tock() uvedomlyaet metod tick() o vozmojnosti prodoljeniya
			while(!state.equals("ticked"))
				wait(); // metod tock() ojidaet zaversheniya metoda tick()
			
		}
		catch(InterruptedException exc)
		{
			System.out.println("Thread interrupted.");
		}
	}
}