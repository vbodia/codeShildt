class Priority implements Runnable 
{
	int count;
	Thread thrd;

	static boolean stop = false;
	static String currentName;

	// Postroenie novogo potoka.

	Priority(String name)
	{
		thrd = new Thread(this, name);
		count = 0;
		currentName = name;
	}  

	// nachat' ispolnenie novogo potoka 

	public void run()
	{
		System.out.println(thrd.getName() + " starting.");
		do 
		{
			count++;
			if(currentName.compareTo(thrd.getName()) !=0)
			{
				currentName = thrd.getName();
				System.out.println("In " + currentName);
			}

			//Perviy je potok v kotorom dostigaetsa znachenie 10000000, zavershaet ostalnie potoki 
		}
		while(stop == false && count < 10000000);
		stop = true;
		System.out.println("\n" + thrd.getName() + "terminating.");
	}
}