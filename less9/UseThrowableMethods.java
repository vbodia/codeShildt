class UseThrowableMethods
{
	public static void main(String args[])
	{
		try
		{
			ExcTest1.genException();
		}
		catch(ArrayIndexOutOfBoundsException exc)
		{
			System.out.println("Standart message is: ");
			System.out.println(exc);
			System.out.println("\nStack trace: ");
			exc.printStackTrace();
		}
		System.out.println("After catch statement.");
	}
}