class Queue
{
		char q[];
		int q2[];
		int putloc, getloc;	

		Queue(int size)
		{
			q = new char[size+1];
			q2 = new int[size+1];
			putloc = getloc = 0;
		}

		void put(char ch)
		{
			if(putloc == q.length-1)
			{
				System.out.println("-Queue is full.");
				return;
			}
			putloc++;
			q[putloc] = ch;
		}

		void putint(int j)
		{
			if(putloc == q2.length-1)
			{
				System.out.println("-Queue is full.");
				return;
			}
			putloc++;
			q2[putloc] = j;
		}

		char get()
		{
			if(getloc==putloc)
			{
				System.out.println("-Queue is empty");
				return (char) 0;
			}
			getloc++;
			return q[getloc];
		}

		int getint()
		{
			if(getloc==putloc)
			{
				System.out.println("-Queue is empty");
				return (int) 0;
			}
			getloc++;
			return q2[getloc];
		}
}

class QDemo
{
	public static void main(String args[])
	{
		Queue bigQ = new Queue(35);
		Queue smallQ = new Queue(4);
		char ch;
		int i,j;

		System.out.println("Using bigQ to store the alphabet. ");
		for(i=0; i<26; i++)
			bigQ.put((char) ('A'+i));
		System.out.print("Contents of bigQ:");
		for(i=0; i<26; i++)
		{
			ch=bigQ.get();
			if(ch!=(char) 0)
				System.out.print(ch);
		}
		System.out.println("\n");

		System.out.println("Using smallQ to generate errors. ");
		for(i=0; i<4; i++)
		{
			System.out.print("Attempting to store " + (char) ('Z'-i));
				smallQ.put((char) ('Z'-i));
		    System.out.println();
		}
		System.out.println();
		System.out.print("Contents of smallQ: ");
		for(i=0; i<4; i++)
		{
			ch = smallQ.get();
			if(ch!=(char) 0)
				System.out.print(ch);
		}

		System.out.println("Using bigQ to store the numbers");
		for(i=0; i<11; i++)
			bigQ.putint(i);
		System.out.print("Contents of bigQ: ");
		for(i=0; i<9; i++)
		{
			j=bigQ.getint();
			if(j!=0)
				System.out.print(j);
		}

	}
}
