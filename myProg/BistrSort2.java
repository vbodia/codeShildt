class BSort
{
	static void arrS(char items[])
	{
		qs(items, 0, items.length-1);
	}

	private static void qs(char items[], int left, int rigth)
	{
		int i, j;
		i = left;
		j = rigth;

		char x, y;

		x = items[(left+rigth)/2];

		do
		{
			while((items[i]<x)&&(i<rigth))
				i++;
			while((x<items[j])&&(left<j))
				j--;
			if(i<=j)
			{
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		}
		while(i<=j);
		if(i<rigth)
			qs(items, i, rigth);
		if(left<j)
			qs(items, left, j);
	}
}

class BistrSort2
{
	public static void main(String args[])
	{
		char a[] = {'c', 'b', 'a', 'd', 'e'};
		System.out.print("Original array: ");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]);
		System.out.println();

		BSort.arrS(a);
		System.out.print("Sorted array: ");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}
}