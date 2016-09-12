class ExcDemo5
{
	public static void main(String args[])
	{
		int arr1[] = {4,8,16,32,64,128,256,512};
		int arr2[] = {2,0,4,4,0,8};

		for(int i=0; i<arr1.length; i++)
		{
			try
			{
				System.out.println(arr1[i] + " / " + arr2[i] + " is " + arr1[i]/arr2[i]);
			}
			catch(IndexOutOfBoundsException exc)
			{
				System.out.println("Index out-of-bounds.");
			}
			catch(Exception exc)
			{
				System.out.println("Some exception occurred.");
			}
		}
	}
}