class SrAr
{
	public static void main(String args[])
	{
		double sum = 0;
		double arr[] = {2.4, 3.6, 14, 5.1, 41, 9.2, 6.12, 8.55, 32, 1.1, 66};

		for(int i=0; i<arr.length; i++)
		{
		sum = sum + arr[i];
		}
		System.out.println(sum/arr.length);
	}
}