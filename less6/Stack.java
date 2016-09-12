class Stack 
{
		private char q[];
		private int putloc, getloc;	

		Stack(int size)
		{
			q = new char[size+1];
			putloc = getloc = 0;
		}

		Stack(Stack ob)
		{
			putloc = ob.putloc;
			q = new char[ob.q.length];

			for(int i=0; i<putloc; i++)
				q[i] = ob.q[i];
		}

		Stack(char a[])
		{
			q = new char[a.length];

			for(int i=0; i<a.length; i++)
			{
				try
				{
					put(a[i]);
				}
				catch(StackFullException exc)
				{
					System.out.println(exc);
				}
			}
		}

		void put(char ch) throws StackFullException
		{
			if(putloc == q.length-1)
				throw new StackFullException(q.length);
			putloc++;
			q[putloc] = ch;
		}

		char get() throws StackEmptyException
		{
			if(getloc==putloc)
				throw new StackEmptyException();
			getloc++;
			return q[getloc];
		}
}

class StackFullException extends Exception
{
	private int size;
	StackFullException(int s)
	{
		size = s;
	}

	public String toString()
	{
		return "\nStack is full. Max size is: " + size;
	}
} 

class StackEmptyException extends Exception
{
	public String toString()
	{
		return "\nStack is empty";
	} 
}

class SDemo
{
	public static void main(String args[])
	{
		Stack stk1 = new Stack(10);
		char name[] = {'T','o','m'};
		Stack stk2 = new Stack(name);
		char ch;
		int i;

		Stack stk3 = new Stack(stk1);
		System.out.print("Contents of stk1: ");
		try
		{
			for(i=0; i<10; i++)
			{
				ch = stk1.get();
				System.out.print(ch);
			}
		}
		catch(StackFullException exc)
		{
			System.out.println(exc);
		}

		System.out.println("\n");

		System.out.print("Contents of stk2: ");
		for(i=0; i<3; i++)
		{
			ch = stk2.get();
			System.out.print(ch);
		}

		System.out.println("\n");

		System.out.print("Contents of stk3: ");
		for(i=0; i<10; i++)
		{
			ch = stk3.get();
			System.out.print(ch);
		}

	}
}
