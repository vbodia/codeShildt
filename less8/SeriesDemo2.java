class SeriesDemo2
{
	public static void main(String args[])
	{
		ByTwos twoOb = new ByTwos();
		ByTrees treeOb = new ByTrees();

		Series ob;

		for(int i=0; i<5; i++)
		{
			ob = twoOb;
				System.out.println("Next ByTwos value is " + ob.getNext());
			ob = treeOb;
				System.out.println("Next ByTrees value is " + ob.getNext());
		}
	}
}