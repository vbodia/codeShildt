class Stack
{
		char q[];
		int putloc, getloc;	

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
				put(a[i]);
			}
		}

		void put(char ch)
		{
			if(putloc == q.length)
			{
				System.out.println("-Stack is full.");
				return;
			}
			q[putloc] = ch;
			putloc++;
		}

		char get()
		{
			if(getloc==putloc)
			{
				System.out.println("-Stack is empty");
				return (char) 0;
			}
			putloc--;
			return q[putloc];
		}
}

class StDemo
{
	public static void main(String args[])
	{
		Stack stk1 = new Stack(10);
		char name[] = {'T','o','m'};
		Stack stk2 = new Stack(name);
		char ch;
		int i;

		for(i=0; i<10; i++)
			stk1.put((char)('A'+i));

		Stack stk3 = new Stack(stk1);
		System.out.print("Contents of stk1: ");
		for(i=0; i<10; i++)
		{
			ch = stk1.get();
			System.out.print(ch);
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
		System.out.println("\n");

	}
}
