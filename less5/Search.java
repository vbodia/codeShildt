class Search
{
	public static void main(String args[])
	{
		int nums[] = {4,3,7,22,1,66,2,8};
		boolean found = false;
		int i;
		int val = 66;
		for(int x: nums)
		{
			if (x==val)
			{
				found = true;
				break;
			}
		}
		if(found)
			System.out.println("Value found!");		
	}
}