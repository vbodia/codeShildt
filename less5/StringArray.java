class StringArray
{
	public static void main(String args[])
	{
		String str[] = {"This","is","a","test."};
		System.out.println("Orginal array: " );
		for(String s: str)
			System.out.print(s + " ");
		System.out.print("\n");

		str[1] = "was";
		str[3] = "test, too!";

		System.out.println("Modified array: ");
		for(String s: str)
			System.out.print(s+ " ");

	}
}