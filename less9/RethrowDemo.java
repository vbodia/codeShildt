class RethrowDemo
{
	public static void main(String args[])
	{
		try
		{
			ReThrow.genException();
		}
		catch(IndexOutOfBoundsException exc)
		{
			System.out.println("Fatal error - " + "program terminated.");
		}
	}
}