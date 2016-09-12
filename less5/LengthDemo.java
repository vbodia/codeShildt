class LengthDemo
{
	public static void main(String args[])
	{
		int i;
		
		int list[] = new int[10];
		int nums[] = {1,2,3};
		int table[][] = {{1,2,3}, {4,5}, {6,7,8,9}};

		System.out.println("Length of list is " + list.length);
		System.out.println("Length of nums is " + nums.length);
		System.out.println("Length of table is "  + table.length);

		System.out.println(" length of table[0] " + table[0].length);
		System.out.println(" length of table[1] " + table[1].length);
		System.out.println(" length of table[2] " + table[2].length);
		System.out.println();

		for(i=0; i<list.length; i++)
			list[i] = i*i;
		System.out.print("Here is list: ");
		for(i=0; i<list.length; i++)
			System.out.print(list[i] + " ");
		System.out.println();
	}
}