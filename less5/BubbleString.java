class BubbleString
{
	public static void main(String args[])
	{
		String nums[] = {"hello", "world", "then", "purple", "java", "the", "best", "room", "clam", "os"};
		int a, b;
		String t;
		int size = nums.length;
		System.out.println("Original array is: ");
		for(int i=0; i<size; i++)
			System.out.print(" " + nums[i]);
		System.out.println("");

		for(a=1; a<size; a++)
			for(b=size-1; b>=a; b--)
			{
				if(nums[b-1].compareTo(nums[b])>0)
				{
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t; 
				}
			}
			System.out.println("Sorted array is: ");
			for(int i =0; i<size; i++)
				System.out.print(" " + nums[i]);
			System.out.println();
	}
}