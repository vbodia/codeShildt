class ByTwos implements Series
{
	int start;
	int val;
	int prev;

	ByTwos()
	{
		start =0;
		val = 0;
		prev = -2;
	}

	public int getNext()
	{
		prev = val;
		val += 2;
		return val;
	}

	public int getPrevious()
	{
		return prev;
	}

	public void reset()
	{
		start = 0;
		val = 0;
		prev = -2;
	}

	public void setStart(int x)
	{
		start = x;
		val = x;
		prev = x - 2;
	}
}