class IconstD implements Iconst
{
	public static void main(String args[])
	{
		int nums[] = new int[MAX];
		for(int i=MIN; i<11; i++)
		{
			if(i>=MAX)
			{
				System.out.println("Error");
			}
			else
				nums[i] = i;
				System.out.print(nums[i]);
		}
	}
}