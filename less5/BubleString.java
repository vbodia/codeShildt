class BubbleString
{
	public static void main(String args[])
	{
		String nums[] = {hello, world, then, purple, java, the, best, room, clam, os};
		int a, b, t;
		System.out.println("Original array is: ");
		for(int i=0; i<nums.length; i++)
			System.out.print(" " + nums[i]);
		System.out.println("");

		for(a=1; a<nums.length; a++)
			for(b=nums.length-1; b>=a; b--)
			{
				if(nums[b-1]>nums[b])
				{
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t; 
				}
			}
			System.out.println("Sorted array is: ");
			for(int i =0; i<nums.length; i++)
				System.out.print(" " + nums[i]);
			System.out.println();
	}
}